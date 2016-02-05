package Collections;

public interface List<E> {
    void add(E e) throws Exception;

    void add(E e, int index) throws Exception;

    void remove(E e);

    void remove(int index) throws Exception;

    E get(E e);

    E get(int index) throws Exception;

    void clear();

    void set(E e, int index) throws Exception;

    boolean isEmpty();

    int indexOf(Object object);

    int lastIndexOf(Object object);

    boolean contains(Object object);
}
