package com.example.webehave;

import java.io.IOException;
import java.util.Properties;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@SuppressWarnings({"javadoc","nls","static-method"})
public class SimpleStepsMapper {
    private static final Properties objects, values;

    static {
        objects = new Properties();
        values = new Properties();
        try {
            // TODO: use dictionary files specified by system properties
            objects.load(SimpleStepsMapper.class.getClassLoader()
                    .getResourceAsStream("object-dictionary"));
            values.load(SimpleStepsMapper.class.getClassLoader()
                    .getResourceAsStream("value-dictionary"));
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static String displayObjectOf(final String key) {
        return key + " [" + objectOf(key) + "]";
    }

    static String displayValueOf(final String key) {
        return key + " [" + valueOf(key) + "]";
    }

    static String objectOf(final String key) {
        return objects.getProperty(key, key);
    }

    static String valueOf(final String key) {
        return values.getProperty(key, key);
    }

    @Around("execution(public void SimpleSteps.*(@Object (String))) && args(object)")
    public void mapObjectOperation(final ProceedingJoinPoint jp,
            final String object)
            throws Throwable {
        jp.proceed(new String[] { objectOf(object) });
    }

    @Around("execution(public void SimpleSteps.*(@Object (String), @Value (String), ..))")
    public void mapObjectValueOperation(final ProceedingJoinPoint jp)
            throws Throwable {
        final java.lang.Object[] args = jp.getArgs();
        args[0] = objectOf((String) args[0]);
        args[1] = valueOf((String) args[1]);

        jp.proceed(args);
    }
}
