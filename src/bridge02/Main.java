package bridge02;

public class Main {
	public static void main(String[] args) {
		
		//브릿지 패턴을 사용하는 경우
		//print 하던 morsecode를 sound로 내려면 클래스 추가해서 상속받고 구현하면 됨
		
//		PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
		PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());
		code.g().a().r().a().m();
	}
}
