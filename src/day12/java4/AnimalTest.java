package day12.java4;

/**
 * Created by apple on 6/4/21 8:07 PM Done is better than perfect!!
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());

        test.func(new Cat());
    }

    public void func(Animal animal) {
        animal.eat();
        animal.shout();

        if (animal instanceof Dog) {
            Dog d = (Dog)animal;
            d.watchDoor();
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("动物：进食");
    }

    public void shout() {
        System.out.println("动物：叫");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void shout() {
        System.out.println("汪汪汪");
    }

    public void watchDoor() {
        System.out.println("看门");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void shout() {
        System.out.println("喵喵买");
    }

}