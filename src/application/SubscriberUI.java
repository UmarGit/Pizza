package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SubscriberUI extends Application{
	Scene scene4;
	Label sub_name;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane root = new StackPane();
		
		Label close = new Label("X");
		close.setFont(Font.font(20));
		close.setTextFill(Color.RED);
		close.setTranslateX(740);

		Label head = new Label("SUBSCRIBER");

		head.setFont(Font.font(40));
		
		sub_name = new Label();
		sub_name.setFont(Font.font(15));
		
		VBox vb1 = new VBox();
		vb1.getChildren().addAll(close,head,sub_name);
		vb1.setTranslateX(40);
		
		close.setOnMouseClicked(e ->{
			primaryStage.close();
		});
		
		root.getChildren().addAll(vb1);
		scene4 = new Scene(root,800,400);
		primaryStage.setScene(scene4);
		primaryStage.show();
	}
	public void setsubscriber(String name) {
		sub_name.setText("Welcome "+name.toUpperCase()+" ! to Pizza Ordering System");
	}

}
