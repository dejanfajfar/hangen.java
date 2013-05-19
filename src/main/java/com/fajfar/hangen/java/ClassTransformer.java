package com.fajfar.hangen.java;

import java.util.Map;

public interface ClassTransformer {
    Class getSourceType();
    Class getDestinationType();

    <TypeTo, TypeFrom> TypeTo fillMembers(TypeFrom source, TypeTo destinationInstance, Map<TransformationIdentifier,ClassTransformer> transformations);
}
