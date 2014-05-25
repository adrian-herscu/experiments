package com.example.webehave;

import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.jbehave.core.model.ExamplesTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@SuppressWarnings({"javadoc","nls","static-method"})
public class SimpleStepsLogging {
    private static final Logger logger;

    static {
        logger = LoggerFactory.getLogger(SimpleStepsLogging.class);
    }

    @Before("execution(void SimpleSteps.*())")
    public void log(final JoinPoint jp) {
        logger.debug(jp.getSignature().getName());
    }

    @Before("execution(SimpleSteps.new(..))")
    public void logConstructor(final JoinPoint jp) {
        logger.debug(jp.getSignature().getName());
    }

    @Before("execution(void SimpleSteps.execute(String, ExamplesTable)) && args(story, arguments)")
    public void logExecuteOperation(final JoinPoint jp, final String story,
            final ExamplesTable arguments) {
        final StringBuilder arguments0 = new StringBuilder();

        for (final Map<String, String> row : arguments.getRows()) {
            for (final String argument : arguments.getHeaders()) {
                arguments0.append(argument + "=" + row.get(argument) + ";");
            }
        }

        logger.debug(jp.getSignature().getName() + " " + story
                + " with:" + arguments0);

    }

    @Before("execution(void SimpleSteps.*(@Object (String))) && args(object)")
    public void logObjectOperation(final JoinPoint jp, final String object) {
        logger.debug(jp.getSignature().getName() + ": "
                + SimpleStepsMapper.displayObjectOf(object));
    }

    @Before("execution(void SimpleSteps.*(@Object (String), @Value (String), ..))")
    public void logObjectValueOperation(final JoinPoint jp) {
        final String object = (String) jp.getArgs()[0];
        final String value = (String) jp.getArgs()[1];

        // TODO: log the additional parameters
        logger.debug(jp.getSignature().getName() + ": "
                + SimpleStepsMapper.displayObjectOf(object) + " = "
                + SimpleStepsMapper.displayValueOf(value));
    }
}
