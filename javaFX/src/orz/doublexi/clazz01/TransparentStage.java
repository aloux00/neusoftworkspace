package orz.doublexi.clazz01;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Alan
 */
public class TransparentStage extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("显示提示");

        btn.setOnAction((ActionEvent event) -> {
            Text text = new Text("显示提示信息成功!");
            text.setFont(new Font(20));
            text.setFill(Color.GREEN);
            VBox box = new VBox();
            box.getChildren().add(text);
            box.setStyle("-fx-background:transparent;");

            final int width = 200;
            final int height = 50;
            final Scene scene = new Scene(box, width, height);
            scene.setFill(null);

            final Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX(primaryScreenBounds.getWidth() - width);
            stage.setY(primaryScreenBounds.getHeight() - height);
            stage.show();

            Task t = new Task() {
                @Override
                protected Object call() throws Exception {
                    Thread.sleep(1000);
                    Platform.runLater(stage::close);
                    return "";
                }
            };
            new Thread(t).start();
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
