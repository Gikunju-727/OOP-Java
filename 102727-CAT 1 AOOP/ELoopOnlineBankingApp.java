import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.PasswordField; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.scene.paint;

public class ELoopOnlineBankingApp extends Application{
	
	 public static void main(String[] args) {
       launch(args);
	 }
	   
	 @Override
    public void start(Stage stage) { 
	 //creating label First Name 
      Text text1 = new Text("First Name");       
      
      //creating label Last Name 
      Text text2 = new Text("Last Name"); 
	  
	  //Creating label Mobile Number
	  Text text3 = new Text("Mobile Number");
	  
	  //Creating label Email Address
       Text text4 = new Text("Email Address");
	   
	  //Creating label Password
       Text text5 = new Text("Password");
	   
	  //Creating label Legal ID Type
	   Text text6 = new Text("Legal ID Type");
	   
	  //Creating label KRA Pin
	   Text text7 = new Text("Enter KRA Pin");
	   
      //Creating Text Filed for First Name        
      TextField textField1 = new TextField();  

      //Creating Text Filed for Last Name        
      TextField textField2 = new TextField(); 	
      
	  //Creating Text Filed for Mobile Number        
      TextField textField3 = new TextField(); 
	  
	  //Creating Text Filed for Email Address       
      TextField textField4 = new TextField(); 
	  
	  //Creating Text Filed for Password        
      TextField textField5 = new TextField(); 
	 
      //Creating Text Filed for ID Type       
      PasswordField textField6 = new PasswordField();  
	  
	  //Creating Text Filed for KRA Pin       
      TextField textField7 = new TextField(); 
	  
	  //Creating Buttons
	  Button button1 = new Button("Complete Registration");  
	  Button button2 = new Button("Cancel");  
	  
	 //Creating comboBox
	  
	   ComboBox comboBox = new ComboBox();

        comboBox.getItems().add("National ID");
        comboBox.getItems().add("Military ID");
        comboBox.getItems().add("Alien ID");
		
	//Creating Action Listener for Complete registration button (button1) 
      EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(ActionEvent event) { 
            System.out.println("Thank you for registering for E-Loop Online Banking Application"); 
            button1.setFill(Color.BLUE);
         } 
      };  
	  //Registering the event filter 
      button1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);  
      
	  
	  //Creating a Grid Pane 
      GridPane gridPane = new GridPane();  
	  
	  //Setting size for the pane 
      gridPane.setMinSize(1000,800); 
	  
       //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 

	  //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(7); 
      gridPane.setHgap(7); 
	  
	  //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER);
	  
	  //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0)
	  gridPane.add(textField1, 1, 0);

      gridPane.add(text2, 0, 1);
      gridPane.add(textField2, 1, 0);

      gridPane.add(text3, 0, 2);
      gridPane.add(textField3, 1, 2);

      gridPane.add(text4, 0, 3);
      gridPane.add(textField4, 1, 3);

      gridPane.add(text5, 0, 4);
      gridPane.add(textField5, 1, 4);

      gridPane.add(text6, 0, 5);
      gridPane.add(textField6, 1, 5);

      gridPane.add(text7, 0, 6);
      gridPane.add(textField7, 1, 6);
	  
      gridPane.add(button1, 0, 7);
      gridPane.add(button1, 1, 7);
	        
    //Styling nodes  
      button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
       
      text1.setStyle("-fx-font: normal bold 20px 'Edwardian Script ITC' "); 
      text2.setStyle("-fx-font: normal bold 20px 'Edwardian Script ITC' ");  
	  text3.setStyle("-fx-font: normal bold 20px 'Edwardian Script ITC' ");  
	  text4.setStyle("-fx-font: normal bold 20px 'Edwardian Script ITC' ");  
	  text5.setStyle("-fx-font: normal bold 20px 'Edwardian Script ITC' ");  
	  text6.setStyle("-fx-font: normal bold 20px 'Edwardian Script ITC' ");  
	  text7.setStyle("-fx-font: normal bold 20px 'Edwardian Script ITC' ");  
      gridPane.setStyle("-fx-background-color: BEIGE;"); 
       
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
       
      //Setting title to the Stage 
      stage.setTitle("E-Loop Online Banking Application");  

	  //Stylling title and text
	  title.setFont(Font.font("Edwardian Script ITC", 24)); 
	  text.setStroke(Color.DARKSLATEBLUE); 
      text.setFill(Color.BEIGE);  
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show(); 
	  
	}
	 
}
	
