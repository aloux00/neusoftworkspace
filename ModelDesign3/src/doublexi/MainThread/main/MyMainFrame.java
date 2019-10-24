package doublexi.MainThread.main;

import java.io.InputStream;

import doublexi.Factory.AbsFrameFactory;
import doublexi.Factory.impl.MainSwingFactory;
import doublexi.Frame.AbsJFrame;
import doublexi.MainThread.main.component.button.main_Button_Reader;
import doublexi.MainThread.main.component.button.main_Button_notepad;
 
public class MyMainFrame {
	private static AbsFrameFactory factory = new MainSwingFactory();

	public static void main(String[] args) {
		AbsJFrame mainFrame = factory.getFrame("������");
		mainFrame.addItemToJFContentPane(new main_Button_notepad("���±�"));
		mainFrame.addItemToJFContentPane(new main_Button_Reader("С˵�Ķ���"));
		
		
		mainFrame.setVisible(true);
	}
}
