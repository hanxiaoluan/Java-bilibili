package day11;

/**
 * Created by apple on 5/24/21 4:52 PM Done is better than perfect!!
 */
public class Person extends Creature {
    String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
        sleep();
    }

    private void sleep() {
        System.out.println("睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
