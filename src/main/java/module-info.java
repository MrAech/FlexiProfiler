module com.aech.flexiprofiler {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires org.kordamp.ikonli.fontawesome5;

    opens com.aech.flexiprofiler to javafx.fxml;
    exports com.aech.flexiprofiler;
    exports com.aech.flexiprofiler.ui;
    opens com.aech.flexiprofiler.ui to javafx.fxml;
}