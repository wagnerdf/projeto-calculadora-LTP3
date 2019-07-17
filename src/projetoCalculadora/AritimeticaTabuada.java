package projetoCalculadora;


import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;


public class AritimeticaTabuada{
	//ExemploCombo ExCombo = new ExemploCombo(null);
//	Metodo soma
	public String soma(int op){
	  int i;
	  String resultado = "";
		for(i=0;i<10;i++){
	    	 resultado = resultado+("                "+op+"     +     "+i+"     =     "+(op+i)+"\n");  
	      }
		return resultado;
	}
//	Metodo multiplicação	
	public String multiplica(int op){
		  int i;
		  String resultado = "";
			for(i=0;i<10;i++){
		    	 resultado = resultado+("                "+op+"     x     "+i+"     =     "+(op*i)+"\n");  
		  }
		return resultado;
	}
	
	
	
}