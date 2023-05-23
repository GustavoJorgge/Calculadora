package aulaeventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CapturaEventoBotao implements ActionListener{
	
	private JButton botao,botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao9;

	public void janela() {
		JFrame frame = new JFrame();
		botao = new JButton();
		botao1 = new JButton();
		
		
		//Registra evento
		botao.addActionListener(this);
		
		frame.getContentPane().add(botao);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,100);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("Botao foi clicado!");
		
		//Altera fonte
		botao.setFont(new Font("SansSerif",Font.BOLD,20));
	}
	
	public static void main(String[]args) {
		CapturaEventoBotao captura = new CapturaEventoBotao();
		captura.janela();
	}

}
