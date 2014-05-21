package com.acme.foo;

import com.google.inject.AbstractModule;

public class AppModule
        extends AbstractModule {

    @Override
    protected void configure() {
        bind(FooService.class).to(FooServiceImpl.class);
        bind(BarService.class).to(BarServiceImpl.class);
    }

}
