	package aulaeventos;
	
	import java.awt.FlowLayout;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JTextField;
	
	public class Calculadora implements ActionListener {
		Double numero1 = 0.0,numero2 = 0.0;
		Double resultado = 0.0;
		int qtdponto = 0;
		private String operador;
		private JButton igual;
		private JButton botao1;
		private JButton botao2;
		private JButton botao3;
		private JButton botao4;
		private JButton botao5;
		private JButton botao6;
		private JButton botao7;
		private JButton botao8;
		private JButton botao9;
		private JButton botaoponto;
		private JButton botao_mais;
		private JButton botao_menos;
		private JButton botao_multiplica;
		private JButton botao_divide;
		private JTextField tela;
		
		public void janela() {
			
			JFrame frame = new JFrame();
			igual = new JButton("=");
			botao1 = new JButton("1");
			botao2 = new JButton("2");
			botao3 = new JButton("3");
			botao4 = new JButton("4");
			botao5 = new JButton("5");
			botao6 = new JButton("6");
			botao7 = new JButton("7");
			botao8 = new JButton("8");
			botao9= new JButton("9");
			botaoponto= new JButton(".");
			botao_mais= new JButton("+");
			botao_menos= new JButton("-");
			botao_multiplica= new JButton("*");
			botao_divide= new JButton("/");
			
			igual.addActionListener(this);
			botao1.addActionListener(this);
			botao2.addActionListener(this);
			botao3.addActionListener(this);
			botao4.addActionListener(this);
			botao5.addActionListener(this);
			botao6.addActionListener(this);
			botao7.addActionListener(this);
			botao8.addActionListener(this);
			botao9.addActionListener(this);
			botaoponto.addActionListener(this);
			botao_mais.addActionListener(this);
			botao_menos.addActionListener(this);
			botao_multiplica.addActionListener(this);
			botao_divide.addActionListener(this);
			
			
			tela = new JTextField();
			tela.setEditable(false);
			tela.setHorizontalAlignment(JTextField.RIGHT);
			tela.setBounds(10, 10, 200, 30);
			igual.setBounds(25, 150, 50, 50);
			botao1.setBounds(75, 50, 50, 50);
			botao_menos.setBounds(25, 50, 50, 50); // Ajustado para evitar a sobreposição
			botao2.setBounds(125, 50, 50, 50);
			botao3.setBounds(175, 50, 50, 50);
			botao4.setBounds(75, 100, 50, 50);
			botao_mais.setBounds(25, 100, 50, 50);
			botao5.setBounds(125, 100, 50, 50);
			botao6.setBounds(175, 100, 50, 50);
			botao7.setBounds(75, 150, 50, 50);  // Adicionado para evitar a sobreposição
			botao8.setBounds(125, 150, 50, 50);
			botao9.setBounds(175, 150, 50, 50); // Ajustado para evitar a sobreposição
			botaoponto.setBounds(25, 200, 50, 50); // Ajustado para evitar a sobreposição
			botao_multiplica.setBounds(75, 200, 50, 50); // Ajustado para evitar a sobreposição
			botao_divide.setBounds(125, 200, 50, 50); // Ajustado para evitar a sobreposição
	
			frame.setLayout(null); // Define o layout como null para usar o setBounds()
			frame.getContentPane().add(igual);
			frame.getContentPane().add(botao1);
			frame.getContentPane().add(botao2);
			frame.getContentPane().add(botao3);
			frame.getContentPane().add(botao4);
			frame.getContentPane().add(botao5);
			frame.getContentPane().add(botao6);
			frame.getContentPane().add(botao7);
			frame.getContentPane().add(botao8);
			frame.getContentPane().add(botao9);
			frame.getContentPane().add(tela);
			frame.getContentPane().add(botao_mais);
			frame.getContentPane().add(botao_menos);
			frame.getContentPane().add(botaoponto);
			frame.getContentPane().add(botao_multiplica);
			frame.getContentPane().add(botao_divide);
			frame.add(tela);
	
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(240, 285);
			frame.setVisible(true);
		
			//Ações dos botoes e incrementando na tela
			botao1.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        tela.setText(tela.getText() + "1");
			        //numeros.add(1);
			    }
			});
			
			botao2.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        tela.setText(tela.getText() + "2");
			     //   numeros.add(2);
			    }
			});
			
			botao3.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        tela.setText(tela.getText() + "3");
			  //      numeros.add(3);
			    }
			});
			
			botao4.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        tela.setText(tela.getText() + "4");
			    //    numeros.add(4);
			    }
			});
			
			botao5.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        tela.setText(tela.getText() + "5");
			      //  numeros.add(5);
			    }
			});
			
			botao6.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        tela.setText(tela.getText() + "6");
			        //numeros.add(6);
			    }
			});
			
			botao7.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        tela.setText(tela.getText() + "7");
			        //numeros.add(7);
			    }
			});
			
			botao8.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        tela.setText(tela.getText() + "8");
			    //    numeros.add(8);
			    }
			});
			
			botao9.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        tela.setText(tela.getText() + "9");
			      //  numeros.add(9);
			    }
			});
			
			botaoponto.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    	if(qtdponto == 0) {
			        tela.setText(tela.getText() + ".");
			        qtdponto++;
			    	}
			      //  numeros.add(9);
			    }
			});
			
			botao_mais.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        operador = "+"; // Define o operador como soma
			        numero1 = Double.parseDouble(tela.getText()); // Armazena o primeiro número digitado
			        tela.setText(""); // Limpa a tela para inserir o próximo número
			        qtdponto = 0;
			    }
			});
			
			botao_menos.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        operador = "-"; // Define o operador como soma
			        numero1 = Double.parseDouble(tela.getText()); // Armazena o primeiro número digitado
			        tela.setText(""); // Limpa a tela para inserir o próximo número
			        qtdponto = 0;
			    }
			});
			
			botao_multiplica.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        operador = "*"; // Define o operador como soma
			        numero1 = Double.parseDouble(tela.getText()); // Armazena o primeiro número digitado
			        tela.setText(""); // Limpa a tela para inserir o próximo número
			        qtdponto = 0;
			    }
			});
			
			botao_divide.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        operador = "/"; // Define o operador como soma
			        numero1 = Double.parseDouble(tela.getText()); // Armazena o primeiro número digitado
			        tela.setText(""); // Limpa a tela para inserir o próximo número
			        qtdponto = 0;
			    }
			});
			
			igual.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        Double numero2 = Double.parseDouble(tela.getText()); // Armazena o segundo número digitado

			        if (operador.equals("+")) {
			            resultado = numero1 + numero2;
			        }
			        if (operador.equals("-")) {
			            resultado = numero1 - numero2;
			        } // Adicione outras condições para suportar mais operações
			        if (operador.equals("*")) {
			        	resultado = numero1 * numero2;
			        }
			        if(operador.equals("/")) {
			        	resultado = numero1 / numero2;
			        }
			        
			        tela.setText(String.valueOf(resultado)); // Exibe o resultado na tela
			    }
			});
		}
		public static void main(String[]args)throws Exception{
			Calculadora captura = new Calculadora();
			captura.janela();
		}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	}

