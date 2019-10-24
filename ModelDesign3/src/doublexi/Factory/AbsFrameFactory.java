package doublexi.Factory;

import doublexi.Frame.AbsEditFrame;
import doublexi.Frame.AbsJFrame;

public abstract class AbsFrameFactory {
	protected AbsJFrame frame;

public abstract AbsJFrame getFrame(String name);

}
