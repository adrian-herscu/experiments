package com.acme.foo;

import javax.inject.Inject;
import javax.inject.Named;

public class FooServiceImpl
        implements FooService {
    final private BarService bar;
    final private String     message;

    @Inject
    FooServiceImpl(BarService bar, @Named("message") String message) {
        this.bar = bar;
        this.message = message;
    }

    public void doSomething() {
        System.out.println("FooServiceImpl: " + message);
        bar.doSomething();
    }
}
