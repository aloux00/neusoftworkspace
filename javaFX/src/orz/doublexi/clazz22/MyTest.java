package orz.doublexi.clazz22;

import java.awt.Dialog;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class MyTest extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root=new AnchorPane();
		root.setStyle("-fx-background-color:#FFFFFF");
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setWidth(800);
		primaryStage.setHeight(800);
		DialogPane pane=new DialogPane();
		Stage stage=new Stage();
		stage.initOwner(primaryStage);
		stage.initStyle(StageStyle.UTILITY);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setTitle("this is dialog panel");
		stage.show();
		stage.setAlwaysOnTop(true);
		
		Platform.setImplicitExit(false);
		Platform.runLater(new Runnable() {
		    @Override
		    public void run() {
		    	
		    }
		});
		
		
		
		
		
		SystemTray tray=SystemTray.getSystemTray();
		Image image=Toolkit.getDefaultToolkit().getImage("01.png");
		System.out.println(image);
		PopupMenu menu=new PopupMenu("test");
		MenuItem item=new MenuItem("exit");
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(item);
		TrayIcon icon=new TrayIcon(image,"双喜的测试",menu );
		tray.add(icon);
	}

}
