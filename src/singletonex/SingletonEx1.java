package singletonex;

public class SingletonEx1 {
	public static void main(String[] args) {
		화장품 c1 = 화장품.getInstance();
		c1.use();
		화장품 c2 =  화장품.getInstance();
		c2.use();
		
		화장품 c3 = 화장품.getInstance();
		c3.use();
	}
}

class 화장품 {
//	객체 밖(외부)에서 객체를 만들지 못하도록 생성자 앞에 private 설정
	private 화장품() { 
		System.out.println("화장품이 만들어졌습니다. ");
	}
	
//	하나의 화장품 객체를 가리킬 참조변수를 static으로 선언
	private static 화장품 c;
	
//	화장품 객체 생성을 대신하는 static 메서드 선언
	public static 화장품 getInstance() {
		if (c == null)
			c = new 화장품();
		
		return c;
	}
	
	
	
	
	
	
	
	
	void use() {
		System.out.println("화장품을 사용하다.");
	}
}


