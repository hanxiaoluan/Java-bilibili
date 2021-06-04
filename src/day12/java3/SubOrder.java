package day12.java3;

import day12.java2.Order;

/**
 * Created by apple on 6/4/21 2:24 PM Done is better than perfect!!
 */
public class SubOrder extends Order {
    public void method() {
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();
    }
}
