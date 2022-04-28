package com.javaex.ex03;

public class SoundApp {

    public static void main(String[] args) {	//main 메소드
    	printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }
    
    // printSound의 메소드에 있는 인터페이스 타입의 매개변수 soundable에 있는 메소드를 호출한다.
    // 그래서 printSound()메소드안에 new Cat() 클래스가 담기게 되면 결국 Cat클래스(soundable).sound() 메소드가 실행된다.
    // 그렇게되면 Cat클래스에 있는 반환된 String 타입의 글자가 printSound( new Cat() )에 담기게 되는것이다.?
    
    
    public static void printSound( Soundable soundable ) {	//printSound 메소드
        
    System.out.println(soundable.sound());
    }
    
}

