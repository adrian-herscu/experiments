package com.acme.foo;

import javax.inject.Inject;
import javax.inject.Named;

public class BarServiceImpl
        implements BarService {

    private final String message;

    @Inject
    BarServiceImpl(@Named("message") String message) {
        this.message = message;
    }

    public void doSomething() {
        System.out.println("BarServiceImpl: " + message);
    }
}
