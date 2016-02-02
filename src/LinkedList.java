public class LinkedList<E> {
    private Entry entry;
    private Header header;
    E first;
    E last;
    int size;

    public LinkedList(Header header) {
//        this.header = header;
        header.next = header.previous = header;
    }

    private class Header<E> {
        Header next;
        Header previous;
        E item;
    }
    private class Entry<E> {
        Entry next;
        Entry previous;
        E item;

    }
    public void addFirst(){
        size++;

    }
    public void addLast(){

        size++;
    }
    public void removeFirst(){
        size--;
    }

    public void remove(int index) {
        size--;

    }

    public void remove(Object o) {
        size--;

    }
    public void removeLast(){

        size--;
    }
    public E getFirst(){
        return first;
    }
    public E getLast(){
        return last;
    }
    public void clear() {
        size = 0;
    }
}
