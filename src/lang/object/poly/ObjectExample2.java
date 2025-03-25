package lang.object.poly;

public class ObjectExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object();  // object 인스턴스도 만들 수 있음

        Object[] objs = {dog, car, obj};

        size(objs);
    }

    // 이 메서드를 복사해서 어디서든 사용 가능 왜냐면 object는 아무데나 적용되기때문
    private static void size(Object[] objs) {
        System.out.println("전달된 객체의 수는 : "+ objs.length);
    }
}
