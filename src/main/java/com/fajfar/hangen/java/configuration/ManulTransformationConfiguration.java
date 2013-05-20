package com.fajfar.hangen.java.configuration;

import com.fajfar.hangen.java.ClassTransformer;
import com.fajfar.hangen.java.Exceptions.TransformationException;
import com.fajfar.hangen.java.ResourceBundles.ErrorMessages;
import com.fajfar.hangen.java.TransformationIdentifier;
import com.fajfar.hangen.java.helpers.GenericHelpers;

import java.util.Map;

public abstract class ManulTransformationConfiguration<TSource, TDestination> implements ClassTransformationConfiguration<TSource, TDestination> {
    protected abstract void doTransformation(TSource source, TDestination destination, Map<TransformationIdentifier, ClassTransformer> transformations);

    public TDestination transform(TSource source) throws TransformationException {
        if(source == null){
            // NOTE maybe a simple argument exception could do here
            throw new TransformationException(
                    new IllegalArgumentException(
                            ErrorMessages.sourceInstanceNullInTransformaation(
                                    new GenericHelpers<TSource>().getGenericClass(),
                                    new GenericHelpers<TDestination>().getGenericClass()
                            )));
        }
        return null;
    }
}
