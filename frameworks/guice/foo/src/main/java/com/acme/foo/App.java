package com.acme.foo;

import com.google.inject.Guice;

/**
 * Hello world!
 * 
 */
public class App
{
    final FooService foo;
    
    App(FooService foo) {
        this.foo = foo;
    }

    public static void main(String[] args)
    {
        new App(Guice.createInjector(new AppModule()).getInstance(FooService.class)).foo.doSomething();
    }
}
