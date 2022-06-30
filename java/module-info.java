module com.example.casestudy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.casestudy to javafx.fxml;
    exports com.example.casestudy;
}