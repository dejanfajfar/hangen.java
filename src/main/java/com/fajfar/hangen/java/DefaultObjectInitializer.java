package com.fajfar.hangen.java;

import com.fajfar.hangen.java.Exceptions.TransformationException;
import com.fajfar.hangen.java.ResourceBundles.ErrorMessages;
import com.fajfar.hangen.java.helpers.GenericHelpers;

public class DefaultObjectInitializer<T> implements ObjectInitializer {

    public T getInstance() throws TransformationException {
        Class<T> clazz = new GenericHelpers<T>().getGenericClass();
        try{
            return clazz.newInstance();
        }catch (InstantiationException e) {
            throw new TransformationException(ErrorMessages.destinationInitializationFailed(clazz), e);
        } catch (IllegalAccessException e) {
            throw new TransformationException(ErrorMessages.destinationInitializationCausedIllegalAccess(clazz), e);
        }
    }
}
