package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			StackPane root = new StackPane();
			Label lbl = new Label();
			Login user = new Login();
			boolean flag = user.isDbConnected();
			if (flag) {
				lbl.setText("Connected");
			} else {
				lbl.setText("Not Connected");
			}
			root.getChildren().addAll(lbl);
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
