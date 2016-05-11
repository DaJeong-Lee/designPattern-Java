package abstractFactory02.mac;

import abstractFactory02.abst.TextArea;

public class MacTextArea implements TextArea{

	@Override
	public String getText() {
		return "Mac 텍스트에어리어";
	}

}
