package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강");
		// 추상메소드는 객체를 생성할 수 없다. 주석처리.
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10); // 값 수정 4, 4 -> 12, 10
		
		//sr1을 그리는 메소드 호출
		sr1.showInfo();
		
		
		//sr1의 가로크기 출력
		sr1.draw();
		
	}
}

	
	