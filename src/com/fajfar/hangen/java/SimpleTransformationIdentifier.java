package com.fajfar.hangen.java;

import com.fajfar.hangen.java.ResourceBundles.ErrorMessages;

import java.lang.reflect.Type;

public class SimpleTransformationIdentifier implements TransformationIdentifier {
    private Type sourceType;
    private Type destinationType;

    /**
     * Creates a new instance of the simple transformation identifier
     * @param sourceType
     * The source type from which we are taking the data for the target
     * @param destinationType
     * The destination type where the source data is mapped to.
     */
    public SimpleTransformationIdentifier(Type sourceType, Type destinationType)
    {
        setSourceType(sourceType);
        setDestinationType(destinationType);
    }

    public Type getSourceType() {
        return sourceType;
    }

    public void setSourceType(final Type source) {
        if(source == null){
            throw new NullPointerException(ErrorMessages.SOURCE_TYPE_NULL.getResource());
        }
        sourceType = source;
    }

    public Type getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(final Type destination) {
        if(destination == null){
            throw new NullPointerException(ErrorMessages.DESTINATION_TYPE_NULL.getResource());
        }
        destinationType = destination;
    }

    public Boolean isSameAs(Type source, Type destination) {
        if(source == null){
            throw new NullPointerException(ErrorMessages.SOURCE_TYPE_NULL.getResource());
        }
        if(destination == null){
            throw new NullPointerException(ErrorMessages.DESTINATION_TYPE_NULL.getResource());
        }

        return (sourceType == sourceType) && (destinationType == destination);
    }
}
