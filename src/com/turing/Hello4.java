package com.turing;

public class Hello4 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.println("第"+i+"个月,兔子共有"+f(i)+"对");
        }
    }

    private static int f(int i){//1 2 3 4
        if (i==1||i==2){
            return 1;
        }else{
            return f(i-1)+f(i-2);//2
        }
    }
}
