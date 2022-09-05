package com.safoti.demo.java11.collection;

import java.util.Arrays;
import java.util.List;

/**
 * @author safoti
 * @Description 集合转换成数组
 * @createTime 2022年09月05日
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Joe", "Julie");
        //旧方式
        String[] names = namesList.toArray(new String[namesList.size()]);
        System.out.println(names.length);

        //新方式
        names=namesList.toArray(String[]::new);
        System.out.println(names.length);


    }
}
