package autoSelector;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

/*
 * The GUI displayed to the user. It should contain no logic and only interact with the Presenter 
 */
public class AutoSelectorView extends Application
{
	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("auto_selector.fxml"));
	        primaryStage.setTitle("Autonomous Selector");
	        primaryStage.setScene(new Scene(root, 800, 500));
	        primaryStage.show();
	        
			Timeline refreshConnection = new Timeline(new KeyFrame(Duration.seconds(AppConsts.REFRESH_DELAY_SEC), update()));
			refreshConnection.setCycleCount(Timeline.INDEFINITE);
			refreshConnection.play();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	/*
	 * This function will run constantly throughout the program's runtime
	 */
	private EventHandler<ActionEvent> update()
	{
		return new EventHandler<ActionEvent>()
		{
		    @Override
		    public void handle(ActionEvent event) 
		    {
		        System.out.println("this is called every " + AppConsts.REFRESH_DELAY_SEC + " seconds on UI thread");
		    }
		};
	}
}