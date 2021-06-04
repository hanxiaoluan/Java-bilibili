package day12.java1;

/**
 * Created by apple on 6/4/21 11:24 AM Done is better than perfect!!
 */
public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student("计算机科学与技术");
        s.eat();
        s.walk(10);

        System.out.println("**************");

        s.study();

        Person p1 = new Person();
        p1.eat();
    }
}
