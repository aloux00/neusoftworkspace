package doublexi.MainThread;

import javax.swing.JButton;
import javax.swing.JFrame;

import doublexi.Factory.AbsSwingFactory;
import doublexi.Factory.impl.DefSwingFactory;
import doublexi.Frame.AbsJFrame;
import doublexi.MainThread.component.button.main_Button_test;
import doublexi.component.button.AbsButton;

public class MyMainFrame{
	private static AbsSwingFactory factory= new DefSwingFactory();
	public static void main(String[] args) {
		 AbsJFrame mainFrame = factory.getMainFrame();
		 mainFrame.addItemToJFContentPane(new main_Button_test("≤‚ ‘∞¥≈•"));

			
			
		
		
	}
}
