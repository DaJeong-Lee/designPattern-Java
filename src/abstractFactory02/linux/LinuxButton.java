package abstractFactory02.linux;

import abstractFactory02.abst.Button;

public class LinuxButton implements Button{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("리눅스 버튼");
	}

}
