package com.fajfar.hangen.java;

import java.util.List;

public interface TransformationProvider {
    <TypeTo> TypeTo TransformTo(Object source);
    <TypeTo> List<TypeTo> TransformTo(List source);
}
