package com.fajfar.hangen.java.configuration;

import com.fajfar.hangen.java.TransformationIdentifier;

import java.lang.reflect.Type;

public interface TransformationConfiguration {
    Boolean IsTransformationKnown(Type sourceType, Type destinationType);
    Boolean IsTransformationKnown(TransformationIdentifier identifier);
}
