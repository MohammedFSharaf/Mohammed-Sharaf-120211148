/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import View.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SCc
 */
public class SystemController implements Initializable {

    @FXML
    private Button log_out;
    @FXML
    private TextField ins;
    @FXML
    private TextField usd;
    @FXML
    private Button convert;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutfunc(ActionEvent event) {
        
        ((Stage) log_out.getScene().getWindow()).close();
        ViewManager viewManager = new ViewManager();
        viewManager.showLogin();

    }

    @FXML
    private void convertfunc(ActionEvent event) {
        
String usdAmountString = usd.getText().trim();
    String insAmountString = ins.getText().trim();
    
    if (usdAmountString.isEmpty() && insAmountString.isEmpty()) {
       
        return;
    }
    
    if (!usdAmountString.isEmpty() && !insAmountString.isEmpty()) {
       
        return;
    }
    
    double usdAmount = 0;
    double insAmount = 0;
    double conversionRate = 3.5; 
    
    try {
        if (!usdAmountString.isEmpty()) {
            usdAmount = Double.parseDouble(usdAmountString);
            insAmount = usdAmount * conversionRate;
            ins.setText(String.format("%.2f", insAmount));
        } else {
            insAmount = Double.parseDouble(insAmountString);
            usdAmount = insAmount / conversionRate;
            usd.setText(String.format("%.2f", usdAmount));
        }
    } catch (NumberFormatException ex) {
   

    }
    }
    
}
