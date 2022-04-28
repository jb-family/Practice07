package com.javaex.ex02;

public class Sparrow extends Bird {

	//필드
	
	
	//생성자
	
	
	//메소드 - gs
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//메소드 - 일반
	public void sing() {
		System.out.println("오리(" + this.name + ")가 소리내어 웁니다.");
    }

    public void fly() {
    	System.out.println("참새(" + this.name + ")가 날아다닙니다.");
    }
    
    public void showName() {
    	System.out.println("참새의 이름은" + this.name + " 입니다.");
    }


}
