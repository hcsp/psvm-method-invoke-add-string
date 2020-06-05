package com.github.hcsp;

public class Main {
    public static void main(String[] args) {
        System.out.println("aaa+bbb=" + add("aaa", "bbb"));
        System.out.println("cat+dog=" + add("cat", "dog"));
    }
    public static String add(String x,String y){
        return x + y;
    }
}
