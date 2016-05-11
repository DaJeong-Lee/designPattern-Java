package abstractFactory02.linux;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea CreateTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}

}
