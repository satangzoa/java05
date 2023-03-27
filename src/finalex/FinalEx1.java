package finalex;

public class FinalEx1 {
	public static void main(String[] args) {
		CCC c1 = new CCC();
		c1.v1 = 50;
		System.out.println("v2: " + c1.v2);
//		final 변수 값을 변경할 수 없음
//		c1.v2 = 60;
		
		final int a = 100; 
//		final 지역변수도 이후 값을 변경 불가
//		a++;
	}
}

class AAA {
	void m1() { }
//	final 매서드는 자식이 재정의 할 수 없다
	final void m2() { }
}

//final 클래스는 부모로 이용될 수 없음
final class BBB {
	
}

class CCC extends AAA {
	int v1 = 10; 
//	final 변수는 한번 초기화된 값을 바꿀 수 없다(상수)
	final int v2 = 20;
	
	void m1() { System.out.println("재정의한 매서드입니다."); }
// 아래 코드에서 오류 발생(재정의 불가)	
//	void m2() {
//		System.out.println("재정의한 매서드입니다.");
//	}

}

