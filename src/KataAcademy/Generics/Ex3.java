package KataAcademy.Generics;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {

    }
    public static class DynamicArray<T> {

        private final T[] array;

        private int size = 16;
        private int count = 0;

        public DynamicArray(T[] array) {
            this.array = array;
        }
        public void add(T el) {
            if (count < size) {
                array[count] = el;
                count++;
            } else size=size*2;
            array[count] = el;
            count++;
        }
        public void remove(int index) {

        }
      /*  public T getIndex(int index) {

            return array[T];
        }*/
    }

}
