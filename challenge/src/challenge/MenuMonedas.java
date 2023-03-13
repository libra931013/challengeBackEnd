package challenge;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class MenuMonedas extends JFrame {

	private JPanel contentPane;
	private JTextField txtIngreseCantidadAqui;
	private JTextField textField_SalidaMonto;
	private  Moneda moneda;
	private  Conversion conversion;
	/**
	 * Launch the application.
	 */
	Conversor conversor =new Conversor();
 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMonedas frame = new MenuMonedas();
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
	public MenuMonedas() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\elzet\\Pictures\\imagen\\fondoDolar.jpg"));
		setTitle("Conversor de Monedas");
		setBounds(100, 100, 804, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 788, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRetroceder = new JButton("");
		btnRetroceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				conversor.setVisible(true);
				MenuMonedas.this.dispose();
				 				
				
			}
		});
		btnRetroceder.setToolTipText("retroceder");
		btnRetroceder.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnRetroceder.setBackground(SystemColor.inactiveCaption);
		btnRetroceder.setIcon(new ImageIcon("C:\\Users\\elzet\\Pictures\\imagen\\My project-1.png"));
		btnRetroceder.setBounds(672, 31, 89, 50);
		panel.add(btnRetroceder);
		
		JComboBox cmb_MonedaSalida = new JComboBox();
		cmb_MonedaSalida.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		cmb_MonedaSalida.setModel(new DefaultComboBoxModel(new String[] {"dolares", "soles", "euro", "peso Argentino", "peso Mexicano", "real", "guarani", "bolivar", "peso Chileno", "Libras Esterlinas", "Yen Japonés", "Won sul-coreano"}));
		cmb_MonedaSalida.setBounds(493, 188, 200, 22);
		panel.add(cmb_MonedaSalida);
		
		JComboBox cmb_monedaIngreso = new JComboBox();
		cmb_monedaIngreso.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		cmb_monedaIngreso.setModel(new DefaultComboBoxModel(new String[] {"dolares", "soles", "euro", "peso Argentino", "peso Mexicano", "real", "guarani", "bolivar", "peso Chileno", "Libras Esterlinas", "Yen Japonés", "Won sul-coreano"}));
		cmb_monedaIngreso.setMaximumRowCount(15);
		cmb_monedaIngreso.setBounds(85, 188, 200, 22);
		panel.add(cmb_monedaIngreso);
		
		
		
		txtIngreseCantidadAqui = new JTextField();
		txtIngreseCantidadAqui.setToolTipText("ingrese cantidad");
		txtIngreseCantidadAqui.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtIngreseCantidadAqui.setBounds(85, 92, 197, 51);
		panel.add(txtIngreseCantidadAqui);
		txtIngreseCantidadAqui.setColumns(10);
		
		textField_SalidaMonto = new JTextField();
		textField_SalidaMonto.setEditable(false);
		textField_SalidaMonto.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_SalidaMonto.setBounds(493, 92, 200, 51);
		panel.add(textField_SalidaMonto);
		textField_SalidaMonto.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\elzet\\Pictures\\imagen\\flecha .png"));
		lblNewLabel.setBounds(324, 107, 117, 88);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione moneda inicial");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(85, 221, 165, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccione moneda final");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(493, 221, 165, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CONVERSOR DE MONEDA");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setBounds(261, 31, 260, 27);
		panel.add(lblNewLabel_3);
		
		JButton btnConvertirMoneda = new JButton("Convertir");
		btnConvertirMoneda.setToolTipText("da click aqui para convertir moneda");
		btnConvertirMoneda.addActionListener(new ActionListener() {
		
			

			public void actionPerformed(ActionEvent e) {
				Moneda moneda=new Moneda("","");
				moneda.setValor(txtIngreseCantidadAqui.getText() );
				moneda.setNacionalidad(cmb_monedaIngreso.getSelectedItem().toString());
				textField_SalidaMonto.setText(Conversion.convertir( moneda.getNacionalidad().toString(),Double.parseDouble(moneda.getValor()),cmb_MonedaSalida.getSelectedItem().toString().toString()));
			
				
			}
		});
		btnConvertirMoneda.setForeground(Color.DARK_GRAY);
		btnConvertirMoneda.setBackground(new Color(0, 128, 64));
		btnConvertirMoneda.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConvertirMoneda.setBounds(334, 269, 108, 23);
		panel.add(btnConvertirMoneda);
	}
}
