package portifolio;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;

public class Pdv extends JFrame {

	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pdv frame = new Pdv();
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
	public Pdv() {
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
			
				alterarLabel();
				
				//Evento ativar o formulário
			//alterar a label pela data atual	
			}
		});
		setResizable(false);
		setTitle("PDV");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 217, 444, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		lblData = new JLabel("0");
		lblData.setForeground(SystemColor.textHighlightText);
		lblData.setBounds(113, 29, 290, 14);
		panel.add(lblData);
	}// fim construtor
	
		//Método para alterar a label pela data atual
		private void alterarLabel() {
		
			Date data = new Date();
			DateFormat formatador = 
			DateFormat.getDateInstance(DateFormat.FULL);
			lblData.setText(formatador.format(data));
			
			
	
	}// fim horario
}// fim principal
