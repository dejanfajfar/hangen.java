package com.fajfar.hangen.java.ResourceBundles;

import java.util.ResourceBundle;

public class ErrorMessages {
    static {
        bundle = ResourceBundles.ERROR_MESSAGES.getResourceBundle();
    }
    private static ResourceBundle bundle;

    public static final String sourceTypeNull(){
        return bundle.getString("SOURCE_TYPE_NULL");
    }

    public static final String sourceTypeNull(final Class type){
        return String.format(bundle.getString("SOURCE_TYPE_NULL_FORMAT"), type.getName());
    }

    public static final String destinationTypeNull(){
        return bundle.getString("DESTINATION_TYPE_NULL");
    }

    public static final String destinationTypeNull(final Class type){
        return String.format(bundle.getString("DESTINATION_TYPE_NULL_FORMAT"), type.getName());
    }

    public static final String destinationInitializationFailed(Class destinationType){
        return String.format(bundle.getString("DESTINATION_TYPE_INITIALIZATION"), destinationType.getName());
    }

    public static final String destinationInitializationCausedIllegalAccess(Class destinationType){
        return String.format(bundle.getString("DESTINATION_TYPE_ILLEGAL_ACCESS"), destinationType);
    }

    public static final String transformationProviderNotFound(Class sourceType, Class destinationType){
        return String.format(bundle.getString("TRANSFORMATION_NOT_FOUND"), sourceType.getName(), destinationType.getName());
    }
}
