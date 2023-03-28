package KataAcademy.Exceptions;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName2());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName2());
    }

    public static String getCallerClassAndMethodName()  {
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
    public static String getCallerClassAndMethodName2() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String ans = null;
        if (stackTraceElements.length <= 3) {
            return ans;
        } else {
            StackTraceElement element = stackTraceElements[3];
            ans = element.getClassName() + "#" + element.getMethodName();
        }
        return ans;
    }
}


