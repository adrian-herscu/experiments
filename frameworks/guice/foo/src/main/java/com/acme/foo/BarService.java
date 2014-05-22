package com.acme.foo;

import com.google.inject.ImplementedBy;

@ImplementedBy(BarServiceImpl.class)
public interface BarService {
    void doSomething();
}
