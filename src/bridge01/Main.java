package bridge01;

public class Main {
	public static void main(String[] args) {
		
		//브릿지 패턴을 사용안하는 경우
		//PrintMorseCode에서 System.out.println 이부분을 바꾸려면 코드를 고쳐야 함
		
		PrintMorseCode code = new PrintMorseCode();
		code.g().a().r().a().m();
	}
}
