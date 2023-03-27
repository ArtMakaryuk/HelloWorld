package KataAcademy.Exceptions;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        if (stackTraceElements.length >= 3) {
            StackTraceElement element = stackTraceElements[3];
            sb.append(element.getClassName())
                    .append("#")
                    .append(element.getMethodName());

        }
        return sb.toString();
    }
}


