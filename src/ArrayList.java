public class ArrayList<E> {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("14");
        list.add(5);

        System.out.println(list.toString());

        System.out.println("-------------------");

        list.remove(0);
        list.remove("14");

        System.out.println(list.toString());

        System.out.println("size:" + list.size());
        list.add(33, 4);
        list.set(12, 0);

        System.out.println("seted #0= " + list.get(0));

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
        list.clear();
        System.out.println("List is empty:" + list.isEmpty());
    }

    private static int count = 0;
    private Object[] array = new Object[10];

    public ArrayList() {
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) string += array[i] + ", ";
        }
        return string;
    }

    public int size() {
        return count;
    }

    public void add(Object object) {
        for (int i = 0; i < array.length + 1; i++) {
            if (array[i] == null) {
                array[i] = object;
                count++;
                break;
            }
        }
    }

    public void add(Object object, int index) {
        Object tmp3 = null;
        for (int i = index; i < array.length - index; i++) {
            if (tmp3 != null) {
                array[i] = tmp3;
            }
            Object tmp = array[index];
            Object tmp2 = array[index + 1];
            array[index + 1] = tmp;
            tmp3 = tmp2;
        }
        array[index] = object;
        count++;
    }

    public void remove(Object object) {
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i])) {
                for (int j = i; j < array.length - 1; j++) {
                    array[i] = array[i + 1];
                }
                count--;
                array[array.length - 1] = null;
            }
        }
    }

    public void remove(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public Object get(int index) {
        return array[index];
    }

    public void set(Object object, int index) {
        array[index] = object;
    }

    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(Object object) {
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i]))
                return i;
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        for (int i = array.length - 1; i > 0; i--) {
            if (object.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public boolean contains(Object object) {
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i])) {
                return true;
            }
        }
        return false;
    }
}
