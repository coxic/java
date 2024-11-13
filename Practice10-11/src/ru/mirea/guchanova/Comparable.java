package ru.mirea.guchanova;

public interface Comparable<T> {
    default int compareTo(T o) {
        return 0;
    }
}
