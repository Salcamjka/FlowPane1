module SALCA.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens SALCA.example to javafx.fxml;
    exports SALCA.example;
}
