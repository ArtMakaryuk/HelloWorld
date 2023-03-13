package JavaBlackBelt.lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        final int i = 10;
        def((String str) -> {
            int a = 5;
            System.out.println(i);
            return str.length();
        });
        System.out.println();
    }
}

interface I {
    int abc(String s);
}