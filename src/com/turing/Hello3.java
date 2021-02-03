package com.turing;

public class Hello3 {
    /**
     * 斐波拉契数列
     * 1    1   2   3
     * 请问第十个月有多少
     * @param args
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println(a + "\t" + b + "\t");
            a = a + b;
            b = a + b;
        }
    }
}
