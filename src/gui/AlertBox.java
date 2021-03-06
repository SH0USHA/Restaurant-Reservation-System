package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

	public static void display(String message){

		Stage errorWindow = new Stage();
		errorWindow.initModality(Modality.APPLICATION_MODAL);
		errorWindow.setTitle(message);

		Label label = new Label(message);
		Button button = new Button("Back");
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				errorWindow.close();
			}
		});

		VBox vbox = new VBox(8, label, button);


		vbox.setAlignment(Pos.CENTER);

		Scene scene = new Scene(vbox, 450, 250);
		errorWindow.setScene(scene);
		errorWindow.showAndWait();
	}
}
