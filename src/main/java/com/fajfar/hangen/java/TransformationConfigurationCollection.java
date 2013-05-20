package com.fajfar.hangen.java;

import com.fajfar.hangen.java.configuration.ClassTransformationConfiguration;

import java.util.HashMap;
import java.util.Map;

public class TransformationConfigurationCollection {
    private final Map<TransformationIdentifier, ClassTransformer> transfromations;

    public TransformationConfigurationCollection() {
        this.transfromations = new HashMap<TransformationIdentifier, ClassTransformer>();
    }

    public boolean anyTransformationsConfigured() {
        return false;
    }

    public Map<TransformationIdentifier, ClassTransformer> getTransformationConfigurations() {
        return new HashMap<TransformationIdentifier, ClassTransformer>();
    }

    public void AddTransformation(ClassTransformationConfiguration configuration){

    }

    private void AddDefaultTransformations(){

    }
}
