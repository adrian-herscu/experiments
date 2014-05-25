package com.example.webehave;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.object.IsCompatibleType.typeCompatibleWith;

import java.util.concurrent.TimeUnit;

import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

import org.apache.commons.lang3.StringUtils;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.web.selenium.PerStoriesWebDriverSteps;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Guarded
@SuppressWarnings({"javadoc","nls","static-method"})
public class SimpleSteps extends PerStoriesWebDriverSteps {

    private WebDriver browser;

    public SimpleSteps(final @NotNull WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    @AfterStories
    @Override
    public void afterStories() throws Exception {
        super.afterStories();
        this.browser.quit();
    }

    @AfterStory
    public void afterStory() throws Exception {
        // nothing to do here
    }

    @BeforeStories
    @Override
    public void beforeStories() throws Exception {
        super.beforeStories();
        this.browser = this.driverProvider.get();
        assert this.browser != null : "could not get a browser";
    }

    @BeforeStory
    public void beforeStory() throws Exception {
        // nothing to do here
    }

    @When("clicking ${object}")
    public void click(final @Object String object) {
        if (object.equals("alert::ok")) {
            this.browser.switchTo().alert().dismiss();
        } else {
            this.browser.findElement(By.xpath(object)).click();
        }
    }

    @Given("${story} was done with: ${arguments}")
    @When("doing ${story} with: ${arguments}")
    @Then("${story} is fine according to: ${arguments}")
    public void execute(final String story, final ExamplesTable arguments) {
        // this.embedder.candidateSteps().
        // final String step = "When clicking test";
        // final List<String> steps = new ArrayList<String>();
        // steps.add(step);
        //
        // final Scenario scenario = new Scenario(steps);
        // final List<Scenario> scenarios = new ArrayList<Scenario>();
        // scenarios.add(scenario);
        //
        // final Story _story = new Story(new Description("fake story"), new
        // Narrative(
        // "just a fake", "", ""), scenarios);
        // final StoryRunner runner = new StoryRunner();
        // runner.run(this.embedder.configuration(),
        // this.embedder.stepsFactory(), _story, MetaFilter.EMPTY, null);
        // TODO: load and execute the story
    }

    @Given("${object} is set to ${value}")
    public void set(final @Object String object, final @Value String value) {
        // TODO: extract to external table
        if (object.equals("url")) {
            this.browser.get(value);
        }
    }

    @Then("${object} should be ${value}")
    public void verify(final @Object String object, final @Value String value) {
        // final String normalizedValue = StringUtils.normalizeSpace(value);

        // TODO: extract to external table
        // FIXME: must normalize whitespace and EOL before comparison
        if (object.equals("alert::text")) {
            assertThat(this.browser.switchTo().alert().getText(),
                    equalToIgnoringWhiteSpace(value));
        } else {
            // FIXME: should use Jaxen to process XPath expressions
            if (object.contains("/@")) {
                final String objectXPath =
                        StringUtils.substringBefore(object, "/@");
                final String attributeName =
                        StringUtils.substringAfter(object, "/@");

                assertThat(
                        this.browser.findElement(
                                By.xpath(objectXPath))
                                .getAttribute(attributeName),
                        equalToIgnoringWhiteSpace(value));
            } else {
                assertThat(
                        this.browser.findElement(By.xpath(object)).getText(),
                        equalToIgnoringWhiteSpace(value));
            }
        }
    }

    @Then("${object} should not exist")
    public void verifyNotExists(final @Object String object) {
        // TODO: extract to external table
        if (object.equals("alert")) {
            try {
                this.browser.switchTo();
                throw new AssertionError(
                        SimpleStepsMapper.displayObjectOf(object)
                                + " should not exist");
            } catch (final Throwable e) {
                assertThat(e.getClass(),
                        typeCompatibleWith(AssertionError.class));
            }
        }
    }

    @Then("wait ${value} ${unit} since ${object}")
    @When("waiting ${value} ${unit} since ${object}")
    @Given("${value} ${unit} since ${object} passed")
    public void wait(final @Object @Named("object") String object,
            final @Value @Named("value") String value,
            final @Named("unit") String unit)
            throws NumberFormatException, InterruptedException {
        // TODO: hold the objects as a dictionary of timers
        TimeUnit.valueOf(unit.toUpperCase()).sleep(Long.valueOf(value).longValue());
    }
}
