package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
//This controller class is for controlling the Second scene i.e Level1
public class Exp1_Controller implements Initializable {
	@FXML	private AnchorPane anPaneStage1;
	@FXML	private Label lblLogo;
	@FXML	private Label lblckt;
	//Buttons for Experiments 1-10
	@FXML	private JFXButton btnE1;
	@FXML	private JFXButton btnE2;
	@FXML	private JFXButton btnE3;
	@FXML	private JFXButton btnE4;
	@FXML 	private JFXButton btnE5;
	@FXML	private JFXButton btnE6;
	@FXML	private JFXButton btnE7;
	@FXML	private JFXButton btnE8;
	@FXML	private JFXButton btnE9;
	@FXML	private JFXButton btnE10;
	//Primary Panes
	@FXML	private Pane p1_1;
	@FXML	private Pane p2_1;
	@FXML	private Pane p3_1;
	@FXML	private Pane p4_1;
	@FXML	private Pane p5_1;
	@FXML	private Pane p6_1;
	@FXML	private Pane p7_1;
	@FXML	private Pane p8_1;
	@FXML	private Pane p9_1;
	@FXML	private Pane p10_1;
	//Secondary Panes
	@FXML	private Pane p1;
	@FXML	private Pane p2;
	@FXML	private Pane p3;
	@FXML	private Pane p4;
	@FXML	private Pane p5;
	@FXML	private Pane p6;
	@FXML	private Pane p7;
	@FXML	private Pane p8;
	@FXML	private Pane p9;
	@FXML	private Pane p10;
	@FXML	private Pane p0;
	//Image Views Experiment 1
	@FXML	private ImageView e1_target;
	@FXML	private ImageView e1_target1;
	@FXML	private ImageView e1_target2;
	@FXML	private ImageView e1_target3;
	@FXML	private ImageView e1_source1;
	@FXML	private ImageView e1_source2;
	@FXML	private ImageView e1_source3;
	private File f;
	private Image blue;
	//All Other buttons
		@FXML    private JFXButton btnHome1;
	    @FXML    private JFXButton btnClose1;
	    @FXML    private JFXButton btnPrev1;
	    @FXML    private JFXButton btnDone1;
	    @FXML    private Button btnHome1_1;
	    @FXML    private JFXButton btnClose1_1;
	    @FXML    private JFXButton btnPrev1_1;
	    @FXML    private JFXButton btnDone1_1;
	    

	//This initializes all the Primary as well as the Secondary panes as not visible 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		primaryPanesNotVisible();
		secondaryPanesNotVisible();
		//At start pane 0 will be at front
		p0.toFront();
		//to get the image file from location into the object of Image
		f=new File("C:/Users/Anant/Desktop/INTERNSHIP/CODE/Project2/src/view.Default.png");
		blue =new Image(f.toURI().toString());
		
	}
	//Function to Exit Program
	public  void bye(ActionEvent e) {
		Platform.exit();
		System.exit(0);
	}
	//Fucntion to Go to Home Screen
	public  void byeSecondary(ActionEvent e) throws IOException {
		Stage primaryStage =new Stage();
		primaryStage =(Stage)((Node) e.getSource()).getScene().getWindow();
		primaryStage.close();
	}
	//Primary panes as not visible
	public void primaryPanesNotVisible() {
		p1.setVisible(false);
		p2.setVisible(false);
		p3.setVisible(false);
		p4.setVisible(false);
		p5.setVisible(false);
		p6.setVisible(false);
		p7.setVisible(false);
		p8.setVisible(false);
		p9.setVisible(false);
		p0.setVisible(true);
		p10.setVisible(false);
	}
	//Secondary panes as not visible
	public void secondaryPanesNotVisible() {
		p10.setVisible(false);
		p1_1.setVisible(false);
		p2_1.setVisible(false);
		p3_1.setVisible(false);
		p4_1.setVisible(false);
		p5_1.setVisible(false);
		p6_1.setVisible(false);
		p7_1.setVisible(false);
		p8_1.setVisible(false);
		p9_1.setVisible(false);
		p10_1.setVisible(false);
	}
	//This Function is for the Buttons Exp I - XI
	public void button_event(ActionEvent e) {
		primaryPanesNotVisible();
		//To get Panes to Front of Stack pane
		if(e.getTarget().equals(btnE1)) {
			p1.setVisible(true);p1.toFront();
		}else if(e.getTarget().equals(btnE2)) {
			p2.setVisible(true);p2.toFront();
		}else if(e.getTarget().equals(btnE3)) {
			p3.setVisible(true);p3.toFront();
		}else if(e.getTarget().equals(btnE4)) {
			p4.setVisible(true);p4.toFront();
		}else if(e.getTarget().equals(btnE5)) {
			p5.setVisible(true);p5.toFront();
		}else if(e.getTarget().equals(btnE6)) {		
			p6.setVisible(true);p6.toFront();
		}else if(e.getTarget().equals(btnE7)) {
			p7.setVisible(true);p7.toFront();
		}else if(e.getTarget().equals(btnE8)) {
			p8.setVisible(true);p8.toFront();
		}else if(e.getTarget().equals(btnE9)) {
			p9.setVisible(true);p9.toFront();
		}else if(e.getTarget().equals(btnE10)) {			
			p10.setVisible(true);p10.toFront();
		}
	}
	
	//Following Functions are used to bring each Panes to front and make then visible
	//Primary Panes
	public void pane1ToFront(ActionEvent e) {
		p1.setVisible(true);p1.toFront();
	}
	public void pane2ToFront(ActionEvent e) {
		p2.setVisible(true);p2.toFront();
	}
	public void pane3ToFront(ActionEvent e) {
		p3.setVisible(true);p3.toFront();
	}
	public void pane4ToFront(ActionEvent e) {
		p4.setVisible(true);p4.toFront();
	}
	public void pane5ToFront(ActionEvent e) {
		p5.setVisible(true);p5.toFront();
	}
	public void pane6ToFront(ActionEvent e) {
		p6.setVisible(true);p6.toFront();
	}
	public void pane7ToFront(ActionEvent e) {
		p7.setVisible(true);p7.toFront();
	}
	public void pane8ToFront(ActionEvent e) {
		p8.setVisible(true);p8.toFront();
	}
	public void pane9ToFront(ActionEvent e) {
		p9.setVisible(true);p9.toFront();
	}
	public void pane10ToFront(ActionEvent e) {
		p10.setVisible(true);p10.toFront();
	}
	
	//Secondary Panes
	public void pane1_1ToFront(ActionEvent e) {
		p1_1.setVisible(true);p1_1.toFront();
	}
	public void pane2_1ToFront(ActionEvent e) {
		p2_1.setVisible(true);p2_1.toFront();
	}
	public void pane3_1ToFront(ActionEvent e) {
		p3_1.setVisible(true);p3_1.toFront();
	}
	public void pane4_1ToFront(ActionEvent e) {
		p4_1.setVisible(true);p4_1.toFront();
	}
	public void pane5_1ToFront(ActionEvent e) {
		p5_1.setVisible(true);p5_1.toFront();
	}
	public void pane6_1ToFront(ActionEvent e) {
		p6_1.setVisible(true);p6_1.toFront();
	}
	public void pane7_1ToFront(ActionEvent e) {
		p7_1.setVisible(true);p7_1.toFront();
	}
	public void pane8_1ToFront(ActionEvent e) {
		p8_1.setVisible(true);p8_1.toFront();
	}
	public void pane9_1ToFront(ActionEvent e) {
		p9_1.setVisible(true);p9_1.toFront();
	}
	public void pane10_1ToFront(ActionEvent e) {
		p10_1.setVisible(true);p10_1.toFront();
	}
	@FXML	private void e1_handleondrag1(MouseEvent e){
		Dragboard db = e1_source1.startDragAndDrop(TransferMode.ANY);
		ClipboardContent cb = new ClipboardContent();
		cb.putImage(e1_source1.getImage());
		db.setContent(cb);
		e.consume();
	}
	@FXML	private void e1_handleondrag2(MouseEvent e){
		Dragboard db = e1_source2.startDragAndDrop(TransferMode.ANY);
		ClipboardContent cb = new ClipboardContent();
		cb.putImage(e1_source2.getImage());
		db.setContent(cb);
		e.consume();
	}
	@FXML	private void e1_handleondrag3(MouseEvent e){
		Dragboard db = e1_source3.startDragAndDrop(TransferMode.ANY);
		ClipboardContent cb = new ClipboardContent();
		cb.putImage(e1_source3.getImage());
		db.setContent(cb);
		e.consume();
	}
	@FXML	private void e1_handledregover(DragEvent e) {
		if(e.getDragboard().hasImage()) {
			e.acceptTransferModes(TransferMode.ANY);
		}
	}
	@FXML	private void e1_handledrop(DragEvent e) {
		Image img=e.getDragboard().getImage();
		
		if (e.getGestureSource().equals(e1_source1)&&e.getGestureTarget().equals(e1_target1)) {
			e1_target1.setImage(img);e1_source1.setImage(blue);
		}
		if (e.getGestureSource().equals(e1_source2)&&e.getGestureTarget().equals(e1_target2)) {
			e1_target2.setImage(img);e1_source2.setImage(blue);
		}
		if (e.getGestureSource().equals(e1_source3)&&e.getGestureTarget().equals(e1_target3)) {
			e1_target3.setImage(img);e1_source3.setImage(blue);
		}
	}
	@SuppressWarnings("deprecation")
	@FXML	private void e1_done(ActionEvent e) {
		if(e1_source1.getImage().impl_getUrl().equals(blue.impl_getUrl())) {
			if(e1_source2.getImage().impl_getUrl().equals(blue.impl_getUrl())) {
				if(e1_source3.getImage().impl_getUrl().equals(blue.impl_getUrl())) {
					e1_target1.setVisible(false);
					e1_target2.setVisible(false);
					e1_target3.setVisible(false);
					
				}
			}		
		}
	}
	
	
	
	
}


