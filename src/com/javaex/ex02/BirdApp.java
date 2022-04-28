package com.javaex.ex02;

public class BirdApp {
	//수정하지말것
	//클래스 Bird( 추상클래스 ), Duck, Sparrow 를 작성하세요
    public static void main(String[] args) {
        Bird bird01 = new Duck();
        bird01.setName("꽥꽥이");
        bird01.fly();
        bird01.sing();
        bird01.showName();

        Bird bird02 = new Sparrow();
        bird02.setName("짹짹이");
        bird02.fly();
        bird02.sing();
        bird02.showName();
    }

}
