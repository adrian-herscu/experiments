package com.example.webehave;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStoryMaps;

@SuppressWarnings({"javadoc"})
abstract public class AllStoryMaps extends JUnitStoryMaps {

    @Override
    protected List<String> metaFilters() {
        return Arrays.asList(Utils.topLevelMetaFilter);
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
