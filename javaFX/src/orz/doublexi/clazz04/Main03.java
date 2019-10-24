package orz.doublexi.clazz04;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main03  extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Stage s1=new Stage();
		s1.setTitle("s1");
		s1.initModality(Modality.WINDOW_MODAL);
	
		Stage s2=new Stage();
		s2.setTitle("s2");
		s2.initModality(Modality.NONE);
		s1.initOwner(s2);
		Stage s3=new Stage();
		s3.setTitle("s3");
		s3.initModality(Modality.APPLICATION_MODAL);
		s2.show();
		s1.show();
		
		s3.show();
	}

}
