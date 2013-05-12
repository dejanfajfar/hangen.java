package com.fajfar.hangen.java;

import java.lang.reflect.ParameterizedType;

public class DefaultObjectInitializer<T> implements ObjectInitializer<T> {

    public T getInstance() throws IllegalAccessException, InstantiationException {
        ParameterizedType genericSuperClass = (ParameterizedType)getClass().getGenericSuperclass();
        Class<T> clazz = (Class<T>) genericSuperClass.getActualTypeArguments()[0];
        return clazz.newInstance();
    }
}
