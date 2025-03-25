package lang.object.poly;

import lang.object.ObjectMain;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        obj.sound();
        // 상단 코드는 컴파일 오류 발생 : Object는 sound() 함수가 없음
        // 개별 코드를 사용하기 위해서는 개별 객체 생성 후 개별 매서드 호출해야 함
        // 또는 객체에 맞는 다운캐스팅 필요


        // 다운캐스팅 사용한 코드
        if (obj instanceof Dog dog) {
            dog.sound();
            // if (onj instanceof Dog){
            //    ((Dog)dog).sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
