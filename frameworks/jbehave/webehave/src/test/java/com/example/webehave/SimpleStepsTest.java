package com.example.webehave;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.webehave.SimpleSteps;

@SuppressWarnings({"javadoc","nls"})
public class SimpleStepsTest {

    private static final String     VALUE = "'value'";
    final private WebDriver         mockedWebDriver;
    final private WebDriverProvider mockedWebDriverProvider;
    final private WebElement        mockedWebElement;

    final private SimpleSteps       simpleSteps;

    public SimpleStepsTest() {
        this.mockedWebDriverProvider = mock(WebDriverProvider.class);
        this.mockedWebDriver = mock(WebDriver.class);
        this.mockedWebElement = mock(WebElement.class);

        when(this.mockedWebDriverProvider.get())
                .thenReturn(this.mockedWebDriver);
        when(this.mockedWebDriver.findElement(any(By.class)))
                .thenReturn(this.mockedWebElement);
        when(this.mockedWebElement.getAttribute(any(String.class)))
                .thenReturn(VALUE);
        when(this.mockedWebElement.getText())
                .thenReturn(VALUE);

        this.simpleSteps = new SimpleSteps(this.mockedWebDriverProvider);
    }

    @Before
    public void setUp() throws Exception {
        this.simpleSteps.beforeStories();
        verify(this.mockedWebDriverProvider).get();
    }

    @After
    public void tearDown() throws Exception {
        this.simpleSteps.afterStories();
        verify(this.mockedWebDriver).quit();
    }

    @Test
    public void testClick() {
        this.simpleSteps.click("dont-care");
        verify(this.mockedWebDriver).findElement(By.xpath("dont-care"));
        verify(this.mockedWebElement).click();
    }

    @Test
    public void testVerifyWithAttribute() {
        this.simpleSteps.verify("foo/@goo", VALUE);
        verify(this.mockedWebDriver).findElement(By.xpath("foo"));
        verify(this.mockedWebElement).getAttribute("goo");
    }

    @Test
    public void testVerifyWithText() {
        this.simpleSteps.verify("foo", VALUE);
        verify(this.mockedWebDriver).findElement(By.xpath("foo"));
        verify(this.mockedWebElement).getText();
    }

    // ISSUE: cannot mock static methods; should consider PowerMock
    // @Test
    // public void testWait() {
    //
    // }
}
