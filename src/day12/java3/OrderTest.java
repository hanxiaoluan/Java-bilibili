package day12.java3;

import day12.java2.Order;

/**
 * Created by apple on 6/4/21 2:16 PM Done is better than perfect!!
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();
        //
        // order.orderPrivate = 2;
        // order.orderDefault = 3;
        // order.orderProtected = 4;
        //
        // order.methodPrivate();
        // order.methodDefault();
        // order.methodProtected();
    }
}
