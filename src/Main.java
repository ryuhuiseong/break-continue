
class Person {
    String name;
    int age;
    String MBTI;
    String work;

    public void sayHello(){
        System.out.println("안녕하세요? 저는 " + name + "입니다. 저의 나이는 " + age + "세 입니다." + "MBTI는 " + MBTI + "입니다.");
    }

    public void work() {
        System.out.println("일하는 중...");
    }
 }
public class Main {
    public static void main(String[] agrs ) {
        Person person = new Person();

        person.name = "류희성";
        person.age = 26;
        person.MBTI = "ENFP";

        person.sayHello();
        person.work();
    }
}