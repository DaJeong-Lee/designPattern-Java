package abstractFactory02;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;
import abstractFactory02.concrete.FactoryInstance;
import abstractFactory02.linux.LinuxGuiFactory;
import abstractFactory02.mac.MacGuiFactory;

public class Main {
	public static void main(String[] args) {
		
//		GuiFactory factory = new LinuxGuiFactory();
//		GuiFactory factory = new MacGuiFactory();
		
		//위에 처럼 factory에 바로 연결하는 것은 추상팩토리를 잘 활용하는게 아님
		// -> FactoryInstance.getGuiFactory() 아래처럼 알아서 결정함
		System.out.println(System.getProperty("os.name"));
		
		//또한 Linux인지 Mac인지 노출하는 것은 좋지 못한 방법
		GuiFactory factory = FactoryInstance.getGuiFactory();
		
		Button button = factory.createButton();
		TextArea textArea = factory.CreateTextArea();
		
		button.click();
		System.out.println(textArea.getText());
	}
}
