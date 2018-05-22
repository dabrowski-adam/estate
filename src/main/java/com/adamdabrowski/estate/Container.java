package com.adamdabrowski.estate;

import java.util.List;

public interface Container<T> {
    boolean put(T obj);
    boolean remove(T obj);
    List<T> getAll();
}
