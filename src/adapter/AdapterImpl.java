package adapter;

public class AdapterImpl implements Adapter{

//	Math math;
	
	@Override
	public Float twiceOf(Float f) {

		//Math의 함수는 double을 받아 double을 리턴함
		//사용자가 float을 받아 float을 리턴하고 싶을때 AdapterImpl클래스를 사용
		return (float)Math.twoTime(f.doubleValue());
	}

	@Override
	public Float halfOf(Float f) {
		
		return (float)Math.half(f.doubleValue());
	}

}
