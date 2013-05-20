package com.fajfar.hangen.java.configuration;

import com.fajfar.hangen.java.Exceptions.TransformationException;

public interface ClassTransformationConfiguration<TSource, TDestination> {
    TDestination transform(TSource source) throws TransformationException;
}
