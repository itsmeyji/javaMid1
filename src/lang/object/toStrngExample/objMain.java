package lang.object.toStrngExample;

public class objMain {
    public static void main(String[] args) {
        MyObject first = new MyObject(101, "first");
        MyObject second = new MyObject(202, "Second");

        System.out.println(first.toString());
        System.out.println(second.toString());
    }
}
