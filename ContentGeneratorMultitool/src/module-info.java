module ContentGeneratorMultitool {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports controller;
	
	opens application to javafx.graphics, javafx.fxml;
}
