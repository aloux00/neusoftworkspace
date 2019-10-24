package doublexi.MainThread.main.otherThread;

import doublexi.Factory.AbsFrameFactory;
import doublexi.Frame.AbsEditFrame;
import doublexi.Frame.AbsJFrame;

public abstract class AbsFrameThread implements Runnable{
 private AbsJFrame frame;
	@Override
	public void run() {
		init();
		frame.setVisible(true);
		frame.setFocusable(true);
		
	}
	
	public void setFrame(AbsJFrame frame) {
		this.frame = frame;
	}

	public abstract void init();

}
