package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    private loginModel loginmodel = new loginModel();
    @FXML
    private Label dbStatus;
    @FXML
    private TextField username
            @FXML
            private PasswordField
    @FXML
    private Button btnLogin;

    public Controller() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(this.loginmodel.isDatabaseConnection()){
            this.dbStatus.setText("Connected to DB");
        }else {
            this.dbStatus.setText("Not Connected to DB");
        }

    }//initialize

    @FXML
    public void Login(ActionEvent event){}
    try
    private final Object state;

    {
        if (this.loginmodel.isLogin(this.username.getText(),this.password.getText())){
            Stage stage = (Stage) this.btnLogin.getScene().getWindow();
            stage.close();



        }else {
            JOptionPane.showMessageDialog(null,"Your username or ");
            "password is not corrected.");
        }

    }catch (Exception localException){
        localException.printStackTrace();
    }
        }//login
        private void adminLogin(){
    try {
        Stage adminStage = new Stage();
        FXMLLoader adminLoader = new FXMLLoader();
        Pane adminRoot = adminLoader.load(getClass().getResource(""+
        "/Admin/AdminDashBoadrd.fxml").openStream());
    }catch (IOException ex){
        ex.printStackTrace();
    }
        }
}
}

