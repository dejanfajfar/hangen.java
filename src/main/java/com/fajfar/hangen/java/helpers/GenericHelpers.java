package com.fajfar.hangen.java.helpers;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public final class GenericHelpers<T> {
        public Type getGenericType(){
            ParameterizedType genericSuperClass = (ParameterizedType)getClass().getGenericSuperclass();
            return genericSuperClass.getActualTypeArguments()[0];
        }

        public Class getGenericClass(){
            return getGenericType().getClass();
        }
}
