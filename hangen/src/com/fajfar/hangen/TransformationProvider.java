package com.fajfar.hangen;


import java.util.List;

public interface TransformationProvider {
    <TTo> TTo From(Object source);
    <TTo> List<TTo> From(List source);
}
