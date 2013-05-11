package com.fajfar.hangen.java;


public interface TransformationIdentifier {
    Class getSourceType();
    void setSourceType(Class source);
    Class getDestinationType();
    void setDestinationType(Class destination);

    Boolean isSameAs(Class source, Class destination);
}
