package lang.object.toStrngExample;

public class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("이름 : %s, 나이 : %d세", name, age);
    }
}