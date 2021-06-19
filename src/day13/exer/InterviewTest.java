package day13.exer;

/**
 * Created by apple on 6/5/21 3:22 PM Done is better than perfect!!
 */
public class InterviewTest {
    public static void main(String[] args) {
        Base base = new Sub();

        base.add(1, 2, 3);

        Sub s = (Sub)base;

        s.add(1, 2, 3);

    }
}

class Base {
    public void add(int a, int... arr) {
        System.out.println("base");
    }

}

class Sub extends Base {

    public void add(int a, int b, int c) {
        System.out.println("sub_2");
    }

    public void add(int a, int[] arr) {
        System.out.println("sub_1");
    }

}