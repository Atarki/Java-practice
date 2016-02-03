package Collections;
public class Entry<E> {
    private Entry<E> next;
    private Entry<E> prev;
    private E item;

    public Entry<E> getNext() {
        return next;
    }

    public void setNext(Entry<E> next) {
        this.next = next;
    }

    public Entry<E> getPrev() {
        return prev;
    }

    public void setPrev(Entry<E> prev) {
        this.prev = prev;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Entry(E item) {
        this.item = item;
    }
}