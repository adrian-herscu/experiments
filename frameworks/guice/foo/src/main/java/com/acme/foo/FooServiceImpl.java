package com.acme.foo;

import javax.inject.Inject;
import javax.inject.Named;

public class FooServiceImpl
        implements FooService {
    final private BarService             bar;
    final private ConfigurableBarService configurableBar;
    final private String                 message;

    @Inject
    FooServiceImpl(
            BarService bar, ConfigurableBarService configurableBar,
            @Named("message") String message) {
        this.bar = bar;
        this.configurableBar = configurableBar;
        this.message = message;
    }

    public void doSomething() {
        System.out.println("FooServiceImpl: " + message);
        bar.doSomething();
        configurableBar.doSomething();
    }
}
