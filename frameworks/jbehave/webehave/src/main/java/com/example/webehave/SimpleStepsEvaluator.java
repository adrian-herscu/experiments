package com.example.webehave;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.mvel2.MVEL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@SuppressWarnings({"javadoc","nls","static-method"})
public class SimpleStepsEvaluator {
    private static final Logger logger;

    static {
        logger = LoggerFactory.getLogger(SimpleStepsEvaluator.class);
    }

    @Around("execution(void SimpleSteps.*(..))")
    public void evaluate(final ProceedingJoinPoint jp) throws Throwable {
        final java.lang.Object[] args = jp.getArgs();
        final Signature signature = jp.getSignature();

        if (signature instanceof MethodSignature) {
            final Method method = ((MethodSignature) signature).getMethod();
            final Annotation[][] parameterAnnotations = method
                    .getParameterAnnotations();

            assert parameterAnnotations.length == args.length : "number of arguments do not match number of annotated parameters";

            for (int i = 0; i < parameterAnnotations.length; i++) {
                for (final Annotation annotation : parameterAnnotations[i]) {
                    if (annotation.annotationType() == Value.class) {
                        final String value = args[i].toString();
                        final String evaluated = MVEL.eval(value).toString();
                        logger.debug("replacing argument (" + i + ") having contents: " + value + " with: "
                                + evaluated);
                        args[i] = evaluated;
                    }
                }
            }
        }

        jp.proceed(args);
    }
}
