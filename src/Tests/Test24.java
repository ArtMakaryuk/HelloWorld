package Tests;

public class Test24 {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("������������������ - " + answer.toString());//Hello!
        System.out.println("������ � - " + answer.length());//6
        System.out.println("������ ��� � 1 - " + answer.charAt(1));//e
        System.out.println("��������������������� - " + answer.subSequence(1, 5));//ello
//�������� �� ��������� ������������ private ����
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }
}
