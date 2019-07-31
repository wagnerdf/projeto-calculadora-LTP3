package projetoCalculadora;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class NumeroRomano extends JFrame{
//
	 private JLabel labelRomano1;
	 private JLabel labelRomano2;
	 private JLabel labelRomano3;
	 private JTextField romanoResultadoTextField;
	 private JTextField romanoTextField;
	 private JButton botaoSair;
	 private JButton botaoLimpar;
	 private JButton botaoRomano;
	 
	 ConverterRomano converter = new ConverterRomano();
	  
	 public NumeroRomano(){
	   this.setTitle("Calculadora números romanos");
	   this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   this.setResizable(false);
	   
	   this.setBounds(450, 250, 200, 150);
	   Container c = getContentPane();
	   c.setLayout(new FlowLayout());
	   
//Adicionando botão sair	   	  
	  botaoSair = new JButton("Sair");
	  botaoSair.addActionListener(new ActionListener(){
	   
		  @Override
			public void actionPerformed(ActionEvent Evento) {
			    NumeroRomano.this.dispose(); //Fecha somente o formulario NumeroRomano sem fechar o formulário principal. 
				
	   }
	  });
//Adicionando botão limpar	
	  botaoLimpar = new JButton("Limpar");
	  botaoLimpar.addActionListener(new ActionListener(){
	   
		  @Override
			public void actionPerformed(ActionEvent Evento) {
				romanoTextField.setText("");
				romanoResultadoTextField.setText("");
	    
	   }
	  });	  
	        
//	 Botão para converter para numeros Romano.
	   botaoRomano = new JButton("Converter");
	   botaoRomano.addActionListener(
	   new ActionListener(){    
		   @Override
			public void actionPerformed(ActionEvent Evento) {
				String resul;  
		    	   try{
		    		   int num = Integer.parseInt(romanoTextField.getText());   
		    		   resul = converter.numero(num);
		    		   romanoResultadoTextField.setText(String.valueOf(resul));	   
		    	   }
		    	   catch (Exception e) {
		    		   JOptionPane.showMessageDialog(null,"Caracter Invalido.");
		    	   }    
		   }
	   });
	   
	   labelRomano1 = new JLabel("      Converter p/  Nº. ROMANO       ");  
	   labelRomano2 = new JLabel("Nº.:"); 
	   romanoTextField = new JTextField (3);
	   labelRomano3 = new JLabel("Resultado");
	   romanoResultadoTextField = new JTextField(10);
	   romanoResultadoTextField.setEditable(false);
	    
	    c.add (labelRomano1);
	    c.add (labelRomano2);
	    c.add(romanoTextField);
	    c.add (botaoRomano);
	    c.add (labelRomano3);
	    c.add (romanoResultadoTextField);
	    c.add (botaoLimpar);
	    c.add (botaoSair);
	    
	    this.setVisible(true);
	    
	   }

}
