package com.acme.foo;

import javax.inject.Inject;

public class FooServiceImpl implements FooService {
    final BarService bar;
    
    @Inject
    FooServiceImpl(BarService bar) {
        this.bar = bar;
    }

    public void doSomething() {
        System.out.println("FooServiceImpl: did something");
        bar.doSomething();
    }
}
