import java.util.Arrays;

public class ArrayList<E> {
    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("14");
        list.add(5);

       /* for (int i = 0; i < 100; i++) {
            list.add(i);
        }*/

        System.out.println(list.toString());

        System.out.println("-------------------");

        list.remove(0);
        list.remove("14");

        System.out.println(list.toString());

        System.out.println("size:" + list.size());
        list.add(33, 4);
        list.set(12, 0);

        System.out.println("Was setting #0= " + list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.add(28, 1);
        list.add(77, 3);
        System.out.println("-------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------------------");

        System.out.println("size:" + list.size());
        System.out.println("get index #1 = " + list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(12));
        System.out.println(list.lastIndexOf(2));
        System.out.println(list.lastIndexOf(3));
        System.out.println("List contains 12 ? : " + list.contains(12));
//        list.clear();
//        System.out.println("List is empty:" + list.isEmpty());

        System.out.println(list.get(100));
        list.set(100, 100);
        list.add(15, 12);
        System.out.println(list.toString());

    }

    private int size = 0;
    private Object[] array = new Object[10];

    public ArrayList() {
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
        if (size == array.length) array = Arrays.copyOf(array, (array.length) * 2);
        for (int i = 0; i < array.length + 1; i++) {
            if (array[i] == null) {
                array[i] = object;
                size++;
                break;
            }
        }
    }

    public void add(Object object, int index) throws Exception {
        validate(index);
        if (size == array.length) array = Arrays.copyOf(array, (array.length) * 2);
        Object tmp3 = null;
        for (int i = index; i < size - index; i++) {
            if (tmp3 != null) {
                array[i] = tmp3;
            }
            Object tmp = array[index];
            Object tmp2 = array[index + 1];
            array[index + 1] = tmp;
            tmp3 = tmp2;
        }
        array[index] = object;
        size++;
    }

    public void remove(Object object) {
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i])) {
                for (int j = i; j < array.length - 1; j++) {
                    array[i] = array[i + 1];
                }
                size--;
                array[array.length - 1] = null;
            }
        }
    }

    public void remove(int index) throws Exception {
        validate(index);
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
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

    private void validate(int index) throws Exception {
        if (index < 0 || index > array.length) {
            throw new Exception("My IndexOfBound Exception" + " Index: " + index + " Size: " + array.length);
        }
    }
}
