package projetoCalculadora;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.MenuBar;
//import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ProjetoCalculadora extends JFrame{

	private JButton botao00;
	private JButton botao01;
	private JButton botao02;
	private JButton botao03;
	private JButton botao04;
	private JButton botao05;
	private JButton botao06;
	private JButton botao07;
	private JButton botao08;
	private JButton botao09;
	private JButton botaoOn;
	private JButton botaoPonto;
	private JButton botaoIgual;
	private JButton botaoSomar;
	private JButton botaoDividir;
	private JButton botaoMultiplicar;
	private JButton botaoSubtrair;
	private JTextField visualizador;
	int variavel01;
	int variavel02;
        int operador;
//	Inicializar a classe OperacaoAritimetica
    OperacaoAritmetica OperacaoAritmetica = new OperacaoAritmetica();
    
    
	public ProjetoCalculadora(){
	
	this.setTitle("Projeto Calculadora");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setBounds(400,250,200,220);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    
//Criando o MENU    
//  Barra de Menu
	MenuBar barraMenu = new MenuBar();
	//Menus Suspensos
	Menu menuArquivo = new Menu("Arquivo");
	Menu menuAjuda = new Menu("Ajuda");
	//Itens do Menu
	MenuItem miNumRomano = new MenuItem("Nº Romano");
	MenuItem miTabuada = new MenuItem("Tabuada");
	MenuItem miSair = new MenuItem("Sair");
	MenuItem miSobre = new MenuItem("Sobre");
	//Adicionar itens ao menu Arquivo
	menuArquivo.add(miNumRomano);
	menuArquivo.add(miTabuada);
	menuArquivo.add(miSair);
	menuAjuda.add(miSobre);
	//adicionar menus suspensos a barra
	barraMenu.add(menuArquivo);
	barraMenu.add(menuAjuda);
	//adicionar barra de menu ao frame
	setMenuBar(barraMenu);
	
//Adicionado evento a itens de menu (SAIR)
	miSair.addActionListener(
		new ActionListener(){
	      
	     public void actionPerformed (ActionEvent Evento){
	         System.exit(0); 
	      }
	     });
	
//Adicionar evento a itens de menu (Programa Numero Romano)
	miNumRomano.addActionListener(
			new ActionListener(){
			
	          public void actionPerformed (ActionEvent Evento){
	        	  
	        	  ProjetoCalculadora.this.setVisible(false);
	        	  
	        	  NumeroRomano numeroRomano = new NumeroRomano();
			}
			});
//Adicionar evento a itens de menu (Modulo - Tabuada)
	miTabuada.addActionListener(
	       new ActionListener(){
	    	   public void actionPerformed(ActionEvent Evento){
	    		   Tabuada tabuadaOK = new Tabuada();  
	    		    
	    	   }
	       }
	);
	
	
	
	
	
	
	
	
//Adicionar evento a itens de menu (Sobre :));
	miSobre.addActionListener(
	   new ActionListener(){
		   public void actionPerformed(ActionEvent Evento){
			   
			   JOptionPane.showMessageDialog(null,
					   "UCB - Universidade Católica de Brasilia\n" +
					   "Curso: Sistemas de Informação\n" +
					   "Disciplina: LTP3\n\n" +
					   "Projecto: Calculadora Educacional\n" +
					   "Aluno: Wagner Andrade\n\n\n" +
					   "Brasília, XX/XX/XXXX - By LORD_DF®");
		   }
		   
		   
	   }
	);
    
    
//Adicionado o visualizador digital
    visualizador = new JTextField (10);
    visualizador.addKeyListener(new KeyListener(){
    	public void keyPressed(KeyEvent e){}
    		public void keyReleased(KeyEvent e){
    			try{
    				int i = Integer.parseInt(visualizador.getText());
    			}catch (Exception ex){
    				visualizador.setText("");
    			}
    		}
    		public void keyTyped(KeyEvent e){}
        }
      );
	
    
//Adicionar botao de limpar registros e tela
    botaoOn = new JButton("ON");
    botaoOn.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
       
      visualizador.setText(String.valueOf(""));
      variavel01 = 0;
      variavel02 = 0;
      }
     });
    
//  Adicionar botao de numero 0
    botao00 = new JButton("0");
    botao00.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
    	 visualizador.setText(visualizador.getText() + 0);  
        
      }
     });
           
    
//  Adicionar botao de numero 1
    botao01 = new JButton("1");
    botao01.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
          
    	 visualizador.setText(visualizador.getText() + 1);  
      }
     });
    
    
//  Adicionar botao de numero 2
    botao02 = new JButton("2");
    botao02.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
       
    	 visualizador.setText(visualizador.getText() + 2);  
      }
     });
    
    
//  Adicionar botao de numero 3
    botao03 = new JButton("3");
    botao03.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
    	 visualizador.setText(visualizador.getText() + 3);  
        
      }
     });
       
//  Adicionar botao de numero 4
    botao04 = new JButton("4");
    botao04.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
          
    	 visualizador.setText(visualizador.getText() + 4);  
      }
     });
    
    
//  Adicionar botao de numero 5
    botao05 = new JButton("5");
    botao05.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
       
    	 visualizador.setText(visualizador.getText() + 5);  
      }
     });
    
    
//  Adicionar botao de numero 6
    botao06 = new JButton("6");
    botao06.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
    	 visualizador.setText(visualizador.getText() + 6);  
        
      }
     });       
    
    
//Adicionar botao de numero 7
    botao07 = new JButton("7");
    botao07.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
          
    	 visualizador.setText(visualizador.getText() + 7);  
      }
     });
    
    
//  Adicionar botao de numero 8
    botao08 = new JButton("8");
    botao08.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
       
    	 visualizador.setText(visualizador.getText() + 8);  
      }
     });
    
    
//  Adicionar botao de numero 9
    botao09 = new JButton("9");
    botao09.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
    	 visualizador.setText(visualizador.getText() + 9);  
        
      }
     });
    
        
//  Adicionar botao para efetuar dividir
    botaoDividir = new JButton("/");
    botaoDividir.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
      variavel01 = Integer.parseInt(visualizador.getText());
      operador = 1;
      visualizador.setText(String.valueOf(""));
      System.out.println(variavel01);
      }
     });
    
    
//  Adicionar botao para multiplicar
    botaoMultiplicar = new JButton("*");
    botaoMultiplicar.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
    	 variavel01 = Integer.parseInt(visualizador.getText());
         operador = 2;
         visualizador.setText(String.valueOf(""));
         System.out.println(variavel01);
      
      }
     });
    
    
//  Adicionar botao para subtrair
    botaoSubtrair = new JButton("-");
    botaoSubtrair.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
    	 variavel01 = Integer.parseInt(visualizador.getText());
         operador = 3;
         visualizador.setText(String.valueOf(""));
         System.out.println(variavel01);
      
      }
     });
    
//  Adicionar botao para somar
    botaoSomar = new JButton("+");
    botaoSomar.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
    	 variavel01 = Integer.parseInt(visualizador.getText());
         operador = 4;
         visualizador.setText(String.valueOf(""));
         System.out.println(variavel01);
      
      }
     });

    
//  Adicionar botao de virgula
    botaoPonto = new JButton(".");
    botaoPonto.addActionListener(
    new ActionListener(){
      
     public void actionPerformed (ActionEvent Evento){
    	 visualizador.setText(visualizador.getText() + ",");  
        
      }
     });
    
 
//  Adicionar botao de igual(resultado)
    botaoIgual = new JButton("=");
    botaoIgual.addActionListener(
    new ActionListener(){
     public void actionPerformed (ActionEvent Evento){
    	 variavel02 = Integer.parseInt(visualizador.getText());
    	 
    	 switch(operador){
    	
    	 case  1 : visualizador.setText(Double.toString(OperacaoAritmetica.dividir(variavel01,variavel02)));
                   break;
    	 
       	 case  2 : visualizador.setText(Integer.toString(OperacaoAritmetica.multiplicar(variavel01,variavel02)));
                   break;          
         
       	 case  3 : visualizador.setText(Integer.toString(OperacaoAritmetica.subtrair(variavel01,variavel02)));
                  break;  
                   
    	 case  4 : visualizador.setText(Integer.toString(OperacaoAritmetica.soma(variavel01,variavel02)));
                   break;
    	 
    	 default: JOptionPane.showInputDialog("ERRO");
    		       break;
    	 
    	 }	 
      }
     });
    
    
    c.add(visualizador);
    c.add(botaoOn);
    c.add(botao07);
    c.add(botao08);
    c.add(botao09);
    c.add(botaoDividir);
    c.add(botao04);
    c.add(botao05);
    c.add(botao06); 
    c.add(botaoMultiplicar);
    c.add(botao01);
    c.add(botao02);
    c.add(botao03); 
    c.add(botaoSubtrair);
    c.add(botao00);   
    c.add(botaoPonto);    
    c.add(botaoIgual);        
    c.add(botaoSomar);    
          
//Tonar o Frame visivel ao usuário
    this.setVisible(true);
	}
	
//Iniciliação do programa (main)
	public static void main(String []args){
		ProjetoCalculadora calculadoraEducacional = new ProjetoCalculadora();
		 
		
		
	}
}
