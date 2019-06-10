package com.github.hcsp;

import static com.sun.javafx.fxml.expression.Expression.add;

public class Main {
    public static void main(String[] args) {
        System.out.println("aaa+bbb=" + add("aaa", "bbb"));
        System.out.println("cat+dog=" + add("cat", "dog"));
    }

    private static String add(String a, String b){
        return(a + " " +b);
    }
    // Create an add(String a, String b) method to concatenate two strings
    // 在这里编写一个add(String a, String b)方法进行字符串连接
}
