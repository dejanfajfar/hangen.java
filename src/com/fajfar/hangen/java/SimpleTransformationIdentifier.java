package com.fajfar.hangen.java;

import com.fajfar.hangen.java.ResourceBundles.ErrorMessages;

public class SimpleTransformationIdentifier implements TransformationIdentifier {
    private Class sourceType;
    private Class destinationType;

    /**
     * Creates a new instance of the simple transformation identifier
     * @param sourceType
     * The source type from which we are taking the data for the target
     * @param destinationType
     * The destination type where the source data is mapped to.
     */
    public SimpleTransformationIdentifier(Class sourceType, Class destinationType)
    {
        setSourceType(sourceType);
        setDestinationType(destinationType);
    }

    public Class getSourceType() {
        return sourceType;
    }

    public void setSourceType(final Class source) {
        if(source == null){
            throw new NullPointerException(ErrorMessages.SOURCE_TYPE_NULL.getResource());
        }
        sourceType = source;
    }

    public Class getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(final Class destination) {
        if(destination == null){
            throw new NullPointerException(ErrorMessages.DESTINATION_TYPE_NULL.getResource());
        }
        destinationType = destination;
    }

    public Boolean isSameAs(Class source, Class destination) {
        if(source == null){
            throw new NullPointerException(ErrorMessages.SOURCE_TYPE_NULL.getResource());
        }
        if(destination == null){
            throw new NullPointerException(ErrorMessages.DESTINATION_TYPE_NULL.getResource());
        }

        return (sourceType == source) && (destinationType == destination);
    }

    public boolean equals(Object compered){
        if(compered == null) return false;
        if(compered == this) return true;
        if(!(compered instanceof SimpleTransformationIdentifier)) return false;

        SimpleTransformationIdentifier instance = (SimpleTransformationIdentifier) compered;
        return instance.getDestinationType() == getDestinationType()
                && instance.getSourceType() == getSourceType();
    }

    public int hashCode(){
        return (getSourceType().hashCode() + getDestinationType().hashCode()) % Integer.MAX_VALUE;
    }
}
