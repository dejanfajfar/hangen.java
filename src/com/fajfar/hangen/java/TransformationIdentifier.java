package com.fajfar.hangen.java;


import java.lang.reflect.Type;

public interface TransformationIdentifier {
    Type getSourceType();
    void setSourceType(Type source);
    Type getDestinationType();
    void setDestinationType(Type destination);

    Boolean isSameAs(Type source, Type destination);
}
