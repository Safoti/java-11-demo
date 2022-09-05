package com.safoti.demo.java11.strings;

/**
 * @author safoti
 * @Description 新增string 方法
 * @createTime 2022年09月05日
 */
public class APITester {
    public static void main(String[] args) {
        String sample = " abc ";
        System.out.println(sample.repeat(2));
        System.out.println(sample.isBlank());
        System.out.println(sample.isEmpty());
        String emp="";
        System.out.println(emp.isEmpty());
        System.out.println(emp.isBlank());

        System.out.println("".isBlank()); // true
        System.out.println("   ".isBlank()); // true
        System.out.println(sample.strip()); // "abc"
        System.out.println(emp.strip()); //
        System.out.println("   ".strip()); //

        System.out.println(sample.stripLeading()); // "abc "
        System.out.println(sample.stripTrailing()); // " abc"
    }
}
