package orz.doublexi.clazz01;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;

public class Test2 extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Popup pop=new Popup();
		pop.setHeight(500);
		pop.setWidth(500);
		Text text=new Text("hello");
		
		pop.show(primaryStage);
		primaryStage.show();
	}	

}
