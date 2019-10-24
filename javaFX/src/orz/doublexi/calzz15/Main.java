package orz.doublexi.calzz15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//小练习
public class Main extends Application {
	static boolean isManaged=false;
	static boolean isVisible=false;
	static double opacityValue=0.0;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button01=new Button("我的按钮01");
		Button button02=new Button("我的按钮02");
		Button button03=new Button("我的按钮03");
		Button button04=new Button("我的按钮04");
		
		Button button05=new Button("setManage(false)");
		Button button06=new Button("setVisible(false)");
		Button button07=new Button("setOpacity(0)");
		AnchorPane anchor = new AnchorPane();
		HBox hbox=new HBox();
		hbox.setLayoutX(0);
		hbox.setLayoutY(0);
		hbox.setPrefWidth(800);
		hbox.setPrefHeight(100);
		hbox.setPadding(new Insets(20));
		hbox.setSpacing(10);
		hbox.getChildren().addAll(button01,button02,button03,button04);

		VBox vbox=new VBox();
		vbox.setLayoutX(0);
		vbox.setLayoutY(100);
		vbox.setPrefWidth(800);
		vbox.setPrefHeight(500);
		vbox.setSpacing(10);
		vbox.getChildren().addAll(button05,button06,button07);
		
		button05.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				button03.setManaged(isManaged);
				new Print(hbox);
				if(isManaged==true) {
					isManaged=false;
					button05.setText("button03.setManager("+isManaged+")");
				}else {
					isManaged=true;
					button05.setText("button03.setManager("+isManaged+")");
				}
			}
		});
		button06.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
			
				button03.setVisible(isVisible);
				new Print(hbox);
				if(isVisible==true) {
					isVisible=false;
					button06.setText("button03.setVisible("+isVisible+")");
				}else {
					isVisible=true;
					button06.setText("button03.setVisible("+isVisible+")");
				}
			}
		});
		button07.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				button03.setOpacity(opacityValue);
				new Print(hbox);
				if(opacityValue==1.0) {
					opacityValue=0.0;
					button07.setText("button03.setOpacity("+opacityValue+")");
				}else {
					opacityValue=1.0;
					button07.setText("button03.setOpacity("+opacityValue+")");
				}
			}
		});
		
		
		anchor.getChildren().add(vbox);
		anchor.getChildren().add(hbox);
		Scene scene = new Scene(anchor);
		primaryStage.setHeight(800);
		primaryStage.setWidth(800);
		primaryStage.setTitle("双喜的总结");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
class Print{
	Print(HBox hbox) {
	System.out.println("当前HBOX里组件数量"+hbox.getChildren().size());
	}
}