package JavaBlackBelt.generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello",123);
        System.out.println("�������� ����: value1 = " + pair1.getFirstValue() +
                ", value2 = " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(111,123.14);
        System.out.println("�������� ����: value1 = " + pair2.getFirstValue() +
                ", value2 = " + pair2.getSecondValue());

        OtherPair<String> pair3 = new OtherPair<>("Privet", "Poka");
        System.out.println("�������� ����: value1 = " + pair3.getFirstValue() +
                ", value2 = " + pair3.getSecondValue());

    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue() {
        return value1;
    }
    public V2 getSecondValue() {
        return value2;
    }

}

class OtherPair<V> {
    private V value1;
    private V value2;

    public  V abc(V val) {
        return val;
    }
    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getFirstValue() {
        return value1;
    }
    public V getSecondValue() {
        return value2;
    }

}