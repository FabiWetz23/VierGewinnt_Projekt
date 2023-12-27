module at.ac.fhcampuswien.viergewinnt_projekt {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens at.ac.fhcampuswien.viergewinnt_projekt to javafx.fxml;
    exports at.ac.fhcampuswien.viergewinnt_projekt;
}