package Lopez_Jaime_JUnit_Calc;

public class Calculadora {
	
	public int suma (int n1, int n2) {
		return n1+n2;		
	}
	
	public boolean contieneCaracter (String cadena) {
		boolean resultado = false; //Para ver si contine los caracteres especiales
		String caracterEspecial[] = {"!", "$", "#", "@", "%"}; 
		//Declaro y creo Array de String con los valores validos
		int i = 0;
		while (i < caracterEspecial.length && resultado == false) 
		{
			resultado = cadena.contains(caracterEspecial[i]);
					i++;
		}
		return resultado;
	}
	
}
