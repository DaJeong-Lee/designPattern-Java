package abstractFactory02.concrete;

import abstractFactory02.abst.GuiFactory;
import abstractFactory02.linux.LinuxGuiFactory;
import abstractFactory02.mac.MacGuiFactory;

public class FactoryInstance {

	public static GuiFactory getGuiFactory() {
		switch (0) {
		case 0:
			return new MacGuiFactory();
		case 1:
			return new LinuxGuiFactory();
		}
		return null;
	}
}
