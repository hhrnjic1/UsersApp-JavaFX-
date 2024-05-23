module com.example.lab7i8_korisnici {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.users to javafx.fxml;
    exports com.example.users;
}