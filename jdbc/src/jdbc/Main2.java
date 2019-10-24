package jdbc;

import java.util.function.UnaryOperator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class Main2 extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		VBox root=new VBox();
		
		TextArea area=new TextArea();
		TextField field=new TextField();
		
		 field.setTextFormatter(new TextFormatter<String>(new UnaryOperator<Change>() {

			@Override
			public Change apply(Change t) {
				System.out.println(t.getText());
				return t;
			}
		}));

		 
		 area.setTextFormatter(new TextFormatter<String>(new StringConverter<String>() {

			@Override
			public String toString(String object) {
				// TODO Auto-generated method stub
				return object;
			}

			@Override
			public String fromString(String string) {
				// TODO Auto-generated method stub
				return string;
			}
		}));
		 
		 
		
		root.getChildren().addAll(area,field);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setHeight(800);
		primaryStage.setWidth(800);
		primaryStage.show();
		System.out.println("");
	}

}
