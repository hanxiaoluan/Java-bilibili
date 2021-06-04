package day12.java5;

import java.util.Random;

/**
 * Created by apple on 6/4/21 9:28 PM Done is better than perfect!!
 */
public class InterviewTest {
    public static Animal getInstance(int key) {
        switch (key) {
            case 0:
                return new Cat();
            case 1:
                return new Dog();
            default:
                return new Sheep();
        }
    }

    public static void main(String[] args) {
        int key = new Random().nextInt(3);

        System.out.println(key);

        Animal animal = getInstance(key);

        animal.eat();
    }
}

class Animal {
    protected void eat() {
        System.out.println("animal eat food");
    }
}

class Cat extends Animal {
    @Override
    protected void eat() {
        System.out.println("cat eat fish");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eat bone");
    }
}

class Sheep extends Animal {
    public void eat() {
        System.out.println("Sheep eat grass");
    }
}
