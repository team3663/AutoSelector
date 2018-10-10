package autoSelector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;

public class AutoSelectorPresenter
{
	@FXML
	private ToggleButton button1;
	@FXML
	private ToggleButton button2;
	@FXML
	private ToggleButton button3;
	
	@FXML
	protected void changeButtonLabel(ActionEvent event)
	{
		ToggleButton button = (ToggleButton) event.getSource();
		button.setText("You pushed the button");
	}
}
