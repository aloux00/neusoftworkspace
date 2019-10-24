package orz.doublexi.clazz33;

import java.util.function.UnaryOperator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class Main2 extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root=new HBox();
		
		TextArea area=new TextArea();
		TextField field=new TextField();
		root.getChildren().addAll(area,field);
		root.setAlignment(Pos.CENTER);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setHeight(800);
		primaryStage.setWidth(800);
		primaryStage.show();
		 field.setTextFormatter(new TextFormatter<String>(new UnaryOperator<Change>() {
			@Override
			public Change apply(Change t) {
				System.out.println(t.getText());
				return t;
			}
		}));
		TextFormatter<String> formatter = new TextFormatter<String>(new StringConverter<String>() {
			@Override
			public String toString(String object) {
				return object;
			}
			@Override
			public String fromString(String string) {
				
				return "hehe";
			}
		});
		 area.setTextFormatter(formatter);
//		 
//		 
		
	
	}

}
