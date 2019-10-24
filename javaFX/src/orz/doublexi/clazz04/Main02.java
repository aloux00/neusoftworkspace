package orz.doublexi.clazz04;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main02 extends Application {
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {

		Stage s1=new Stage();
		s1.setTitle("s1");
		s1.initStyle(StageStyle.DECORATED);
		s1.show();
		Stage s2=new Stage();
		s2.setTitle("s2");
		s2.initStyle(StageStyle.UNDECORATED);
		s2.show();
		Stage s3=new Stage();
		s3.setTitle("s3");
		s3.initStyle(StageStyle.UNIFIED);
		s3.show();
		Stage s4=new Stage();
		s4.initStyle(StageStyle.UTILITY);
		s4.setTitle("s4");
		s4.show();
	}

}
