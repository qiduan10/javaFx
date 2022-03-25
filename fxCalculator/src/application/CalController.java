package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

public class CalController implements Initializable{
	
	double first, second, result;
	int oper;
	
	@FXML
    private TextField txtshow;
	
	@FXML
    private Button clear;

    @FXML
    private Button sign;

    @FXML
    private Button percentage;

    @FXML
    private Button divid;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button equal;

    @FXML
    void ResultAction(ActionEvent event) {
    	second = Double.parseDouble(txtshow.getText());
    	switch(oper) {
    	case 1:
    		result = first + second;
    		txtshow.setText(Double.toString(result));
    		break;
    	case 2:
    		result = first - second;
    		txtshow.setText(Double.toString(result));
    		break;
    	case 3:
    		result = first * second;
    		txtshow.setText(Double.toString(result));
    		break;
    	case 4:
    		result = first / second;
    		txtshow.setText(Double.toString(result));
    		break;
    	}

    }

    @FXML
    void clearAction(ActionEvent event) {
    	txtshow.setText("");

    }

    @FXML
    void handle(ActionEvent event) {
    	String value = ((Button)event.getSource()).getText();
    	txtshow.setText(txtshow.getText() + value);

    }

    @FXML
    void operationAction(ActionEvent event) {
    	String value = ((Button)event.getSource()).getText();
    	first = Double.parseDouble(txtshow.getText());
    	switch (value) {
    	case "+":
    		oper = 1;
    		txtshow.setText("");
    		break;
    	case "-":
    		oper = 2;
    		txtshow.setText("");
    		break;
    	case "*":
    		oper = 3;
    		txtshow.setText("");
    		break;
    	case "/":
    		oper = 4;
    		txtshow.setText("");
    		break;
    	}

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
	
	

