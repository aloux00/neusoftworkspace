package doublexi.Factory;

import doublexi.Frame.AbsJFrame;
import doublexi.Frame.impl.EmptyFrame;

public abstract class AbsSwingFactory {
public abstract AbsJFrame getDefaultFrame();
public abstract AbsJFrame getMainFrame();
}
