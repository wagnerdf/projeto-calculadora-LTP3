package projetoCalculadora;

import javax.swing.JOptionPane;

public class ConverterRomano {
	
//	metodo converter para romano
	public String numero(int n){
        int i;
		int [ ] arrayNumeros = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String [ ] arrayRomanos = {"M", "CM", "D", "CD", "C", "XC","L","XL","X","IX","V","IV","I"};
		String romano = "";
		
	if (n<1){
		JOptionPane.showMessageDialog(null,"O numero "+n+" invalido, informe um numero POSITIVO.");
	    return "Nş "+n+" Invalido.";
	}
	if (n>3999){
		JOptionPane.showMessageDialog(null,"O numero "+n+" invalido, Informe um numero menor que 4000.");
	    return "Nş "+n+" Invalido.";
	}
		
		for(i=0;i<arrayNumeros.length;i++){
		    while(n >= arrayNumeros[i]){
		    romano +=arrayRomanos[i];
		    n -= arrayNumeros[i];
		    }
		}
		return romano;
	}
}
