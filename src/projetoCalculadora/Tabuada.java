package projetoCalculadora;


import javax.swing.*;   

import java.awt.*;   
import java.awt.event.*;   
  
public class Tabuada extends JFrame {   
   private JComboBox comboTabuada;
   private JComboBox comboOperador;
   private JButton botao; 
   private JTextArea areaTexto1;
   int i;
   
   AritimeticaTabuada tabuadaA = new AritimeticaTabuada();
      
// public class Tabuada() {   
  //   new ExemploCombo("");   
    //}   

   public Tabuada() {   
	   this.setTitle("MODULO - TABUADA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    this.setBounds(450, 250, 250, 300);
	    Container c = getContentPane();
	    c.setLayout(new FlowLayout());
	   
	   
	   
      //Container contentPane = this.getContentPane();   
         
      //JPanel painel = new JPanel();   
         
      comboTabuada = new JComboBox();
      
         
      comboTabuada.addItem("1");   
      comboTabuada.addItem("2");   
      comboTabuada.addItem("3");   
      comboTabuada.addItem("4");
      comboTabuada.addItem("5");
      comboTabuada.addItem("6");
      comboTabuada.addItem("7");
      comboTabuada.addItem("8");
      comboTabuada.addItem("9");
      
      comboOperador = new JComboBox();
      
      comboOperador.addItem("+");
      comboOperador.addItem("-");
      comboOperador.addItem("/");
      comboOperador.addItem("*");
      
      botao = new JButton("Clique");   
      botao.addActionListener(new ActionListener() {   
         public void actionPerformed(ActionEvent e) {   
        	 
        	String operador = String.valueOf(comboOperador.getSelectedItem());
       	    int op = Integer.parseInt((String) comboTabuada.getSelectedItem()); 
       	 
       	 if (operador == "+"){
       		//JOptionPane.showInputDialog("Valor "+op+" Operador "+operador);
       		areaTexto1.setText("           TABUADA  -  ADIÇÂO\n  --------------------------------------------\n"); 
       		areaTexto1.append(tabuadaA.soma(op));  
       		//areaTexto1.setText("   --------------------------------------------");
       		 
       	 }
       	if (operador == "-"){
       		areaTexto1.setText("           TABUADA  -  SUBTRAÇÃO\n  --------------------------------------------\n"); 
       		
       	 }
       	if (operador == "*"){
       		areaTexto1.setText("   TABUADA  -  MULTIPLICAÇÂO\n  --------------------------------------------\n");  
       		areaTexto1.append(tabuadaA.multiplica(op));  
       	 }
       	if (operador == "/"){
       		areaTexto1.setText("           TABUADA  -  DIVISÃO\n  --------------------------------------------\n"); 
       		
       	}
       	
            
      }   
    });   

//    configura a areaTexto1 com 13 linhas e 15 colunas vis´?veis
      areaTexto1 = new JTextArea(15, 17);
      areaTexto1.setEditable( false );
     
      
      c.add(comboTabuada);  
      c.add(comboOperador);
      c.add(botao); 
      c.add(areaTexto1);
    
      //contentPane.add(painel, BorderLayout.NORTH);   
            
      //this. pack();
      
      this.setVisible(true);   
   }      
}  

