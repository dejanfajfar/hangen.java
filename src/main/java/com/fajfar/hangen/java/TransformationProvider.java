package com.fajfar.hangen.java;

import java.util.List;

public interface TransformationProvider {
    <TypeTo> TypeTo from(Object source);
    <TypeTo> TypeTo from(Object source, ObjectInitializer<TypeTo> initializer);
    <TypeTo> List<TypeTo> fromList(List source);
    <TypeTo> List<TypeTo> fromList(List source, ObjectInitializer<TypeTo> initializer);
}
