package portifolio;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class PDVFrame extends JFrame {
	private JTextField txtVT;
	private JTextField txtDesc;
	private JTextField txtVP;
	private JTextField txtTroco;
	private JTextField txtTotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PDVFrame frame = new PDVFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	
	public PDVFrame() {
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setForeground(Color.YELLOW);
		setBackground(Color.BLUE);
		getContentPane().setLayout(null);
		
		txtVT = new JTextField();
		txtVT.setBounds(87, 27, 96, 20);
		getContentPane().add(txtVT);
		txtVT.setColumns(10);
		
		JLabel lblValorTotal = new JLabel("Valor Total:");
		lblValorTotal.setForeground(Color.YELLOW);
		lblValorTotal.setBounds(10, 30, 67, 14);
		getContentPane().add(lblValorTotal);
		
		txtDesc = new JTextField();
		txtDesc.setBounds(87, 58, 96, 20);
		getContentPane().add(txtDesc);
		txtDesc.setColumns(10);
		
		JLabel lblDesconto = new JLabel("Desconto %:");
		lblDesconto.setForeground(Color.YELLOW);
		lblDesconto.setBounds(10, 61, 67, 14);
		getContentPane().add(lblDesconto);
		
		JLabel lblTotalComDesconto = new JLabel("Total com Desconto:");
		lblTotalComDesconto.setForeground(Color.YELLOW);
		lblTotalComDesconto.setBounds(10, 151, 130, 14);
		getContentPane().add(lblTotalComDesconto);
		
		txtVP = new JTextField();
		txtVP.setBounds(87, 89, 96, 20);
		getContentPane().add(txtVP);
		txtVP.setColumns(10);
		
		JLabel lblValorPago = new JLabel("Valor Pago:");
		lblValorPago.setForeground(Color.YELLOW);
		lblValorPago.setBounds(10, 95, 67, 14);
		getContentPane().add(lblValorPago);
		
		txtTroco = new JTextField();
		txtTroco.setBounds(144, 176, 96, 20);
		getContentPane().add(txtTroco);
		txtTroco.setColumns(10);
		
		JLabel lblTroco = new JLabel("Troco:");
		lblTroco.setForeground(Color.YELLOW);
		lblTroco.setBounds(10, 179, 63, 14);
		getContentPane().add(lblTroco);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(144, 145, 96, 20);
		getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setBounds(348, 30, 48, 14);
		getContentPane().add(lblStatus);
		
		JButton btnNewButton = new JButton("Calcular Troco");
		btnNewButton.setBounds(232, 57, 146, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();		
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(232, 116, 96, 23);
		getContentPane().add(btnLimpar);
		
		JButton btnNewButton_1 = new JButton("Calcular Desconto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calcularm();
			}
		});
		btnNewButton_1.setBounds(236, 26, 146, 23);
		getContentPane().add(btnNewButton_1);
	}
	

	/* horario() */
	private void horario(AbstractButton lblStatus) {
		Date Data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
			lblStatus.setText(formatador.format(Data));
	}// FIM horario()
	
	/* calcular() */
	private void calcular() {
		double VT,Desc,VP,Total,Troco;
		DecimalFormat numero = new DecimalFormat("0.00");
			VT = Double.parseDouble(txtVT.getText().replace(",", "."));
			Desc = Double.parseDouble(txtDesc.getText().replace(",", "."));
			VP = Double.parseDouble(txtVP.getText().replace(",", "."));
			
			Total = VT - (Desc / 100 * (VT));
		txtTotal.setText("R$ " + Total);
		
			Troco = VP - Total;
		txtTroco.setText("R$" + Troco);
		
	}
	private void calcularm() {
		double VT,Desc,VP,Total,Troco;
		DecimalFormat numero = new DecimalFormat("0.00");
			VT = Double.parseDouble(txtVT.getText().replace(",", "."));
			Desc = Double.parseDouble(txtDesc.getText().replace(",", "."));
			
			Total = VT - (Desc / 100 * (VT));
			txtTotal.setText("R$ " + Total);
		
	}
	
	
	
	/* limpar() */
	private void limpar() {
		txtVT.setText(null);
		txtDesc.setText(null);
		txtVP.setText(null);
		txtTotal.setText(null);
		txtTroco.setText(null);
		
	}// FIM limpar()
}
	



