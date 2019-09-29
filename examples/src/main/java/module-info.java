module io.github.quellatalo {
    requires javafx.controls;
    requires javafx.fxml;
    requires table.view.x;
    requires junit;

    opens io.github.quellatalo to javafx.fxml;
    opens io.github.quellatalo.tableviewx to javafx.fxml;
    exports io.github.quellatalo;
    exports io.github.quellatalo.tableviewx;
}
