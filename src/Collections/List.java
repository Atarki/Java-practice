package Collections;

public interface List<E> {
    void add(E e);

    void add(E e, int index);

    void remove(E e);

    void remove(int index);

    E get(E e);

    E get(int index);

    void validate(int index);
}
