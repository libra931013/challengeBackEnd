package challenge;

public class ConversionDistancia {
		static	double resultado;
		static	double nuevoValor;
		static	double nuevoValor2;
		 
	public static Double convertir(String unidad1, String unidad2,double cantidad) {
			
			double[] valorUnidad= {1.056970721911E-13,1,1000,100000,1000000,1e+12,0.6213711922,1093.6132983,3280.839895,39370.07874,0.5399568035};
			String[] Unidad= {"año luz","kilometro","metro","centimetro","milimetro","nanometro","milla","yarda","pie","pulgada","milla nautica"};
			
			for(int i=0;i<=10;i++) {
				if(unidad1==Unidad[i]) {
					nuevoValor=cantidad/valorUnidad[i];
					
				}
			
				if(unidad2==Unidad[i]) {
					nuevoValor2=valorUnidad[i];
					
				}
				
			}
			
			resultado=nuevoValor2 *nuevoValor;
			System.out.println(resultado);
		return resultado;
		
	}
}
