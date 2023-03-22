package KataAcademy.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {

        DynamicArray<String> dynamicArray = new DynamicArray<>();
//        String a = dynamicArray.get(0);

        dynamicArray.add("Hello");
        dynamicArray.add("Privet");
        dynamicArray.remove(0);
        System.out.println(dynamicArray.get(0));
        System.out.println(dynamicArray.length());
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
        private Object[] array;
        private int count = 0;

        public DynamicArray() {
        }

        public void add(T el) {
            if (count == 0) {
                array = new Object[++count];
            } else {
                array = Arrays.copyOf(array, ++count);

            }
            array[count - 1] = el;
        }

        public void remove(int index) {
            if (index >= count || index < 0) {
                throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
            } else {
                Object[] newArray = new Object[--count];
                if (count != 0) {
                    for (int i = 0; i < count; i++) {
                        if (i == index) {
                            newArray[i] = array[i + 1];
                        }
                        if (i < index) {
                            newArray[i] = array[i];
                        } else if (i > index) {
                            newArray[i] = array[i + 1];
                        }
                    }
                }
                array = newArray;
            }
        }
        public T get(int index) {
            if (index > count || index < 0) {
                throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
            }
            return (T) array[index];
        }
        public int length(){
            if (count == 0) {
                return 0;
            }
            return array.length;
        }
        public int size() {
            return count;
        }
    }
}



