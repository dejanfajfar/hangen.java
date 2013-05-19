package com.fajfar.hangen.java;

import com.fajfar.hangen.java.Exceptions.TransformationException;
import com.fajfar.hangen.java.ResourceBundles.ErrorMessages;
import com.fajfar.hangen.java.helpers.GenericHelpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HangenTransformationProvider implements TransformationProvider {
    private final Map<TransformationIdentifier, ClassTransformer> transformations;

    public HangenTransformationProvider(){
        transformations = new HashMap<TransformationIdentifier, ClassTransformer>();
    }

    public <TypeTo> TypeTo from(Object source) throws TransformationException {
        ObjectInitializer<TypeTo> initializer = new DefaultObjectInitializer<TypeTo>();
        return from(source, initializer);
    }

    public <TypeTo> TypeTo from(Object source, ObjectInitializer<TypeTo> initializer) throws TransformationException {
        TypeTo destinationInstance = initializer.getInstance();
        Class sourceType = source.getClass();
        Class destinationType = new GenericHelpers<TypeTo>().getGenericClass();

        ClassTransformer transformer = transformations.get(new SimpleTransformationIdentifier(sourceType, destinationType));

        if(transformer == null){
            throw new TransformationException(ErrorMessages.transformationProviderNotFound(sourceType, destinationType));
        }

        return transformer.fillMembers(source, destinationInstance, transformations);
    }

    public <TypeTo> List<TypeTo> fromList(List source) throws TransformationException {
        return fromList(source, new DefaultObjectInitializer<TypeTo>());
    }

    public <TypeTo> List<TypeTo> fromList(List source, ObjectInitializer<TypeTo> initializer) throws TransformationException {
        List<TypeTo> destinationList = new ArrayList<TypeTo>();
        Class sourceType = source.getClass();
        Class destinationType = new GenericHelpers<TypeTo>().getGenericClass();

        ClassTransformer transformer = transformations.get(new SimpleTransformationIdentifier(sourceType, destinationType));

        if(transformer == null){
            throw new TransformationException(ErrorMessages.transformationProviderNotFound(sourceType, destinationType));
        }

        for (Object sourceItem : source){
            destinationList.add(transformer.fillMembers(sourceItem, initializer.getInstance(), transformations));
        }

        return destinationList;
    }
}
