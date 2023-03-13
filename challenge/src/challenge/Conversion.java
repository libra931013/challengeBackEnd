package challenge;

public class Conversion {	
	static String resultado; 
	 static double valor;
	 static double valor2;
		public static String convertir(String monedaIngreso,double Monto,String monedaSalida) {
			 double[] valorDolares = {1.00,3.8,0.94,199.35,5.15,7172.51,2426154.38,797.82068,803.72,0.85,137.79,1320.72};
			 String[] nacionalidades = {"dolares", "soles", "euro", "peso Argentino", "peso Mexicano", "real", "guarani", "bolivar", "peso Chileno", "Libras Esterlinas", "Yen Japonés", "Won sul-coreano"};
			
			 for (int i=0; i<=11;i++) {
				  if(monedaIngreso==nacionalidades[i]) {
					  valor=Monto/valorDolares[i];
				 
				 
			 }
			
				 
			 }
			 for (int i=0; i<=11;i++) {
				  if(monedaSalida==nacionalidades[i]) {
					 valor2=valorDolares[i];
				 
				
				 
			 }
			
				 
			 }
			 resultado=(valor*valor2)+"";
			return resultado;
			
		 }
		
}
