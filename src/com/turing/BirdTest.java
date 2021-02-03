package com.turing;

public class BirdTest {
    public void test(Bird bird){
        System.out.println(bird.getName()+"能够飞"+bird.fly()+"米");
    }

    public static void main(String[] args) {
        BirdTest test = new BirdTest();
        test.test(new Bird() {
            @Override
            public int fly() {
                return 100;
            }
            public String getName(){
                return "大雁";
            }
        });
    }
}
