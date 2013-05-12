package com.fajfar.hangen.java;

import com.fajfar.hangen.java.Exceptions.TransformationException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HangenTransformationProvider implements TransformationProvider {
    private final Map<TransformationIdentifier, ClassTransformer> transformations;

    public HangenTransformationProvider(){
        transformations = new HashMap<TransformationIdentifier, ClassTransformer>();
    }

    public <TypeTo> TypeTo from(Object source) {
        return null;
    }

    public <TypeTo> TypeTo from(Object source, ObjectInitializer<TypeTo> initializer) {
        return null;
    }

    public <TypeTo> List<TypeTo> fromList(List source) {
        return null;
    }

    public <TypeTo> List<TypeTo> fromList(List source, ObjectInitializer<TypeTo> initializer) {
        return null;
    }

    private void CheckIfCanTransform(Class source, Class destination){
        TransformationIdentifier desiredTransformation = new SimpleTransformationIdentifier(source, destination);

        if(!transformations.containsKey(desiredTransformation)){
            //throw new TransformationException("");
        }
    }
}
