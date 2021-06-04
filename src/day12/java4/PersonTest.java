package day12.java4;

/**
 * Created by apple on 6/4/21 8:26 PM Done is better than perfect!!
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        Man man = new Man();
        man.eat();
        man.age = 25;
        man.goShopping();

        Person p2 = new Man();
        Person p3 = new Woman();

        p2.eat();
        p2.walk();

        Man m = (Man)p2;
        m.goShopping();
        System.out.println(p2.id);
        System.out.println(p3.id);
    }
}
