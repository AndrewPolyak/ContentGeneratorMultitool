package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


/**
 * The MultitoolDriver class initializes the GUI and executes the main method (i.e., the program)
 * 
 * @version 04/22/2024
 * @author Andrew Polyak
 */
public class MultitoolDriver extends Application {
	
	/**
	 * The start method initializes the GUI and specifies it's file path
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("/view/MultitoolInterface.fxml"));
			Scene scene = new Scene(root,1000,800);
			scene.getStylesheets().add(getClass().getResource("/view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The main method executes the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
