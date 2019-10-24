package orz.doublexi.clazz03;

import java.io.File;
import java.io.InputStream;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
public static void main(String[] args) {
launch(args);	
}
	@Override
public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("javaFX");
primaryStage.getIcons().add(new Image("temp.png"));
//primaryStage.setIconified(true);//图标化
//primaryStage.setMaximized(true);
//primaryStage.setResizable(false);

primaryStage.heightProperty().addListener(new ChangeListener<Number>() {

	@Override
	public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

		System.out.println(newValue);
	}
});


primaryStage.setFullScreen(true);
Scene scene = new Scene(new Group());
primaryStage.setScene(scene);
primaryStage.show();
	}

	
	
}
