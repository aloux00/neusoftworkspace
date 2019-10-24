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
		AbsJFrame mainFrame = factory.getFrame("主窗口");
		mainFrame.addItemToJFContentPane(new main_Button_notepad("记事本"));
		mainFrame.addItemToJFContentPane(new main_Button_Reader("小说阅读器"));
		
		
		mainFrame.setVisible(true);
	}
}
