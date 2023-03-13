package challenge;

public class ConversionDistancia {
		static double nuevoValor;
		static double nuevoValor2;
		static String Resultado;
	public static String convertir(String unidad1, String unidad2,double cantidad) {
		
			double[] valorUnidad= {1.056970721911E-13,1,1000,100000,1000000,1000000000*1000,0.6213711922,1093.6132983,3280.839895,39370.07874,0.5399568035};
			String[] Unidad= {"año luz","kilometro","metro","centimetro","milimetro","nanometro","milla","yarda","pie","pulgada","milla nautica"};
			
			for(int i=0;i<=10;i++) {
				if(Unidad[i]==unidad1) {
					nuevoValor=valorUnidad[i]*cantidad;
					
				}
				System.out.println(nuevoValor);
				if(Unidad[i]==unidad2) {
					nuevoValor2=valorUnidad[i]*cantidad;
					
				}
				System.out.println(nuevoValor2);
			}
			Resultado=(nuevoValor2/nuevoValor)+"";
		
		return Resultado;
		
	}
}
