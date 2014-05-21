package com.acme.foo;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;

/**
 * Hello world!
 * 
 */
public class App
        extends AbstractModule
{
    @Override
    protected void configure() {
        bind(FooService.class).to(FooServiceImpl.class);
        bind(BarService.class).to(BarServiceImpl.class);
    }

    public static void main(String[] args)
    {
        final FooService foo = Guice
                .createInjector(new App()).getInstance(FooService.class);
        foo.doSomething();
    }
}
