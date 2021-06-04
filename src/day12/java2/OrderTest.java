package day12.java2;

/**
 * Created by apple on 6/4/21 11:52 AM Done is better than perfect!!
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        // 同一个包中的其他类,不可以调用Order类中私有的属性、方法
        // order.orderPrivate = 4;
        // order.methodPrivate();
    }
}
