(function() {
	var calcSS3 = document.getElementById("calc"), disp = calcSS3.children[0].children[0], radDeg = calcSS3.children[0].children[1], smallCalc = calcSS3.children[0].children[2], hold = calcSS3.children[0].children[3], lnButton = calcSS3.children[0].children[4], secondKeys = calcSS3.children[1].children, pressedKey, frozenKey, second = false, bracketKey, brackets = 0, cal = [], deg = false, memory = 0, resBuffer = "0", bigger = false, ln = 0, buffStr = [], sav = [
			"second", "deg", "memory", "buffStr", "resBuffer" ], keyBoard = {}, _PI = Math.PI, degC = _PI / 180, radC = 180 / _PI, secondLayer = [
			[ "sin", "cos", "tan", "ln", "sinh", "cosh", "tanh",
					"e<sup>x</sup>" ],
			[ "sin<sup>-1</sup>", "cos<sup>-1</sup>", "tan<sup>-1</sup>",
					"log<sub>2</sub>", "sinh<sup>-1</sup>",
					"cosh<sup>-1</sup>", "tanh<sup>-1</sup>", "2<sup>x</sup>" ] ], hiddenCopy = calcSS3
			.getElementsByTagName("textarea")[0], keyDown = function(e, obj) {
		var e = e || window.event, targ = obj || e.target.parentNode, m = 0, key;
		if (!targ || !targ.className) {
			return false
		}
		while (targ.className && targ.className.indexOf("key") == 0) {
			key = targ;
			targ = targ.parentNode;
			m++
		}
		if (m == 0 || key == pressedKey) {
			return false
		}
		keyUp();
		pressedKey = key;
		key.className = key.className + " press";
		key.firstChild.className = key.firstChild.className + " press-inlay";
		return false
	}, keyUp = function() {
		if (!pressedKey || (pressedKey == second)) {
			return
		}
		pressedKey.className = pressedKey.className.replace(/ press| second/g,
				"");
		pressedKey.firstChild.className = pressedKey.firstChild.className
				.replace(/ press-inlay| second-inlay/g, "");
		pressedKey = null
	}, freezeKey = function(key, del) {
		var obj = (!del || del != 2) ? frozenKey : key;
		if (obj) {
			obj.className = obj.className.replace(" active", "")
		}
		if (!del) {
			key.className = key.className + " active";
			frozenKey = key
		}
		return obj
	}, display = function(val, inp) {
		var rgx = /(\d+)(\d{3})/, comma = val.match(/\./), tmp, valAbs = Math
				.abs(+val), fs = 45, dsp = disp.style, dspP = disp.parentNode.style;
		if (val.match(/NaN|Inf|Error/)) {
			tmp = "Error"
		} else {
			resBuffer = val;
			if (valAbs >= 10000000000000000) {
				val = (+val).toExponential(13) + ""
			}
			if (!bigger && ((!inp || inp == "+/–") && valAbs != 0)) {
				val = (+val).toPrecision(9)
			}
			tmp = (val + "").split(".");
			if (tmp[1]) {
				tmp[2] = tmp[1].split("e");
				if (tmp[2][1]) {
					tmp[1] = tmp[2][0]
				}
				if (!inp || inp == "+/–") {
					tmp[1] = (((+("1." + tmp[1])).toPrecision(bigger ? 16
							: tmp[2][1] ? 7 : 9)) + "");
					if (tmp[1] >= 2)
						tmp[0] = (+tmp[0] + 1) + "";
					tmp[1] = tmp[1].substr(2).replace(/0+$/, "")
				}
			}
			while (rgx.test(tmp[0])) {
				tmp[0] = tmp[0].replace(rgx, "$1 $2")
			}
			tmp = tmp[0]
					+ ((tmp[1] || comma) ? "." + tmp[1] : "").replace(
							".undefined", "").replace(inp ? "" : /\.$/, "")
					+ (tmp[2] && tmp[2][1] ? "e" + tmp[2][1] : "")
		}
		if (ln) {
			tmp = tmp.replace(/\./g, "#").replace(/\s/g,
					ln == 1 ? " " : ln == 2 ? "," : ".").replace(/#/g,
					ln == 2 ? "." : ",")
		}
		disp.textContent = tmp;
		dsp.fontSize = "45px";
		dspP.lineHeight = "61px";
		while (disp.offsetWidth > disp.parentNode.offsetWidth
				- (bigger ? 40 : 30)) {
			dsp.fontSize = (fs--) + "px";
			dspP.lineHeight = (fs + 18) + "px"
		}
	}, calculator = function() {
		var rank = {
			"=" : 0,
			"+" : 1,
			"-" : 1,
			"/" : 2,
			"*" : 2,
			yx : 3,
			"x√y" : 3,
			EE : 3
		}, stack = [], d = 0, res = 0, buff = [ false, false ];
		this.curr = true;
		this.calc = function(key, val) {
			if (key == "%") {
				this.curr = "funk";
				return (stack[0] ? stack[d - 1][0] / 100 * val : val / 100)
						+ ""
			}
			key = key.replace("×", "*").replace("÷", "/").replace("–", "-");
			if (key != "=") {
				buff[1] = key
			} else {
				if (buff[0] == false) {
					buff[0] = val
				}
			}
			if (key == "=" && !stack[0] && this.curr && buff[1]) {
				return (buff[1] == "yx" ? Math.pow(val, buff[0])
						: buff[1] == "x√y" ? Math.pow(val, 1 / buff[0])
								: buff[1] == "EE" ? val * Math.pow(10, buff[0])
										: eval("(" + val + ")" + buff[1] + "("
												+ buff[0] + ")"))
						+ ""
			}
			if (!stack[0] && key != "=") {
				buff[0] = false;
				stack[d++] = [ val, key ];
				this.curr = true;
				return val + ""
			}
			if (stack[0] && this.curr && this.curr != "funk" && key != "=") {
				stack[d - 1] = [ val, key ];
				return val + ""
			}
			if (!stack[0]) {
				return val + ""
			}
			if (rank[key] <= rank[stack[d - 1][1]]) {
				stack[d - 1] = [
						stack[d - 1][1] == "yx" ? Math
								.pow(stack[d - 1][0], val)
								: stack[d - 1][1] == "x√y" ? Math.pow(
										stack[d - 1][0], 1 / val)
										: stack[d - 1][1] == "EE" ? stack[d - 1][0]
												* Math.pow(10, val)
												: eval("(" + stack[d - 1][0]
														+ ")" + stack[d - 1][1]
														+ "(" + val + ")"), key ]
			}
			if (rank[key] > rank[stack[d - 1][1]]) {
				stack[d++] = [ val, key ]
			} else {
				if (stack[d - 2] && rank[key] <= rank[stack[d - 2][1]]) {
					this.calc(key, stack[--d][0])
				}
			}
			res = (stack[d - 1] ? stack[d - 1][0] : res) + "";
			if (key == "=") {
				this.init("AX")
			}
			this.curr = true;
			return res
		};
		this.init = function(key) {
			if (key.match(/A/)) {
				stack = [];
				d = 0
			}
			if (key == "AC") {
				buff = [ false, false ]
			}
			return "0"
		}
	};
	for ( var k = 2; k--;) {
		for ( var l = calcSS3.children[k + 1], m = l.children, n = m.length; n--;) {
			keyBoard[l.children[n].textContent] = l.children[n]
		}
	}
	keyBoard.C = keyBoard.AC;
	keyBoard.Rad = keyBoard.Deg;
	for ( var m = secondLayer[0], n = m.length; n--;) {
		keyBoard[secondLayer[1][n].replace(/<\/*\w+>/g, "")] = keyBoard[m[n]]
	}
	keyBoard["2x"] = keyBoard.ex;
	cal[0] = new calculator();
	function saveState() {
		for ( var n = sav.length; n--;) {
			localStorage[sav[n]] = eval(sav[n])
		}
	}
	(function() {
		bigger = localStorage.bigger ? eval(localStorage.bigger) : true;
		toggleCalc();
		if (+localStorage.ln) {
			ln = localStorage.ln;
			switchGrouping()
		}
		if (!localStorage.resBuffer) {
			return
		}
		try {
			if (localStorage.second.match(/false|null/) ? false : true) {
				keyDown(false, keyBoard["2nd"]);
				doKey("2nd", keyBoard["2nd"], true)
			}
			if (eval(localStorage.deg)) {
				doKey("Deg", keyBoard.Deg, true)
			}
			if (localStorage.memory) {
				display(localStorage.memory);
				doKey("m+", keyBoard["m+"], true)
			}
			display(localStorage.resBuffer);
			var buffStrX = localStorage.buffStr.split(",");
			for ( var n = 0, m = buffStrX.length; n < m; n++) {
				if (buffStrX[n]) {
					doKey(buffStrX[n], keyBoard[buffStrX[n]], true)
				}
			}
			display(localStorage.resBuffer);
			resBuffer = localStorage.resBuffer
		} catch (e) {
			for ( var n = sav.length; n--;) {
				localStorage.removeItem(sav[n])
			}
		}
	}());
	document
			.addEventListener(
					"keypress",
					function(e) {
						var key = e.which, holdKey = hold.textContent, keyMatch = (",|.|-|–|/|÷|*|×|#|+/–|x|x!|E|EE|e|ex| |2nd|r|x√y|R|√|p|π|^|yx|'|yx|\"|yx|m|mr|v|mc|b|m+|n|m-|s|sin|c|cos|t|tan|S|sin-1|C|cos-1|T|tan-1|d|Deg|°|Deg|l|ln|L|log|\\|1/x|X|2x")
								.split("|"), keyMatchHold = "sin|sinh|cos|cosh|tan|tanh|m-|Rand|Deg|Rand|sin-1|sinh-1|cos-1|cosh-1|tan-1|tanh-1|1|1/x|2|x2|3|x3|x√y|√|ln|log2|ex|2x"
								.split("|");
						if (key == 13) {
							key = 61
						}
						key = String.fromCharCode(key);
						for ( var n = 0, m = keyMatch.length; n < m; n = n + 2) {
							if (key == keyMatch[n]) {
								key = key.replace(key, keyMatch[n + 1]);
								break
							}
						}
						if (holdKey) {
							for ( var n = 0, m = keyMatchHold.length; n < m; n = n + 2) {
								if (key == keyMatchHold[n]) {
									key = key.replace(key, keyMatchHold[n + 1]);
									break
								}
							}
							hold.textContent = ""
						}
						if ((key == "h" || key == "H") && !holdKey) {
							hold.textContent = "hold"
						}
						if (key == "G" && holdKey) {
							switchGrouping(true)
						}
						if (!keyBoard[key]) {
							return false
						}
						if ((key.match(/-1$|log2$|2x$/) && !second)
								|| (key.match(/h$|n$|cos$|ex$/) && second)) {
							keyDown(false, keyBoard["2nd"]);
							doKey("2nd", keyBoard["2nd"], true)
						}
						keyDown(false, keyBoard[key]);
						doKey(key, keyBoard[key], true)
					}, false);
	document.addEventListener("keydown", function(e) {
		var str = resBuffer.replace(/\s/g, "");
		strLen = str.split("").length - 1;
		if (e.which == 8 && cal[brackets].curr != true
				&& cal[brackets].curr != "funk" && str != "0") {
			while (!keyBoard[buffStr[buffStr.length - 1]] && buffStr.length) {
				buffStr.pop()
			}
			if (buffStr[buffStr.length - 1] == "+/–") {
				doKey("+/–", keyBoard["+/–"], true);
				buffStr.pop()
			} else {
				if (resBuffer.match(/\-\d$/) || resBuffer.match(/^\d$/)) {
					buffStr.pop();
					doKey("C", keyBoard.C, true);
					display("0")
				} else {
					display(str.substring(0, strLen), true)
				}
			}
			buffStr.pop();
			if (buffStr[buffStr.length - 1] == ".") {
				display(str.substring(0, strLen - 1));
				buffStr.pop()
			}
			e.preventDefault()
		}
		if (e.which == 220) {
			keyDown(false, keyBoard.xy)
		}
		if (e.which == 46) {
			keyDown(false, keyBoard.AC);
			doKey(keyBoard.AC.textContent, keyBoard.AC, true)
		}
		if (e.which == 9) {
			toggleCalc(true);
			e.preventDefault()
		}
	}, false);
	document.addEventListener("keyup", function() {
		keyUp();
		saveState()
	}, false);
	document.body.addEventListener("paste", function(e) {
		display(parseFloat(e.clipboardData.getData("Text") + "") + "");
		cal[brackets].curr = true;
		keyBoard.AC.firstChild.firstChild.data = "C";
		if (frozenKey) {
			freezeKey(frozenKey, true)
		}
		e.preventDefault()
	}, false);
	document.body.addEventListener("copy", function(e) {
		hiddenCopy.textContent = resBuffer.replace(/\s/g, "");
		hiddenCopy.focus();
		hiddenCopy.select()
	}, false);
	calcSS3.onmousedown = function(e) {
		keyDown(e);
		if (!pressedKey) {
			return false
		}
		document.addEventListener("mouseout", keyUp, false);
		document.addEventListener("mouseover", keyDown, false);
		return false
	};
	document
			.addEventListener(
					"mouseup",
					function(e) {
						var e = e || window.event, tmpTarg = e.target.parentNode, targ, key = "", m = 0;
						if (e.target == smallCalc) {
							toggleCalc(true)
						}
						if (e.target == lnButton) {
							switchGrouping(true)
						}
						document.removeEventListener("mouseout", keyUp, false);
						document.removeEventListener("mouseover", keyDown,
								false);
						if (!pressedKey) {
							return false
						}
						while (tmpTarg.className
								&& tmpTarg.className.indexOf("key") == 0) {
							targ = tmpTarg;
							key += tmpTarg.textContent;
							tmpTarg = tmpTarg.parentNode;
							m++
						}
						if (key = key.substr(0, (key.length) / m)) {
							doKey(key, targ);
							saveState()
						}
					}, false);
	disp.parentElement.addEventListener("dblclick", function() {
		toggleCalc(true)
	}, false);
	function toggleCalc(doIt) {
		var cName = calcSS3.className;
		if (doIt) {
			bigger = !bigger
		}
		localStorage.bigger = bigger;
		calcSS3.className = bigger ? cName.replace(" calcSmall", "") : cName
				+ " calcSmall";
		smallCalc.firstChild.data = bigger ? ">" : "<";
		calcSS3.style.marginLeft = bigger ? "-252px" : "-132px";
		radDeg.style.display = bigger ? "" : "none";
		display(resBuffer.replace(/\s/g, ""))
	}
	function switchGrouping(doIt) {
		if (doIt) {
			ln = ++ln > 3 ? 0 : ln
		}
		lnButton.firstChild.data = !ln ? "." : ln == 1 ? "," : ln == 2 ? ",."
				: ".,";
		display(resBuffer);
		localStorage.ln = ln
	}
	function doKey(key, targ, alt) {
		if (key == "2nd") {
			second = second ? null : targ;
			targ.className = targ.className + " second";
			targ.firstChild.className = targ.firstChild.className
					+ " second-inlay";
			for ( var n = 12; n < 20; n++) {
				secondKeys[n].firstChild.innerHTML = secondLayer[second ? 1 : 0][n - 12]
			}
		} else {
			if (key.match(/^[+|–|÷|×|yx|x√y|E]+$/) && key != "√") {
				freezeKey(targ)
			} else {
				if (key.match(/^[\d|\.|π]$/)) {
					freezeKey(targ, true);
					keyBoard.AC.firstChild.firstChild.data = "C"
				} else {
					if (key == "C") {
						targ.firstChild.firstChild.data = "AC";
						if (frozenKey) {
							freezeKey(frozenKey)
						}
					} else {
						if (key.match(/AC|=/)) {
							if (bracketKey) {
								freezeKey(bracketKey, 2)
							}
							freezeKey(targ, true);
							frozenKey = null
						} else {
							if (key.match(/Deg|Rad/)) {
								radDeg.firstChild.data = deg ? "Rad" : "Deg";
								targ.firstChild.firstChild.data = deg ? "Deg"
										: "Rad";
								deg = !deg
							} else {
								if (key == "(") {
									bracketKey = targ;
									freezeKey(bracketKey, 2).className += " active"
								} else {
									if (key == ")") {
										if (brackets == 1 && bracketKey) {
											freezeKey(bracketKey, 2)
										}
									}
								}
							}
						}
					}
				}
			}
		}
		evalKey(key);
		if (!alt) {
			keyUp()
		}
		if (key.match(/^m[c|+|-]/)) {
			freezeKey(keyBoard.mr, 2).className += (memory ? " active" : "")
		}
	}
	function evalKey(key) {
		var dispVal = resBuffer.replace(/\s/g, "").replace(/Error|∞|-∞/, "0")
				+ "", m, lastKey;
		if (!key.match(/2nd|Deg|Rad|m/)) {
			buffStr.push(key);
			if ((buffStr[buffStr.length - 2] == "=" && key != "=" && cal[brackets].curr)
					|| key == "AC") {
				buffStr = [ key ]
			}
		}
		lastKey = buffStr[buffStr.length - 2];
		if (key.match(/^[\d|\.]$/) || key == "+/–") {
			if (cal[brackets].curr
					&& key != "+/–"
					|| (key == "+/–" && lastKey && lastKey
							.match(/^[+|–|÷|×|yx|x√y|E|^C]+$/))) {
				dispVal = "0";
				cal[brackets].curr = false
			}
			if ((Math.abs(+(dispVal + key)) > (bigger ? 1000000000000000
					: 1000000000)
					|| dispVal.replace(/^-/, "").length > 15
					|| (dispVal.replace("-", "").replace(/\./g, "").length > (bigger ? 14
							: 8)) || (dispVal.match(/\.|\e\+/) && key == "."))
					&& key != "+/–") {
				buffStr.pop();
				return
			} else {
				if (key == "+/–") {
					display(!(dispVal.replace(/e[\+|\-]/, "")).match("-") ? "-"
							+ dispVal : dispVal.replace(/^-/, ""), "+/–")
				} else {
					display((dispVal + key).replace(/^(-)*?0(\d)$/, "$1$2"),
							true)
				}
			}
		} else {
			if (key.match(/^C|AC/)) {
				display(cal[brackets].init(key));
				hold.textContent = ""
			} else {
				if (key.match(/^[+|–|÷|×|-|\/|*|yx|x√y|%|E]+$/) && key != "√") {
					display(cal[brackets].calc(key, dispVal))
				} else {
					if (brackets > -1) {
						cal[brackets].curr = "funk"
					}
					switch (key) {
					case "=":
						while (brackets > -1) {
							display(dispVal = cal[brackets--]
									.calc("=", dispVal))
						}
						brackets = 0;
						cal[brackets].curr = true;
						break;
					case "(":
						cal[++brackets] = new calculator();
						cal[brackets].curr = true;
						break;
					case ")":
						if (brackets) {
							display(cal[brackets--].calc("=", dispVal))
						}
						if (brackets > -1) {
							cal[brackets].curr = false
						}
						break;
					case "mc":
						memory = 0;
						break;
					case "m+":
						memory += +dispVal;
						break;
					case "m-":
						memory -= +dispVal;
						break;
					case "mr":
						display(memory + "");
						break;
					case "1/x":
						display((1 / dispVal) + "");
						break;
					case "x2":
						display(Math.pow(dispVal, 2) + "");
						break;
					case "x3":
						display(Math.pow(dispVal, 3) + "");
						break;
					case "x!":
						display((function fak(n) {
							return n < 0 || n > 170 ? NaN : n <= 1 ? 1 : n
									* fak(n - 1)
						})(Math.round(+dispVal))
								+ "");
						break;
					case "√":
						display(Math.sqrt(dispVal) + "");
						break;
					case "log":
						display(Math.log(dispVal) / Math.log(10) + "");
						break;
					case "sin":
						display(!deg && Math.abs(dispVal) == _PI ? "0" : Math
								.sin(dispVal * (deg ? degC : 1))
								+ "");
						break;
					case "sin-1":
						display(Math.asin(dispVal) * (deg ? radC : 1) + "");
						break;
					case "cos":
						display(Math.cos(dispVal * (deg ? degC : 1)) + "");
						break;
					case "cos-1":
						display(Math.acos(dispVal) * (deg ? radC : 1) + "");
						break;
					case "tan":
						display(!deg && Math.abs(dispVal) == _PI ? "0" : Math
								.tan(dispVal * (deg ? degC : 1))
								+ "");
						break;
					case "tan-1":
						display(Math.atan(dispVal) * (deg ? radC : 1) + "");
						break;
					case "ln":
						display(Math.log(dispVal) + "");
						break;
					case "log2":
						display(Math.log(dispVal) / Math.log(2) + "");
						break;
					case "sinh":
						display(((Math.pow(Math.E, dispVal) - Math.pow(Math.E,
								-dispVal)) / 2)
								+ "");
						break;
					case "sinh-1":
						display(Math.log(+dispVal
								+ Math.sqrt(1 + Math.pow(dispVal, 2)))
								+ "");
						break;
					case "cosh":
						display(((Math.pow(Math.E, dispVal) + Math.pow(Math.E,
								-dispVal)) / 2)
								+ "");
						break;
					case "cosh-1":
						display(2
								* Math.log(Math.sqrt((+dispVal + 1) / 2)
										+ Math.sqrt((+dispVal - 1) / 2)) + "");
						break;
					case "tanh":
						var e1 = Math.pow(Math.E, dispVal), e2 = Math.pow(
								Math.E, -dispVal);
						display((e1 - e2) / (e1 + e2) + "");
						break;
					case "tanh-1":
						display((Math.log(+dispVal + 1) - Math.log(1 - dispVal))
								/ 2 + "");
						break;
					case "ex":
						display(Math.exp(dispVal) + "");
						break;
					case "2x":
						display(Math.pow(2, (dispVal)) + "");
						break;
					case "π":
						display(_PI + "");
						break;
					case "Rand":
						display(Math.random() + "");
						break;
					default:
						buffStr.pop();
						break
					}
				}
			}
		}
	}
})();