package abstractFactory02.linux;

import abstractFactory02.abst.TextArea;

public class LinuxTextArea implements TextArea{

	@Override
	public String getText() {
		return "리눅스 텍스트에어리어";
	}

}
