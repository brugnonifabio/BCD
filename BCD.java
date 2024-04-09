package scuola;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Hashtable;

public class BCD extends Application{
	TextField tNum=new TextField();
	Label lNums=new Label();
	Label lBCD=new Label();
	Label lRis=new Label();
	Button calcola  = new Button("calcola");
	
	
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);

		finestra.setScene(scena);
		finestra.setTitle("rle");
		finestra.show();
		
		calcola.setOnAction(e->calcola());
		
		griglia.add(tNum, 0, 0);
		griglia.add(lNums, 0, 1);
		griglia.add(calcola, 0, 2);
		griglia.add(lBCD, 0, 3);
		griglia.add(lRis, 0, 4);
	}

	private void calcola() {
		
		String sV[]=tNum.getText().split(""), sBCD=" ";
		Hashtable<String, String> conversione = new Hashtable <String,String>();
		
		conversione.put("0", "0000");
		conversione.put("1", "0001");
		conversione.put("2", "0010");
		conversione.put("3", "0011");
		conversione.put("4", "0100");
		conversione.put("5", "0101");
		conversione.put("6", "0110");
		conversione.put("7", "0111");
		conversione.put("8", "1000");
		conversione.put("9", "1001");
		
		
		for (int i=0;i<sV.length;i++) {
			sBCD+=conversione.get(sV[i]);
		}
		lRis.setText(sBCD);
		
	}
	public static void main(String[] args) {
		launch(args);

	}

}
