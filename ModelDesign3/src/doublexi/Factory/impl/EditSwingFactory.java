package doublexi.Factory.impl;

import java.awt.FlowLayout;

import javax.swing.ScrollPaneLayout;

import doublexi.Factory.AbsFrameFactory;
import doublexi.Frame.AbsEditFrame;
import doublexi.Frame.AbsReadFrame;
import doublexi.Frame.impl.EditFrame;
import doublexi.Frame.impl.ReaderFrame;

public class EditSwingFactory extends AbsFrameFactory {

	@Override
	public AbsEditFrame getFrame(String name) {
		 
				frame=new EditFrame();
				//frame.setDefLayout(new ScrollPaneLayout());
				frame.initFrame(name, 0.50, true);
				return (AbsEditFrame) frame;
			
	}

	public AbsReadFrame getReaderFrame(String name) {
		
		frame=new ReaderFrame();
		frame.initFrame(name, 0.750, false);
		return (AbsReadFrame) frame;
		
	}

}
