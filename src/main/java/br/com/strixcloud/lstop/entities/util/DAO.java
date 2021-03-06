package br.com.strixcloud.lstop.entities.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class DAO<K, V> {

    protected Map<K, V> OBJECTS = new HashMap<>();

    public abstract void add(V value);

    public abstract void remove(K key);

    public void add(K key, V value) {
        OBJECTS.put(key, value);
    }

    public boolean has(K key) {
        return OBJECTS.containsKey(key);
    }

    public V get(K key) {
        return OBJECTS.get(key);
    }

    public List<V> get() {
        return new ArrayList<>(OBJECTS.values());
    }

    public void delete(K key) {
        OBJECTS.remove(key);
    }

    public void clear() {
        OBJECTS.clear();
    }

}
