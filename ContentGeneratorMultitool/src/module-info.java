module ContentGeneratorMultitool {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	exports controller;
	
	opens application to javafx.graphics, javafx.fxml;
}
