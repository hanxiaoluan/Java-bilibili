package day11;

/**
 * Created by apple on 5/24/21 4:58 PM Done is better than perfect!!
 */
public class Student extends Person {
    String major;

    public Student() {

    }

    public Student(String name, int age, String major) {
        this.name = name;
        setAge(age);
        this.major = major;
    }

    public void study() {
        System.out.println("学习");
    }

    public void show() {
        System.out.println("name: " + name + ",age" + getAge());
    }
}
