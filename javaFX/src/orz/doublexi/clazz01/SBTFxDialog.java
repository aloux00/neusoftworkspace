package orz.doublexi.clazz01;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Popup;


public class SBTFxDialog extends Popup {
public static void main(String[] args) {
	new Popup().show(null);
}
	private VBox vbox_;
	public boolean option;
	private Label label_;
	private EventHandler<MouseEvent> okListener;
	private EventHandler<MouseEvent>	noListener;
	private static SBTFxDialog theInstance;
	public static SBTFxDialog getSbtFxDialog(){
		if(theInstance == null){
			theInstance = new SBTFxDialog();
		}
		return theInstance;
	}
	private SBTFxDialog(){
		init();
	}
	public void setText(String text_){
		label_.setText(text_);
	}
	private void init(){
		if (vbox_ == null) {
			vbox_ = new VBox();
			vbox_.setSpacing(5);// 设置行与行之间的间距
			vbox_.setAlignment(Pos.CENTER);
			vbox_.setMinSize(350, 150);
			vbox_.setMaxSize(350, 150);
			vbox_.setStyle("-fx-background-color:#FFFFFF;-fx-background-radius:5 5 5 5;-fx-border-color:#000; -fx-border-radius:3 3 3 3;");
			Image imagebg = new Image(getClass().getResourceAsStream("/com/sbt/common/images/newUI/gantan.png"));
			label_ = new Label("", new ImageView(imagebg));
			label_.setFont(Font.font("", 15));
			vbox_.getChildren().add(label_);
			getContent().add(vbox_);
			HBox button_hbox_ = new HBox();
			button_hbox_.setPadding(new Insets(40, 0, 20, 150));// Insets(top,left,bottom,right)
			button_hbox_.setSpacing(10);
			Button button_y_ = new Button("确定");
			button_y_.setFont(Font.font("", 15));
			button_y_.setPrefSize(70, 30);
			button_y_.setStyle("-fx-border-color:#b9bbbd;-fx-background-radius:3 3 3 3;-fx-border-radius:3 3 3 3");
			button_y_.setOnMouseClicked(getOkListener());
			Button button_n_ = new Button("取消");
			button_n_.setFont(Font.font("", 15));
			button_n_.setPrefSize(70, 30);
			button_n_.setStyle("-fx-border-color:#b9bbbd;-fx-background-radius:3 3 3 3;-fx-border-radius:3 3 3 3");
			button_n_.setOnMouseClicked(getNoListener());
			button_hbox_.getChildren().addAll(button_y_, button_n_);
			vbox_.getChildren().add(button_hbox_);
		}
	}
	/**
	 * 取消按钮监听
	 * @return
	 */
	private EventHandler<MouseEvent> getNoListener() {
		if (noListener == null) {
			noListener = new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
					hide();
				}
			};
		}
		return noListener;
	}
	/**
	 * 确定按钮监听
	 * @return
	 */
	private EventHandler<MouseEvent> getOkListener() {
		if(okListener == null){
			okListener = new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e){
					option = true;
					hide();
				}
			};
		}
		return okListener;
	}
}