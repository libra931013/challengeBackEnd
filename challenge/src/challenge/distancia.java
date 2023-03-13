package challenge;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class distancia extends JFrame {

	private JPanel contentPane;
	private JTextField textField_ingreso;
	private JTextField textField_salida;

	/**
	 * Launch the application.
	 */
	
	static Conversor conversor=new Conversor();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distancia frame = new distancia();
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
	public distancia() {
		setResizable(false);
		
		setTitle("Distancias");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 788, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 788, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONVERSOR DE DISTANCIAS");
		lblNewLabel.setForeground(new Color(70, 130, 180));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(234, 29, 310, 36);
		panel.add(lblNewLabel);
		
		textField_ingreso = new JTextField();
		textField_ingreso.setFont(new Font("Arial Black", Font.PLAIN, 18));
		textField_ingreso.setBounds(91, 104, 237, 52);
		panel.add(textField_ingreso);
		textField_ingreso.setColumns(10);
		
		textField_salida = new JTextField();
		textField_salida.setEditable(false);
		textField_salida.setFont(new Font("Arial Black", Font.PLAIN, 18));
		textField_salida.setBounds(91, 200, 237, 52);
		panel.add(textField_salida);
		textField_salida.setColumns(10);
		
		JComboBox cmb_ingreso = new JComboBox();
		cmb_ingreso.setFont(new Font("Tahoma", Font.BOLD, 13));
		cmb_ingreso.setModel(new DefaultComboBoxModel(new String[] {"año luz", "kilometro", "metro", "centimetro", "milimetro", "nanometro", "milla", "yarda", "pie", "pulgada", "milla nautica"}));
		cmb_ingreso.setBounds(486, 121, 141, 22);
		panel.add(cmb_ingreso);
		
		JComboBox cmb_salida = new JComboBox();
		cmb_salida.setFont(new Font("Tahoma", Font.BOLD, 13));
		cmb_salida.setModel(new DefaultComboBoxModel(new String[] {"año luz", "kilometro", "metro", "centimetro", "milimetro", "nanometro", "milla", "yarda", "pie", "pulgada", "milla nautica"}));
		cmb_salida.setBounds(486, 217, 141, 22);
		panel.add(cmb_salida);
		
		JButton btnConvertir = new JButton("OK");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medida medida=new Medida(cmb_ingreso.getSelectedItem().toString(),textField_ingreso.getText());
				textField_salida.setText(ConversionDistancia.convertir(medida.getUnidad(),cmb_salida.getSelectedItem().toString() , Double.parseDouble(medida.getValor()) ));
			}	
		});
		btnConvertir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConvertir.setBackground(new Color(169, 169, 169));
		btnConvertir.setBounds(274, 290, 89, 23);
		panel.add(btnConvertir);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				distancia.this.dispose();
				conversor.setVisible(true);
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\elzet\\Pictures\\imagen\\My project-1.png"));
		btnBack.setBounds(657, 18, 89, 46);
		panel.add(btnBack);
		
		JLabel lblMedidaInicial = new JLabel("ingrese medida");
		lblMedidaInicial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMedidaInicial.setHorizontalAlignment(SwingConstants.LEFT);
		lblMedidaInicial.setBounds(91, 81, 117, 22);
		panel.add(lblMedidaInicial);
		
		JLabel lblSalidaMedida = new JLabel("resultado");
		lblSalidaMedida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSalidaMedida.setBounds(91, 177, 100, 14);
		panel.add(lblSalidaMedida);
		
	}
}
