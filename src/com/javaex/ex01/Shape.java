package com.javaex.ex01;

public abstract class Shape {	//추상메소드
	
	protected String fillColor;
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	public abstract void draw();
	
	public abstract void showInfo();
	
}


