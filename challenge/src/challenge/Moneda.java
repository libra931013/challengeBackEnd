package challenge;

import javax.swing.JOptionPane;

public class Moneda {
	
	 private String valor;
	 private String nacionalidad;
	 public Moneda(String valor, String nacionalidad) {
		super();
		this.valor = valor;
		this.nacionalidad = nacionalidad;
	}
	public String getValor() {
		if (valor.isEmpty() ) {
			
			 JOptionPane.showMessageDialog(null,
		                "Por favor ingrese un valor",
		                "Alerta",
		                JOptionPane.INFORMATION_MESSAGE);
			valor="0";
		}
		return valor;
	}
	public void setValor(String valor) {
		
		this.valor = valor;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	 
	
	
}
