package projetoCalculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tabuada extends JFrame {
	private JComboBox<String> comboTabuada;
	private JComboBox<String> comboOperador;
	private JButton botao;
	private JButton botaoVoltar;
	private JTextArea areaTexto1;
	int i;

	AritimeticaTabuada tabuadaA = new AritimeticaTabuada();

	public Tabuada() {
		this.setTitle("MODULO - TABUADA");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				int x = JOptionPane.showConfirmDialog(null, "Deseja sair do programa?", "Close",
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (x == JOptionPane.YES_NO_OPTION) {
					e.getWindow().dispose();

				}
			}
		});
		   
		   
		this.setResizable(false);
		this.setBounds(450, 250, 270, 310);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
// Inicializando e adicionando numeros no combo tabuada
		comboTabuada = new JComboBox<String>();

		comboTabuada.addItem("1");
		comboTabuada.addItem("2");
		comboTabuada.addItem("3");
		comboTabuada.addItem("4");
		comboTabuada.addItem("5");
		comboTabuada.addItem("6");
		comboTabuada.addItem("7");
		comboTabuada.addItem("8");
		comboTabuada.addItem("9");
		comboTabuada.addItem("10");

// Inicializando e adicionando operadores no combo Operador		
		comboOperador = new JComboBox<String>();

		comboOperador.addItem("+");
		comboOperador.addItem("-");
		comboOperador.addItem("/");
		comboOperador.addItem("*");

		AritimeticaTabuada tabuada = new AritimeticaTabuada();

// Criando botão Clique para execura os calculos da tabuada
		botao = new JButton("Clique");
		botao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String operador = String.valueOf(comboOperador.getSelectedItem());
				int op = Integer.parseInt((String) comboTabuada.getSelectedItem());

				if (operador == "+") {
					areaTexto1
							.setText("           TABUADA  -  ADIÇÂO\n  --------------------------------------------\n");
					areaTexto1.append(tabuada.soma(op));
				}
				if (operador == "-") {
					areaTexto1.setText(
							"        TABUADA  -  SUBITRAÇÃO\n  --------------------------------------------\n");
					areaTexto1.append(tabuada.subtracao(op));
				}
				if (operador == "/") {
					areaTexto1.setText(
							"           TABUADA  -  DIVISÃO\n  --------------------------------------------\n");
					areaTexto1.append(tabuada.divisao(op));
				}
				if (operador == "*") {
					areaTexto1
							.setText("   TABUADA  -  MULTIPLICAÇÃO\n  --------------------------------------------\n");
					areaTexto1.append(tabuada.multiplicacao(op));
				}

			}
		});


// Criando botão Voltar, para retornar ao modulo Calculadora.		
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener(){
			   
			  @Override
				public void actionPerformed(ActionEvent Evento) {
				    ProjetoCalculadora pc = new ProjetoCalculadora();
				    Tabuada.this.dispose(); //Fecha somente o formulario Tabuada sem fechar o formulário principal. 	
		   }
		  });
		
		
// configura a areaTexto1 com 14 linhas e 18 colunas visíveis
		areaTexto1 = new JTextArea(14, 18);
		areaTexto1.setEditable(false);

		c.add(comboTabuada);
		c.add(comboOperador);
		c.add(botao);
		c.add(botaoVoltar);
		c.add(areaTexto1);

		this.setVisible(true);
		
	}

}
