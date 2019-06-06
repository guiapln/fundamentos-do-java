package br.com.jogar;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class PedraPapelTesoura extends JFrame {

	private JPanel contentPane;
	private JLabel lblComputador;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedraPapelTesoura frame = new PedraPapelTesoura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PedraPapelTesoura() {
		setResizable(false);
		setTitle("JOGO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 392);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPedra = new JButton("");
		btnPedra.setToolTipText("PEDRA");
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 1;
				jogar();
			}
		});
		btnPedra.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/br/com/icons/pedra.png")));
		btnPedra.setBounds(23, 67, 70, 70);
		contentPane.add(btnPedra);
		
		JButton btnPapel = new JButton("");
		btnPapel.setToolTipText("PAPEL");
		btnPapel.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/br/com/icons/papel.png")));
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 2;
				jogar();
			}
		});
		btnPapel.setBounds(122, 67, 70, 70);
		contentPane.add(btnPapel);
		
		JButton btnTesoura = new JButton("");
		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 3;
				jogar();
			}
		});
		btnTesoura.setToolTipText("TESOURA");
		btnTesoura.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/br/com/icons/tesoura.png")));
		btnTesoura.setBounds(217, 67, 70, 70);
		contentPane.add(btnTesoura);
		
		JLabel lblNewLabel = new JLabel("Jogada");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(120, 21, 128, 35);
		contentPane.add(lblNewLabel);
		
		lblComputador = new JLabel("");
		lblComputador.setBounds(122, 202, 70, 70);
		contentPane.add(lblComputador);
		
		JLabel lblComp = new JLabel("Computador");
		lblComp.setFont(new Font("Arial", Font.BOLD, 14));
		lblComp.setBounds(38, 167, 93, 35);
		contentPane.add(lblComp);
		
		lblResultado = new JLabel("");
		lblResultado.setBackground(SystemColor.textHighlightText);
		lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(120, 312, 112, 29);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel_1 = new JLabel("PLACAR:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(23, 297, 79, 55);
		contentPane.add(lblNewLabel_1);
	}
	
	int jogador, computador; 
	
	
	private void jogar(){
		//btnTesoura.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/br/com/icons/tesoura.png")));
	
		Random gerador = new Random();
		computador = gerador.nextInt(3) + 1;
		
		switch(computador){
		case 1:
			lblComputador.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/br/com/icons/pedra.png")));
			break;
		case 2:
			lblComputador.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/br/com/icons/papel.png")));
			break;
		case 3:
			lblComputador.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/br/com/icons/tesoura.png")));
			break;
		}
		
		if (jogador == computador) {
			lblResultado.setText("EMPATE");
		} else {
			if ((jogador == 3 && computador == 2) || (jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)) {

				lblResultado.setText("JOGADOR");
			} else {
				lblResultado.setText("COMPUTADOR");
			}
	}
}
}