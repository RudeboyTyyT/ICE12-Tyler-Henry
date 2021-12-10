module ca.durhamcollege.ice12_tylerhenry {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.durhamcollege.ice12_tylerhenry to javafx.fxml;
    exports ca.durhamcollege.ice12_tylerhenry;
}