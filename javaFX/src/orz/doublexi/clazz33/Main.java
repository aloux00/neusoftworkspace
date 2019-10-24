package orz.doublexi.clazz33;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root=new VBox();
		TextArea area=new TextArea("hehe");
		 area.setTextFormatter(new TextFormatter<String>(new StringConverter<String>() {
			@Override
			public String toString(String object) {
				if(object==null) {
					object="";
				}
				System.out.println(object);
				return object;
			}
			@Override
			public String fromString(String string) {
				System.out.println("str"+string);
				return string;
			}
			
		}));
		 
		 area.commitValue();
		root.getChildren().addAll(area);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		System.out.println("");
	}

}
