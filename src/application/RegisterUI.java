package application;

import java.sql.SQLException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RegisterUI extends Application{
	boolean regged = false;
	Scene scene2 ;
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			StackPane root = new StackPane();
			
			Label close = new Label("X");
			close.setFont(Font.font(20));
			close.setTextFill(Color.RED);
			close.setTranslateX(290);

			Label head = new Label("REGISTER");
			head.setTranslateX(30);
			head.setFont(Font.font(40));
			
			Label sub_head = new Label("Welcome to Pizza Ordering System");
			sub_head.setTranslateX(20);
			
			Label lbl_user = new Label("Username");
			Label lbl_email = new Label("Email        ");
			Label lbl_pass = new Label("Password ");
			
			TextField tf_user = new TextField();
			TextField tf_email = new TextField();
			PasswordField tf_pass = new PasswordField();
			
			Button register = new Button("REGISTER");
			Button login = new Button("LOGIN");
			
			HBox hb1 =new HBox(10);
			hb1.getChildren().addAll(lbl_user ,tf_user);
			
			HBox hb2 =new HBox(10);
			hb2.getChildren().addAll(lbl_email ,tf_email);

			HBox hb3 =new HBox(10);
			hb3.getChildren().addAll(lbl_pass ,tf_pass);
			
			HBox hb4 =new HBox(20);
			hb4.getChildren().addAll(register,login);
			hb4.setTranslateX(70);
			
			Label message = new Label();
			
			VBox vb1 = new VBox(20);
			vb1.getChildren().addAll(close,head,sub_head,hb1,hb2,hb3,hb4,message);
			vb1.setTranslateX(90);
			
			login.setOnAction(e ->{
				LoginUI log =new LoginUI();
				log.start(primaryStage);
				primaryStage.setScene(log.scene);
			});
			
			close.setOnMouseClicked(e ->{
				primaryStage.close();
			});
			
			register.setOnAction(e ->{
				Register reg = new Register();
				try {
					regged = reg.isregister(tf_user.getText(), tf_email.getText(), tf_pass.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				LoginUI log =new LoginUI();
				if (regged) {
					try {
						log.start(primaryStage);
						primaryStage.setScene(log.scene);
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				} else {
					log.message.setText("Registered Succesfully as "+tf_user.getText());
				}
			});
			
			root.getChildren().addAll(vb1);
			scene2 = new Scene(root,400,400);
			primaryStage.setScene(scene2);
			primaryStage.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
