package orz.doublexi.clazz34;


import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
public class Main extends Application{
	int index=0;
	String sub=null;
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane root=new FlowPane();
		
		
		TextField find=new TextField();
		Button fin_bu=new Button("find");
		Button sort_bu=new Button("sort");
		HBox hbox=new HBox(10);
		hbox.getChildren().addAll(find,fin_bu,sort_bu);
		
		TextArea area=new TextArea("papapappa");
		VBox vbox=new VBox();
		vbox.getChildren().addAll(area);
		
		
		root.getChildren().addAll(hbox,vbox);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setHeight(800);
		primaryStage.setWidth(800);
		primaryStage.show();
		
		
		
		fin_bu.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String findkey = find.getText();
				
				area.getParagraphs().forEach((ch)->{
					String value = ch.toString();
					sub=value.substring(index);
					if(sub.contains(findkey)) {
						
						int i=value.indexOf(findkey);
						index=index+i+findkey.length();
						System.out.println(i);
						
						area.selectRange(index-findkey.length(), index);
						area.requestFocus();
						
					}
				});
			}
		});
		
	}

}