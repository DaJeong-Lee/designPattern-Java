package bridge02;

public class SoundMorseCodeFunction implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.print("쩜");		
	}

	@Override
	public void dash() {
		System.out.print("대시");		
	}

	@Override
	public void space() {
		System.out.print("음");		
	}
	
}
