package orz.doublexi.clazz22;

import java.awt.Dialog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;

import javafx.application.Application;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button=new Button("click to open a frame");
		button.setOnAction((e)->{
			DialogPane pane=new DialogPane();
			Stage stage=new Stage();
			stage.initOwner(primaryStage);
			stage.initStyle(StageStyle.UTILITY);
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setTitle("this is dialog panel");
			stage.show();
		});
		AnchorPane root=new AnchorPane();
		root.setStyle("-fx-background-color:#FFFFFF");
		root.setTopAnchor(button, 100.0);
		root.setLeftAnchor(button, 100.0);
		root.getChildren().add(button);
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setWidth(800);
		primaryStage.setHeight(800);
        primaryStage.show();	
        MyScheduledService service=new MyScheduledService();
        service.setDelay(new Duration(100));
        service.setPeriod(new Duration(100));
        service.start();
        
	}

}
 class MyScheduledService extends ScheduledService{
	 int i=0;
	@Override
	protected Task createTask() {
		return new Task<Integer>() {

			@Override
			protected Integer call() throws Exception {
				System.out.println(Thread.currentThread().toString());
				return i;
			}

			@Override
			protected void updateValue(Integer value) {
				System.out.println(Thread.currentThread().toString());
				System.out.println(value);
				
				super.updateValue(value);
				
			}
			
			
		};
		
	}
	 
 }