package Collections;

public class LinkedList<E> implements List<E> {
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
        list.add("52");
        list.add(32);
        list.add(99);
        list.add("45");
        System.out.println("Size 1: " + list.size);
        System.out.println(list.toString());
        list.remove("33");
        System.out.println(list.toString());
        list.remove("52");
        System.out.println(list.toString());
        list.remove(2);
        System.out.println(list.toString());
        System.out.println("Size: " + list.size);
        System.out.println(list.get(5));
        System.out.println(list.toString());
        System.out.println("Size: " + list.size);
        list.add("777", 7);
        System.out.println(list.toString());
        list.add("777", 0);
        System.out.println(list.toString());
        System.out.println("Size per 358: " + list.size);
        list.add(358, 0);
        System.out.println(list.toString());
        System.out.println("Size per 222: " + list.size);
        list.add(222, 0);
        System.out.println(list.toString());
        System.out.println("Size per 333: " + list.size);
        list.add(333, 11);
        System.out.println(list.toString());
        list.set("888", 0);
        System.out.println(list.toString());
        System.out.println(list.indexOf("777"));
        System.out.println(list.contains(32));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }

    @Override
    public void add(E e) {
        add(e, size);
    }

    @Override
    public void add(E e, int index) {
        validate(index);
        Entry<E> newEntry = new Entry<E>(e);

        //Direction of Entry movement first----->>>>>>> last (next)
        //in range, example list[10], 1 to 9
        if (index > 0) {
            Entry entry = first;
            for (int i = 0; i < index - 1; i++) {
                entry = entry.getNext();
            }
            last.setNext(newEntry);
            newEntry.setPrev(last);
            last = newEntry;
            size++;
            return;
        }

        //if last element
        if (index == size && index != 0) {
            Entry entry = last;
            entry.setNext(newEntry);
            newEntry.setPrev(entry);
            newEntry = last;
            size++;
            return;
        }

        //if index #0
        if (index == 0 && first != null) {
            newEntry.setPrev(null);
            newEntry.setNext(first);
            first.setPrev(newEntry);
            first = newEntry;
            size++;
            return;
        }

        //if list is empty or index #0
        if (size == 0) {
            first = last = newEntry;
            newEntry.setNext(newEntry);
            newEntry.setPrev(newEntry);
            size++;
        }
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
                size--;
                return;
            } else {
                entry = entry.getNext();
            }
        }
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


    private void validate(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("There is no such index. Index is outside of the list.");
        }
    }

    public Entry<E> getFirst() {
        return first;
    }

    public Entry<E> getLast() {
        return last;
    }

    @Override
    public void clear() {
        Entry<E> entry = first;
        for (int i = 0; i < size; i++) {
            entry.setItem(null);
            entry = entry.getNext();
        }
        size = 0;
    }

    @Override
    public void set(E e, int index) {
        Entry<E> entry = first;
        for (int i = 0; i < index - 1; i++) {
            entry = entry.getNext();
        }
        entry.setItem(e);
    }

    @Override
    public String toString() {
        Entry<E> entry = first;
        String toString = "[";
        for (int i = 0; i < size; i++) {
            toString += entry.getItem() + ",";
            entry = entry.getNext();
            if (entry.equals(last)) {
                toString += entry.getItem();
                break;
            }
        }
        return toString += "]";
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int indexOf(E e) {
        int index = 0;
        Entry<E> entry = first;
        for (int i = 0; i < size; i++) {
            if (entry.getItem().equals(e)) {
                return index;
            }
            entry = entry.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        return size;
    }

    @Override
    public boolean contains(E e) {
        Entry<E> entry = first;
        for (int i = 0; i < size; i++) {
            if (entry.getItem().equals(e)) {
                return true;
            }
            entry = entry.getNext();
        }
        return false;
    }
}