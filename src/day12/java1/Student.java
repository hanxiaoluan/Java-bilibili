package day12.java1;

/**
 * Created by apple on 6/4/21 11:24 AM Done is better than perfect!!
 */
public class Student extends Person {
    String major;

    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("学习。专业是：" + major);
    }

    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show() {
        System.out.println("我是一个学生");

    }

    public String info() {
        return null;
    }

    public void wal(int distance) {
        System.out.println("重写的方法");
    }
}
