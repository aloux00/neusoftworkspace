package orz.doublexi.clazz04;

import com.sun.javafx.scene.layout.region.Margins;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
//		primaryStage.setOpacity(0.8);//透明
//		primaryStage.setAlwaysOnTop(true);//置顶
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);
		primaryStage.setX(10);
		primaryStage.setY(10);
		primaryStage.xProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println("weizhi:"+newValue);
			}
		});
primaryStage.show();		
	}

}
