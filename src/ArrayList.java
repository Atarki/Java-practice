public class ArrayList<E> {
    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("14");
        list.add(5);

        /*for (int i = 0; i < 10000; i++) {
            list.add(i);
        }*/

        System.out.println(list.toString());
        System.out.println("size:" + list.size());

        System.out.println("-------------------");

        list.remove(0);
        list.remove("14");

        System.out.println(list.toString());
        /*for (int i = 0; i < list.array.length; i++) {
            System.out.println(list.array[i]);
        }
        System.out.println("array size = " + list.array.length);*/

        System.out.println("size:" + list.size());
        list.add(77);
        System.out.println("add 77");
        list.add(33, 3);
        System.out.println("add 33 in 3 index");
        list.set(12, 0);
        System.out.println("set #0 = " + list.get(0));


        System.out.println("size:" + list.size());
        System.out.println(list.toString());

        list.add(55, 1);
        list.add(88, 3);

        System.out.println("-------------------------");
        System.out.println(list.toString());

        System.out.println("------------------------------");

        System.out.println("size:" + list.size());
        System.out.println("get index #1 = " + list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(12));
        System.out.println(list.lastIndexOf(2));
        System.out.println(list.lastIndexOf(3));
        System.out.println("List contains 12 ? : " + list.contains(12));

//        System.out.println(list.get(100));
//        list.set(100, 100);
//        list.add(15, 12);
        System.out.println(list.toString());

        list.clear();
        System.out.println("List is empty:" + list.isEmpty());
    }

    private int size = 0;
    private Object[] array;

    public ArrayList() {
        array = new Object[5];
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            if (array[i] != null) string += array[i] + ", ";
        }
        return string;
    }

    public int size() {
        return size;
    }

    public void add(Object object) {
        if (size == array.length) {
            Object[] array2 = new Object[(array.length) * 2];
            System.arraycopy(array, 0, array2, 0, size);
            array = array2;
        }
        for (int i = 0; i < size + 1; i++) {
            if (array[i] == null) {
                array[i] = object;
                size++;
                return;
            } else {
                array[size] = object;
                size++;
                return;
            }
        }
    }

    public void add(Object object, int index) throws Exception {
        validate(index);
        if (size == array.length) {
            Object[] array2 = new Object[(array.length) * 2];
            System.arraycopy(array, 0, array2, 0, size);
            array = array2;
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = object;
        size++;
    }

    public void remove(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i])) {
                System.arraycopy(array, i + 1, array, i, (size - i) - 1);
                size--;
            }
        }
    }

    public void remove(int index) throws Exception {
        validate(index);
        System.arraycopy(array, index + 1, array, index, (size - index) - 1);
        size--;
    }

    public Object get(int index) throws Exception {
        validate(index);
        return array[index];
    }

    public void set(Object object, int index) throws Exception {
        validate(index);
        array[index] = object;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i]))
                return i;
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        for (int i = size - 1; i > 0; i--) {
            if (object.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public boolean contains(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    private void validate(int index) {
        if (index < 0 || index > size) {
            try {
                throw new Exception("My IndexOfBound(Outside array) Exception" + " Index: " + index + " Size: " + size);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void validateAdd(int index) {
        if (index < 0 || index > size - 1) {
            try {
                throw new Exception("Me OutOfBound Exception" + " Index: " + index + " Size: " + size);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
