package com.acme.foo;

import javax.inject.Named;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Provides;
import com.google.inject.name.Names;

/**
 * Hello world!
 * 
 */
class App
        extends AbstractModule
{
    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("message"))
                .toInstance("did something");
        bind(FooService.class).to(FooServiceImpl.class);
        // NOTE: Default binding supplied by ImplementsBy on the interface
        // bind(BarService.class).to(BarServiceImpl.class);
    }

    @Provides
    ConfigurableBarService provideTransactionLog() {
        ConfigurableBarServiceImpl bar = new ConfigurableBarServiceImpl("a message");
        bar.value = "a value";
        return bar;
    }

    public static void main(String[] args)
    {
        final FooService foo = Guice
                .createInjector(new App()).getInstance(FooService.class);
        foo.doSomething();
    }
}
