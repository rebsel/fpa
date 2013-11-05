/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bht.fpa.mail.s792118.main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Rebecca
 */
public class FPAMailSystem extends Application {
    
    /*
     * überschriebene methode START() wird beim Erzeugen der Anwendung aufgerufen und legt Inhalt des Fensters fest
     */
    @Override
    public void start(Stage stage) throws Exception {
     
        try {
        //Beschreibung des Szenegraphen mittels FXML-Datei laden
        Parent root = FXMLLoader.load(getClass().getResource("/de/bht/fpa/mail/s792118/view/Sample.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("FPAMailer");
        stage.setScene(scene);
        stage.show();
     } catch (IOException e) {  //ist eine checkedException-->allgemeiner Ausgabefehler
          // Exception wird geworfen, wenn die FXML-Datei nicht geladen werden kann
          e.printStackTrace();
      }
        }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}