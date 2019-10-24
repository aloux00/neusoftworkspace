package orz.doublexi.clazz06;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getBounds();
		Rectangle2D bounds2 = screen.getVisualBounds();
		System.out.println(bounds);
		System.out.println(bounds2);
		System.out.println(screen.getDpi());
		
		Platform.exit();
	}

}
