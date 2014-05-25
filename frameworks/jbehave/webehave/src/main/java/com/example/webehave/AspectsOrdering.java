package com.example.webehave;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclarePrecedence;

@SuppressWarnings("javadoc")
@Aspect
//@DeclarePrecedence("SimpleStepsLogger, SimpleStepsMapper, SimpleStepsEvaluator")
@DeclarePrecedence("SimpleStepsEvaluator, SimpleStepsMapper, SimpleStepsLogger")
class AspectsOrdering {
    // just declares aspects precedence
}
