package Collections;

public class LinkedList<E> implements List<E> {
//    private Entry<E> entry;
    private Entry<E> first;
    private Entry<E> last;
    int size = 0;

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<Object>();
        list.add(15);
        list.add("33");
        list.add(55);
        list.add(77);
        list.add(88);
        list.add(34);
        list.add(52);
        list.add(32);
        list.add(99);
        list.add(45);
//        for (int i = 0; i < list.size; i++) {
//            System.out.println(list.get(i));
//        }
        System.out.println(list.toString());
        System.out.println("Size: " + list.size);
        list.remove("33");
        list.remove("45");
        list.remove(2);
        System.out.println(list.toString());
        System.out.println("Size: " + list.size);
        System.out.println(list.get(5));
        System.out.println(list.toString());
        System.out.println("Size: " + list.size);
        list.clear();
    }

    @Override
    public void add(E e) {
        addFirst(e);
    }

    @Override
    public void add(E e, int index) {
        validate(index);
        Entry<E> newEntry = new Entry<E>(e);

//        if (index == size) {
//            addFirst(e);
//        }

        Entry entry = first;
        for (int i = 0; i < index - 1; i++) {
            entry = entry.getNext();
        }

        last.setNext(newEntry);
        newEntry.setPrev(last);
        last = newEntry;

        size++;
    }

    @Override
    public void remove(E e) {
        Entry<E> entry = first;
        for (int i = 0; i < size; i++) {
            if (e.equals(entry.getItem())) {
                entry.getPrev().setNext(entry.getNext());
                entry.getNext().setPrev(entry.getPrev());
                entry.setNext(null);
                entry.setPrev(null);
                entry.setItem(null);
                break;
            } else {
                entry = entry.getNext();
            }
        }
        size--;
    }

    @Override
    public void remove(int index) {
        validate(index);
        Entry<E> entry = first;
        for (int i = 0; i < index; i++) {
            entry = entry.getNext();
        }
        entry.getPrev().setNext(entry.getNext());
        entry.getNext().setPrev(entry.getPrev());

        entry.setNext(null);
        entry.setPrev(null);
        entry.setItem(null);

        size--;
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
        validate(index);
        Entry<E> entry = first;
        for (int i = 0; i < index; i++) {
            if (entry.getNext() != null) {
                entry = entry.getNext();
            }
        }
        return entry.getItem();
    }

    @Override
    public void validate(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("There is no such index. Index is outside of the list.");
        }
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
        Entry<E> entry = first;
        for (int i = 0; i < size; i++) {
            entry.setItem(null);
            entry = entry.getNext();
        }
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