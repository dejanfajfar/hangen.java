package com.fajfar.hangen.java.ResourceBundles;

import java.util.ResourceBundle;

public enum ResourceBundles {
    ERROR_MESSAGES("ErrorMessages");

    private String bundleName;
    ResourceBundles(String bundleName){
        this.bundleName = bundleName;
    }

    public ResourceBundle getResourceBundle()
    {
        return ResourceBundle.getBundle(bundleName);
    }
}
