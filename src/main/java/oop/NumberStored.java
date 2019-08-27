package oop;

public class NumberStored<T> {
    private final T value;

    public NumberStored(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
