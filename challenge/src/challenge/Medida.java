package challenge;

import javax.swing.JOptionPane;

public class Medida {
	private String unidad;
	private String valor;
	public Medida(String unidad, String valor) {
		super();
		this.unidad = unidad;
		this.valor = valor;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getValor() {
		if (valor.isEmpty() ) {
			
			 JOptionPane.showMessageDialog(null,
		                "Por favor ingrese un valor",
		                "Alerta",
		                JOptionPane.INFORMATION_MESSAGE);
			valor="";
		}
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
