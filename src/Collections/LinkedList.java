package Collections;

public class LinkedList<E> implements List<E> {
    private Entry<E> entry;
    private Entry<E> first;
    private Entry<E> last;
    int size = 0;

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(15);
        list.add(33);
        list.add(55);
        list.add(45);
        for (int i = 0; i < list.size; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.toString());
    }
//    public LinkedList(Entry<E> entry) {
//        entry = entry.getNext() = entry.getPrev();
//    }

    @Override
    public void add(E e) {
        addFirst(e);
    }

    @Override
    public void remove(E e) {
        size--;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public E get(E e) {
        Entry<E> entry = first;
        for (int i = 0; i < size; i++) {
            if (e.equals(entry)) return (E) entry;
            else entry = entry.getNext();
        }
        return null;
    }

    @Override
    public E get(int index) {
        Entry<E> entry = first;
        for (int i = 0; i < index; i++) {
            if (entry.getNext() != null) {
                entry = entry.getNext();
            }
        }
        return entry.getItem();
    }


    public void addFirst(E e) {
        Entry<E> newEntry = new Entry<E>(e);
        if (size == 0) {
            first = last = newEntry;
        } else {
            last.setNext(newEntry);
            newEntry.setPrev(last);
            last = newEntry;
        }
        size++;

    }

    public void addLast(E e) {
        Entry<E> newEntry = new Entry<E>(e);
        if (size == 0) {
            first = last = newEntry;
        } else {
            last.setNext(newEntry);
            newEntry.setPrev(last);
        }
        size++;
    }

    public void removeFirst() {
        size--;
    }


    public void removeLast() {

        size--;
    }

    public Entry<E> getFirst() {
        return first;
    }

    public Entry<E> getLast() {
        return last;
    }

    public void clear() {
        size = 0;
    }


    @Override
    public String toString() {
        Entry<E> entry = first;
        String toString = "[";
        for (int i = 0; i < size; i++) {
            toString += entry.getItem() + ",";
            entry = entry.getNext();
        }
        return toString += "]";
    }
}