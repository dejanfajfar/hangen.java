package com.fajfar.hangen.java.configuration;

public abstract class ManulTransformationConfiguration<TSource, TDestination> implements ClassTransformationConfiguration {
    protected abstract void doTransformation(TSource source, TDestination destination);
}
