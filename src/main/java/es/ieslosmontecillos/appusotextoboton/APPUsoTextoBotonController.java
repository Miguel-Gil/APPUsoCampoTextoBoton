package es.ieslosmontecillos.appusotextoboton;

import es.ieslosmontecillos.componentes_gilmiguel.CampoTextoBoton;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class APPUsoTextoBotonController implements Initializable {
    @javafx.fxml.FXML
    private CampoTextoBoton ctb1;
    @javafx.fxml.FXML
    private CampoTextoBoton ctb2;
    @javafx.fxml.FXML
    private Label lbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ctb1.setBtnText("Grabar");
        ctb1.setOnAction(e -> {
            lbl.setText("Se ha grabado: "+ctb1.getText());
        });

        ctb2.setBtnText("Grabar");
        ctb2.setOnAction(e -> {
            lbl.setText("Se ha grabado: "+ctb2.getText());
        });
    }

}
