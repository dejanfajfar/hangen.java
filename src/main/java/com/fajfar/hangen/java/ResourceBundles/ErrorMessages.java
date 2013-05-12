package com.fajfar.hangen.java.ResourceBundles;

import java.util.ResourceBundle;

public enum ErrorMessages {
    SOURCE_TYPE_NULL("SOURCE_TYPE_NULL"),
    DESTINATION_TYPE_NULL("DESTINATION_TYPE_NULL");

    static {
        bundle = ResourceBundles.ERROR_MESSAGES.getResourceBundle();
    }
    private static ResourceBundle bundle;
    private String resourceName;
    ErrorMessages(final String resourceName){
        this.resourceName = resourceName;
    }

    public String getResource(){
        return bundle.getString(resourceName);
    }
}
