package com.fajfar.hangen.java;

import com.fajfar.hangen.java.Exceptions.TransformationException;

import java.util.List;

public interface TransformationProvider {
    <TypeTo> TypeTo from(Object source) throws TransformationException;
    <TypeTo> TypeTo from(Object source, ObjectInitializer<TypeTo> initializer) throws TransformationException;
    <TypeTo> List fromList(List source) throws TransformationException;
    <TypeTo> List<TypeTo> fromList(List source, ObjectInitializer<TypeTo> initializer) throws TransformationException;
}
