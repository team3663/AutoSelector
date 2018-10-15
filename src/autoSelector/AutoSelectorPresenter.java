package autoSelector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;

public class AutoSelectorPresenter
{
	@FXML
	private ToggleButton one01;
	@FXML
	private ToggleButton one02;
	@FXML
	private ToggleButton one03;
	@FXML
	private ToggleButton two01;
	@FXML
	private ToggleButton two02;
	@FXML
	private ToggleButton two03;
	@FXML
	private ToggleButton three01;
	@FXML
	private ToggleButton three02;
	@FXML
	private ToggleButton three03;
	
	@FXML
	protected void changeButtonLabel(ActionEvent event)
	{
		ToggleButton button = (ToggleButton) event.getSource();
		button.setText("You pushed the button");
	}
}
