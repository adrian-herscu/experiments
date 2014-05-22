package com.acme.foo;

import javax.inject.Inject;
import javax.inject.Named;

public class ConfigurableBarServiceImpl
        implements ConfigurableBarService {

    private final String message;
    public String value;

    @Inject
    ConfigurableBarServiceImpl(@Named("message") String message) {
        this.message = message;
    }
    
    public void doSomething() {
        System.out.println("ConfigurableBarServiceImpl: " + message + ":" + value);
    }
}
