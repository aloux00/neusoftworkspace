

import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
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

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane r=new AnchorPane();
		r.setStyle("-fx-background-color:#FFFFFF");
		Scene s=new Scene(r);
		primaryStage.setScene(s);
		primaryStage.setWidth(800);
		primaryStage.setHeight(800);
		
		
		
		
		Stage stage=new Stage();
		stage.initOwner(primaryStage);
		stage.initStyle(StageStyle.UTILITY);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.setAlwaysOnTop(true);
		stage.setHeight(300);
		stage.setWidth(300);
		Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
		stage.setX(bounds.getMaxX()-stage.getWidth());
		stage.setY(bounds.getMaxY()-stage.getHeight());
		stage.show();
		BorderPane root=new BorderPane();
		Scene scene=new Scene(root);
		scene.setFill(null);
		stage.setScene(scene);
		Platform.setImplicitExit(false);
		Pane pane=new Pane();
		Platform.runLater(new Runnable() {
		    @Override
		    public void run() {
		    	pane.setBackground(new Background(new BackgroundImage(new javafx.scene.image.Image("temp.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		    	root.setCenter(pane);
		    }
		});
		
		
	
		
		
		SystemTray tray=SystemTray.getSystemTray();
		URL url = ClassLoader.getSystemClassLoader().getResource("temp.jpg");
		ImageIcon icon=new ImageIcon(url);
		Image image = Toolkit.getDefaultToolkit().createImage(url);
		
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
