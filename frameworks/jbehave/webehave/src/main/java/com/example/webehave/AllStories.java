package com.example.webehave;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

import java.util.List;
import java.util.Properties;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.FilePrintStreamFactory.ResolveToPackagedName;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ParameterControls;
import org.jbehave.web.selenium.PropertyWebDriverProvider;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

@SuppressWarnings({"javadoc","nls"})
abstract public class AllStories extends JUnitStories {

    public AllStories() {
        super();
        configuredEmbedder().embedderControls()
                .doGenerateViewAfterStories(true)
                .doIgnoreFailureInStories(true)
                .doIgnoreFailureInView(true)
                .useThreads(2)
                .useStoryTimeoutInSecs(60)
                .useStoryTimeoutInSecs(Long.MAX_VALUE);
        JUnitReportingRunner.recommandedControls(configuredEmbedder());
    }

    @Override
    public Configuration configuration() {
        final Properties viewResources = new Properties();
        viewResources.put("decorateNonHtml", "true");
        return new MostUsefulConfiguration()
                .useParameterControls(
                        new ParameterControls()
                                .useDelimiterNamedParameters(true))
                .useStoryReporterBuilder(
                        new StoryReporterBuilder()
                                .withDefaultFormats()
                                .withPathResolver(new ResolveToPackagedName())
                                .withViewResources(viewResources)
                                .withFormats(Format.HTML)
                                .withFailureTrace(true)
                                .withFailureTraceCompression(true));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(
                configuration(),
                new SimpleSteps(new PropertyWebDriverProvider()));
    }

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder()
                .findPaths(
                        codeLocationFromClass(this.getClass()),
                        Utils.includePattern,
                        Utils.excludePattern);
    }

}
