package com.example.webehave;

import java.util.List;

import org.junit.runner.RunWith;

import com.example.webehave.AllStories;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

@RunWith(JUnitReportingRunner.class)
@SuppressWarnings({"javadoc"})
public class StoriesRunner extends AllStories {

    @Override
    protected List<String> storyPaths() {
        // ISSUE required by JUnitReportingRunner
        return super.storyPaths();
    }

}
