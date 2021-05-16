package day10.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import day10.Person;
import day10.exer3.Account;

/**
 * Created by apple on 5/16/21 4:28 PM Done is better than perfect!!
 */
public class PackageImportTest {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[] {1, 2, 3});

        ArrayList list = new ArrayList();
        HashMap map = new HashMap();

        Scanner s = null;

        System.out.println("hello world");

        Person p = new Person();
        Account acct = new Account(1000, 10.0, 10.0);
    }
}
