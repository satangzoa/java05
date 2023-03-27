package interfaceex;

public class 인어 extends 사람 implements 물고기{

	@Override
	public void 수중호흡하다() {
		System.out.println("인어가 물 속에서 숨을 쉽니다.");
	}

	@Override
	public void 말하다() {
		System.out.println("인어가 물 속에서 말을 합니다.");
	}

}
