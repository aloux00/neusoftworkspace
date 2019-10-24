package doublexi.Factory.impl;

import java.awt.FlowLayout;

import javax.swing.ScrollPaneLayout;

import doublexi.Factory.AbsFrameFactory;
import doublexi.Frame.AbsEditFrame;
import doublexi.Frame.impl.EditFrame;

public class EditSwingFactory extends AbsFrameFactory {

	@Override
	public AbsEditFrame getFrame(String name) {
		 
				frame=new EditFrame();
				//frame.setDefLayout(new ScrollPaneLayout());
				frame.initFrame(name, 0.50, true);
				return (AbsEditFrame) frame;
			
	}

}
