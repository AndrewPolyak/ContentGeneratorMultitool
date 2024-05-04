module ContentGeneratorMultitool {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    
    exports application;
    exports controller;
    
    opens controller to javafx.fxml;
}
