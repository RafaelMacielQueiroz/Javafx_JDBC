module workshop {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports gui; // 

	//Aqui Estou pedido para abrir um package em Javafx
	opens model.entities to javafx.base;
    opens gui to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
