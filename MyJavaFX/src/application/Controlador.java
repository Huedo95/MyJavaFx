package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Controlador {

	@FXML
	public ImageView refugees;

	private Ellipse ceiling;
	public AnchorPane page;
	public Scene scene;

	public Stage sendStage;

	public void showSendProfile() {
		try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Principal.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send Profile");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            
            sendStage.show();

			// clips

			// );
			//
			// ColorAdjust colorAdjust = new ColorAdjust();
			// colorAdjust.setContrast(1);
			// colorAdjust.setHue(0);
			// colorAdjust.setBrightness(0);
			// colorAdjust.setSaturation(0);
			// // ceiling_image.setEffect(colorAdjust);
			// ceiling_image.setEffect(new GaussianBlur(5));
			// refugees.setClip(ceiling);

			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * la clase controladora que añade un efecto a la imagen
	 */
	class SetBlur {

		@FXML
		private ImageView refugees;

		/**
		 * la etiqueta FXML permite acceder al componente imageView ya creado en
		 * fxml
		 */
		
		@FXML
		public void initialize() {
			refugees.setEffect(new GaussianBlur(50));

		}
	}

	/**
	 * Method to handle the ImageView action in the Main stage
	 */

	@FXML
	private void handleSend() {
		showSendProfile();
		// sendStage.close();
	}

	/**
	 * Closes the application when clicked on Exit in the secondary stage
	 */
	@FXML
	private void handleClose() {

		System.exit(0);
	}
}
