package com.fajfar.hangen;

import java.util.List;

public interface ConfigurationProvider {
    <TTo> TTo From(Object source);
    <TTo> List<TTo> From(List source);
}
