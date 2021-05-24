package day11;

/**
 * Created by apple on 5/24/21 5:34 PM Done is better than perfect!!
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        System.out.println("************************");

        Student s1 = new Student();
        s1.eat();
        s1.name = "Tom";
        s1.setAge(10);
        System.out.println(s1.getAge());

        s1.breath();

        Creature c = new Creature();
        System.out.println(c.toString());
    }
}
