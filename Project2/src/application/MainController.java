package application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
	@FXML	private Button btnExit;
	@FXML	private Button btn1;
	@FXML	private Button btn2;
	@FXML	private Button btnAbout;
	@FXML	private AnchorPane anPane;
	// Main (Home) Screen
	Stage secondaryStage = new Stage();

	public void stage_0_Button_Event(ActionEvent e)throws Exception {
		if(e.getTarget().equals(btn1)) {
			//If User Pressed Level 1
			Parent root =FXMLLoader.load(getClass().getResource("/application/Stage_1_1.fxml"));
			Scene scene = new Scene(root,1360,735);
			scene.getStylesheets().add(getClass().getResource("Stage_1CSS.css").toExternalForm());
			//secondaryStage.initStyle(StageStyle.UNDECORATED);
			secondaryStage.setScene(scene);
			secondaryStage.show();
		}
		if(e.getTarget().equals(btn2)) {
			//If User Pressed Level 2
		}
		if(e.getTarget().equals(btnExit)) {
			//If User pressed Exit button
			System.exit(0);
			Platform.exit();
		}
		if(e.getTarget().equals(btnAbout)) {
			//If User pressed Help button
			Parent root =FXMLLoader.load(getClass().getResource("/application/Stage_1_Help.fxml"));
			Scene scene = new Scene(root,1360,720);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			secondaryStage.setScene(scene);
			secondaryStage.show();
		}	
	}
}
