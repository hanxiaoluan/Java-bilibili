package day12.java1;

/**
 * Created by apple on 6/4/21 11:23 AM Done is better than perfect!!
 */
public class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("吃饭");
    }

    public void walk(int distance) {
        System.out.println("走路，走的距离是：" + distance + "公里");
        show();
        eat();
    }

    public void show() {
        System.out.println("我是一个人");
    }

    public Object info() {
        return null;
    }

    public double info1() {
        return 1.0;
    }
}
