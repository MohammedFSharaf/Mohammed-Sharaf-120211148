/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author SCc
 */
public class LoginPage extends Stage {

  
    private Scene logScene;
    private Scene sysScene;
   

    public LoginPage() throws IOException {
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminFXML/Log.fxml"));
        Parent root = loader.load();     
        logScene = new Scene(root);
        
        
       
        FXMLLoader loaderCreate = new FXMLLoader(getClass().getResource("AdminFXML/Sys.fxml"));
        Parent rootCreate = loaderCreate.load();     
        sysScene = new Scene(rootCreate);
        
       
        this.setScene(sysScene);
        this.setTitle("System Page");
        
        
    }
    public void changeSceneToLoginScene(){
        this.setScene(logScene);
    }
    public void changeSceneToSystemScene(){
        this.setScene(sysScene);
    }

   
    
}
