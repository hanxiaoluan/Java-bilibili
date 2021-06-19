package day13.java2;

import org.junit.Test;

/**
 * Created by apple on 6/19/21 8:36 PM Done is better than perfect!!
 */
public class JUnitTest {
    int num = 10;

    @Test
    public void testEquals() {
        String s1 = "MM";
        String s2 = "MM";

        System.out.println(s1.equals(s2));
    }

    public void show() {
        num = 20;
        System.out.println("show()....");
    }

    @Test
    public void testToString() {
        String s2 = "MM";
        System.out.println(s2.toString());
    }
}
