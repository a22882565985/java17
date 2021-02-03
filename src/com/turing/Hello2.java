package com.turing;

public class Hello2 {
    //1 1 2 3 5 8 13--->斐波拉契数列  计算第10个月
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print(a + "\t" + b + "\t");
            a = a + b;
            b = a + b;
        }
    }
}
