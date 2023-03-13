package challenge;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class Conversor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	static MenuMonedas menuMoneda=new MenuMonedas();
	static distancia Menudistancia=new distancia();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
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
	public Conversor() {
		setResizable(false);
		setForeground(SystemColor.textHighlight);
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 153));
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox cmb_seleccionConversor = new JComboBox();
		cmb_seleccionConversor.setBounds(144, 111, 160, 22);
		cmb_seleccionConversor.setFont(new Font("Tahoma", Font.BOLD, 13));
		cmb_seleccionConversor.setModel(new DefaultComboBoxModel(new String[] {"monedas", "distancia"}));
		panel.add(cmb_seleccionConversor);
		
		JLabel lblIndicativo1 = new JLabel("Elija una opcion");
		lblIndicativo1.setBounds(33, 115, 85, 14);
		lblIndicativo1.setForeground(new Color(255, 255, 255));
		panel.add(lblIndicativo1);
		
		JButton btnMenuseleccion = new JButton("Seleccionar");
		btnMenuseleccion.setBounds(178, 144, 89, 23);
		panel.add(btnMenuseleccion);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al Conversor!");
		lblNewLabel.setBounds(108, 27, 234, 22);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		btnMenuseleccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmb_seleccionConversor.getSelectedItem()=="monedas") {
					
					menuMoneda.setVisible(true);
					Conversor.this.dispose();
					
				}else {
					
					Menudistancia.setVisible(true);
					Conversor.this.dispose();
					
				}
				}
		});
	}
}
