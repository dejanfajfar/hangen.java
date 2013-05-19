package com.fajfar.hangen.java;

import com.fajfar.hangen.java.Exceptions.TransformationException;

public interface ObjectInitializer<T> {
    T getInstance() throws TransformationException;
}
