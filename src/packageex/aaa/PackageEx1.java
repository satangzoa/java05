package packageex.aaa;

import packageex.bbb.*;

public class PackageEx1 {
	public static void main(String[] args) {
//		 1.  다른 패키지의 클래스를 사용하기 위해서 패키지 경로까지 함께 명시
		packageex.bbb.PackageEx2 p1 = new packageex.bbb.PackageEx2();
		
//		2. import 문을 사용해서 패키지를 명시 ctrl+shif+o 단축키사용
		PackageEx2 p2 = new PackageEx2();
		
	}
}

