package orz.doublexi.clazz01;


import java.awt.Graphics;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JWindow;

import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import javafx.stage.WindowBuilder;

public class Test extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane=new AnchorPane();
		Label label=new Label();
		label.setPrefHeight(500);
		label.setPrefWidth(500);
//		label.setBackground(new Background(new BackgroundImage(new Image("temp.png"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		pane.setStyle("-fx-background:transparent;");
		pane.getChildren().add(label);
		Scene secene=new Scene(pane);
		secene.setFill(new ImagePattern(new Image("01.png")));
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.setScene(secene);
	
		
		
URL resource = this.getClass().getResource("temp.png");//获取托盘图标
System.out.println(resource);
ImageIcon icon = new ImageIcon(resource);
PopupMenu pop = new PopupMenu();//创建弹出式菜单

MenuItem menu = new MenuItem("exit");//创建菜单项
menu.addActionListener(new ActionListener() {//给菜单项添加事件监听器，单击时退出系统
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}
});
pop.add(menu);
TrayIcon tray = new TrayIcon(icon.getImage(), "Hern",pop);

// 获得系统托盘对象
SystemTray systemTray = SystemTray.getSystemTray();
systemTray.add(tray);// 将托盘图片添加到系统托盘中

	}
	

}
