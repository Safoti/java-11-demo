package com.safoti.demo.java11.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author safoti
 * @Description lambda 中使用var
 * @createTime 2022年09月05日
 */
@interface NonNull {}
public class LambdaTest {
    /**
     * (var v1, v2) -> v1 + v2
     *
     *(var v1, String v2) -> v1 + v2
     *
     * var v1 -> v1.toLowerCase()
     */
    public static void main(String[] args) {
        List<String> tutorialsList = Arrays.asList("Java", "HTML");
        String tutorials = tutorialsList.stream()
                .map((@NonNull var tutorial)->tutorial.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(tutorials);
    }
}
