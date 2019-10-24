package doublexi.Factory.impl;

import doublexi.Factory.AbsSwingFactory;
import doublexi.Frame.AbsJFrame;
import doublexi.Frame.impl.EmptyFrame;
import doublexi.Frame.impl.MainFrame;

public class DefSwingFactory extends AbsSwingFactory {
	private AbsJFrame frame;
	@Override
	public AbsJFrame getDefaultFrame() {
		frame=new EmptyFrame();
		frame.initFrame();
		return frame;
	}
	@Override
	public AbsJFrame getMainFrame() {
		frame=new MainFrame();
		frame.initFrame("Ë«Ï²µÄÖ÷´°¿Ú", 0.75, false, true);
		frame.setDestroyByExit(true);
		return frame;
	}
}
