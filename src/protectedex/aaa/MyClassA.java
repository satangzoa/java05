package protectedex.aaa;

import protectedex.bbb.MyClassB;

public class MyClassA  extends MyClassB{
	public void m1() {
//		부모가 다른 패키지 안에 있는 경우, 부모의 protected와 
//		public 멤버만 접근 가능
//		System.out.println(v1); // 부모의 private 변수
//		System.out.println(v2); // 부모의 default 변수
		System.out.println(v3); // 부모의 protected 변수
		System.out.println(v4); // 부모의 public 변수
	}
	
	public static void main(String[] args) {
		MyClassB b1 = new MyClassB();
//		다른 패키지에 있는 클래스인 경우 public 맴버만 접근 가능
		System.out.println(b1.v4); // public 변수
	}

}
