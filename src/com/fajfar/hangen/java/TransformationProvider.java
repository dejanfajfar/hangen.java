package com.fajfar.hangen.java;

import java.util.List;

public interface TransformationProvider {
    public <TypeTo> TypeTo from(Object source);
    public <TypeTo> List<TypeTo> fromList(List source);
}
