package day12.java3;

/**
 * Created by apple on 6/4/21 2:41 PM Done is better than perfect!!
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public Person() {
        System.out.println("我无处不在!");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void eat() {
        System.out.println("人：吃饭");
        System.out.println("人L：走路");
    }

    public void walk() {
        System.out.println("人：走路");
    }

}
