package singleton;

public class SystemSpeaker {
	
	//인스턴스는 공통으로 1개만 있어야하므로 static으로 선언
	static private SystemSpeaker instance;

	private int volume;
	
	
	//생성자 private 접근자 사용
	private SystemSpeaker(){
		setVolume(5);
	}
	
	//static으로 선언
	public static SystemSpeaker getInstance(){
		if(instance == null){
			instance = new SystemSpeaker();
		}
		
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
