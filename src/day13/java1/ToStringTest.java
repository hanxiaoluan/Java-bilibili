package day13.java1;

import java.util.Date;

/**
 * Created by apple on 6/19/21 8:31 PM Done is better than perfect!!
 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", 21);
        System.out.println(cust1.toString());// com.atguigu.java1.Customer@15db9742-->Customer[name = Tom,age = 21]
        System.out.println(cust1);// com.atguigu.java1.Customer@15db9742-->Customer[name = Tom,age = 21]

        String str = new String("MM");
        System.out.println(str);// MM

        Date date = new Date(4534534534543L);
        System.out.println(date.toString());// Mon Sep 11 08:55:34 GMT+08:00 2113
    }
}
