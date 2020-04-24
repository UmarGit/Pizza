package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AdminUI extends Application{
	Scene scene3;
	private TableView table1 = new TableView();
	private TableView table2 = new TableView();
	private TableView table3 = new TableView();
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane root = new StackPane();
		
		Label close = new Label("X");
		close.setFont(Font.font(20));
		close.setTextFill(Color.RED);
		close.setTranslateX(560);

		Label head = new Label("ADMINISTRATOR");
		head.setTranslateX(30);
		head.setFont(Font.font(40));
		
		Label sub_head = new Label("Welcome to administrator to Pizza Ordering System");
		sub_head.setTranslateX(50);
 
        table1.setEditable(true);
 
        TableColumn firstNameCol1 = new TableColumn("First Name");
        TableColumn lastNameCol1 = new TableColumn("Last Name");
        TableColumn emailCol1 = new TableColumn("Email");
        
        table1.getColumns().addAll(firstNameCol1, lastNameCol1, emailCol1);
        
        table2.setEditable(true);
        
        TableColumn firstNameCol2 = new TableColumn("First Name");
        TableColumn lastNameCol2 = new TableColumn("Last Name");
        TableColumn emailCol2 = new TableColumn("Email");
        
        table2.getColumns().addAll(firstNameCol2, lastNameCol2, emailCol2);
        
        table3.setEditable(true);
        
        TableColumn firstNameCol3 = new TableColumn("First Name");
        TableColumn lastNameCol3 = new TableColumn("Last Name");
        TableColumn emailCol3 = new TableColumn("Email");
        
        table3.getColumns().addAll(firstNameCol3, lastNameCol3, emailCol3);
        
        HBox hbcontrol1 = new HBox(10);
        
        Label l1 = new Label("PIZZA");
        Label ll1 = new Label("Add Ingredients");
        Label lll1 = new Label("Price");
        
        TextField t1 = new TextField();
        
        TextField tt1 = new TextField();
        
        Button b1 = new Button("Add Pizza");
        
        VBox vbcontrol1 = new VBox();
        vbcontrol1.getChildren().addAll(l1,ll1,t1,lll1,tt1,b1);
        vbcontrol1.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
        
        Label l2 = new Label("DRINK");
        Label ll2 = new Label("Add NAME");
        Label lll2 = new Label("Price");
        
        TextField t2 = new TextField();
        
        TextField tt2 = new TextField();
        
        Button b2 = new Button("Add Drink");
        
        VBox vbcontrol2 = new VBox();
        vbcontrol2.getChildren().addAll(l2,ll2,t2,lll2,tt2,b2);
        vbcontrol2.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
        
        Label l3 = new Label("DEAL"); 
        Label ll3 = new Label("Add PIZZA ID");
        Label lll3 = new Label("ADD DRINK ID");
        
        TextField t3 = new TextField();
        
        TextField tt3 = new TextField();
        
        Button b3 = new Button("Add Deal");
        
        VBox vbcontrol3 = new VBox();
        vbcontrol3.getChildren().addAll(l3,ll3,t3,lll3,tt3,b3);
        vbcontrol3.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
        
        hbcontrol1.getChildren().addAll(vbcontrol1,vbcontrol2,vbcontrol3);
        hbcontrol1.setTranslateX(-60);
 
        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(table1,table2,table3);
        hbox.setTranslateX(-200);
		
		
		VBox vb1 = new VBox(10);
		vb1.getChildren().addAll(close,head,sub_head,hbcontrol1,hbox);
		vb1.setTranslateX(220);
		
		
		close.setOnMouseClicked(e ->{
			primaryStage.close();
		});
		
		root.getChildren().addAll(vb1);
		scene3 = new Scene(root,800,500);
		primaryStage.setScene(scene3);
		primaryStage.show();
	}

}
