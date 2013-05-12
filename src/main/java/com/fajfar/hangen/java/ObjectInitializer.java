package com.fajfar.hangen.java;

public interface ObjectInitializer<T> {
    T getInstance() throws IllegalAccessException, InstantiationException;
}
