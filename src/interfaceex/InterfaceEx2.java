package interfaceex;

public class InterfaceEx2 {
	public static void main(String[] args) {
		인어 f1 = new 인어();
		상어 f2 = new 상어();
		
//		f1.말하다();
//		f1.수중호흡하다();
//		f2.수중호흡하다();
	
		doWork(f1);
		doWork(f2);
	}

	static void doWork(물고기 f) {
		f.수중호흡하다();
		
//		변수f가 가리키는 객체가 사람의 일종인지 검사
		if (f instanceof 사람)
			((사람)f).말하다();
	}


}



