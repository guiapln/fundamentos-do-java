package portifolio;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoMedia extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JLabel media;
	private JTextField txtMedia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoMedia frame = new CalculoMedia();
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
	public CalculoMedia() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(CalculoMedia.class.getResource("/icones/iconfinder_73-Calculator_2123899.png")));
		setTitle("Calculadora da m\u00E9dia");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNota = new JLabel("Nota 1");
		lblNota.setBounds(24, 43, 48, 14);
		contentPane.add(lblNota);

		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(24, 81, 48, 14);
		contentPane.add(lblNota_1);

		txtNota1 = new JTextField();
		txtNota1.setBounds(68, 40, 96, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);

		txtNota2 = new JTextField();
		txtNota2.setBounds(68, 78, 96, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);

		JButton btnCalcular = new JButton("New button");
		btnCalcular.addActionListener(new ActionListener() {
			// Evento clicar no botão
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular
				.setIcon(new ImageIcon(CalculoMedia.class.getResource("/icones/iconfinder_calculatorsvg_1579791.png")));
		btnCalcular.setToolTipText("Calcular");
		btnCalcular.setBounds(36, 134, 128, 128);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("New button");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(CalculoMedia.class.getResource("/icones/iconfinder_package-purge_24217.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(203, 134, 128, 128);
		contentPane.add(btnLimpar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(255, 53, 48, 14);
		contentPane.add(lblNewLabel);
		
		txtMedia = new JTextField();
		txtMedia.setBounds(245, 78, 77, 20);
		contentPane.add(txtMedia);
		txtMedia.setColumns(10);

		
	}

	// Método para calcular a média
	private void calcular() {
		DecimalFormat formatador = new DecimalFormat("0.0");
		double nota1, nota2, media;
		// a linha abaixo captura o conteúdo da caixa de texto,converte para o tipo  Double e armazena na variável
		//.replace toca um caractere por outro
		nota1 = Double.parseDouble(txtNota1.getText().replace("," , "."));
		nota2 = Double.parseDouble(txtNota2.getText().replace("," , "."));
		media = (nota1 + nota2) / 2;
		txtMedia.setText(formatador.format(media));
		//ShowMessageDialog (caixa de mensagem)
		//null (tamanho padrão)
		//"Texto"
		//"Título"
		//"Icone"
		if (media <5) {
			JOptionPane.showMessageDialog(null, "REPROVADO","Status",JOptionPane.ERROR_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null, "APROVADO","Status",JOptionPane.INFORMATION_MESSAGE);
		
		}
	}
	//Método para limpar os campos 
	private void limpar () {
		txtNota1.setText(null);
		txtNota2.setText(null);
		txtMedia.setText(null);
	
	}
	




}




