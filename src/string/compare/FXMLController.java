/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.compare;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DH. Choi
 */
public class FXMLController implements Initializable {

    /*
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    private String st1, st2, message;
    @FXML private TextField string1;
    @FXML private TextField string2;
    @FXML private Text compareResult;
    
    @FXML protected void compare() {
        st1 = string1.getText();
        st2 = string2.getText();
        if(st1.length() == 0 || st2.length() == 0)
            message = "문자열을 입력하세요";
        else if(st1.equals(st2))
            message = "두 문자열이 일치합니다.";
        else
            message = "두 문자열이 일치하지 않습니다.";
        compareResult.setText(message);
    }
    
}
