package SALCA.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX.
 * Carga un archivo FXML y aplica estilos CSS.
 *
 * @author salca
 */
public class App extends Application {

    // Variable estática para guardar la escena principal
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Carga el archivo pan.fxml desde la carpeta resources/SALCA/example/
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("pan.fxml"));

        // Crea la escena con el contenido del FXML (tamaño inicial: 640x480)
        scene = new Scene(fxmlLoader.load(), 640, 480);

        // Define el título de la ventana
        stage.setTitle("FlowPane Alignment");

        // Aplica la hoja de estilos styles.css
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Asocia la escena al Stage (ventana principal)
        stage.setScene(scene);

        // Muestra la ventana
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
