package KataAcademy.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex3_2 {
    public static void main(String[] args) {

        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("Hello");
//        dynamicArray.add("Privet");
//        dynamicArray.remove(0);
        System.out.println(dynamicArray.get(1));
//        DynamicArray array = new DynamicArray<>();
//        int count = 0;
//        while (count < 20){
//            System.out.println(array.length() + " length");
//            array.add("One");
//            System.out.println(array.get(count));
//            System.out.println(array.size());
//            count++;
//       }
    }

    public static class DynamicArray<T> {

        private Object[] array = new Object[10];
        private int size = 0;

        public DynamicArray() {
        }

        public void add(T el) {
            if (size == array.length) {
                array = Arrays.copyOf(array, array.length * 2);
            }
            array[size] = el;
            size++;
        }

        public void remove(int index) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
            size--;
        }

        public T get(int index) {
            if (index > size - 1 || index < 0) {
                throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
            }
            return (T) array[index];
        }
    }
}