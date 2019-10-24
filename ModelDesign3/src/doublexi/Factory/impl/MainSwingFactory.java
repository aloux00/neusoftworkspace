package doublexi.Factory.impl;

import java.awt.FlowLayout;

import doublexi.Factory.AbsFrameFactory;
import doublexi.Frame.AbsActionFrame;
import doublexi.Frame.impl.MainFrame;

public class MainSwingFactory extends AbsFrameFactory {

	@Override
	public AbsActionFrame getFrame(String name) {
		frame=new MainFrame();
		frame.setDefLayout(new FlowLayout());
		frame.initFrame(name, 0.25, false);
		frame.setDestroyByExit(true);
		return (AbsActionFrame) frame;
	}

	
}
