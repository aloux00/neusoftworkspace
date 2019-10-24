package orz.doublexi.clazz22;

import java.awt.Dialog;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class MyTest2 extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage=new Stage();
		stage.initOwner(primaryStage);
		stage.initStyle(StageStyle.UTILITY);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setAlwaysOnTop(true);
		
		
		stage.setHeight(300);
		stage.setWidth(300);
		Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
		stage.setX(bounds.getMaxX()-stage.getWidth());
		stage.setY(bounds.getMaxY()-stage.getHeight());
		stage.setTitle("this is dialog panel");
		stage.show();
		stage.setAlwaysOnTop(true);
		Pane pane=new Pane();
		BorderPane root=new BorderPane();
		Platform.setImplicitExit(false);
		Platform.runLater(new Runnable() {
		    @Override
		    public void run() {
		    	pane.setBackground(new Background(new BackgroundImage(new javafx.scene.image.Image("temp.png"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		    	root.setCenter(pane);	
		    }
		});
		
		
		
		
		
		SystemTray tray=SystemTray.getSystemTray();
		URL url = ClassLoader.getSystemClassLoader().getResource("temp.png");
		ImageIcon icon=new ImageIcon(url);
		
		PopupMenu menu=new PopupMenu("test");
		MenuItem item=new MenuItem("exit");
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(item);
		TrayIcon trayicon=new TrayIcon(icon.getImage(),"双喜的测试",menu );
		tray.add(trayicon);
	}

}
