package day13.java1;

import java.util.Date;

/**
 * Created by apple on 6/19/21 7:53 PM Done is better than perfect!!
 */
public class EqualTest {
    public static void main(String[] args) {

        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);
        System.out.println(i == d);

        boolean b = true;

        // System.out.println(i==b);

        char c1 = 'A';
        char c2 = 65;

        System.out.println(c1 == c2);

        Customer cust1 = new Customer("Tom", 21);
        Customer cust2 = new Customer("Tom", 21);
        System.out.println(cust1 == cust2);

        String str1 = new String("atguigu");
        String str2 = new String("atguigu");
        System.out.println(str1 == str2);
        System.out.println("***********************");
        System.out.println(cust1.equals(cust2));
        System.out.println(str1.equals(str2));

        Date date1 = new Date(32432525324L);
        Date date2 = new Date(32432525324L);
        System.out.println(date1.equals(date2));
    }
}
