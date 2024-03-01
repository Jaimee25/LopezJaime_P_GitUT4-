package LopezJaime_PDebugUT3;

import java.util.Scanner;

public class Depuración_de_programa {

	public static void main(String[] args) {
		sumaYMedia();
	}
	public static void sumaYMedia() {
		Scanner sc = new Scanner(System.in);
		char jugar = 'S';
		double suma = 0;
		int numeros = 0;
		double media = 0;
		while (jugar == 'S') {
			System.out.println("¿Quiere jugar (S/N)? ");
			jugar = sc.next().charAt(0);
			if (jugar == 'S') {
				System.out.println("¿Cuántos números quiere sumar? ");
				numeros = sc.nextInt();
				for (int i = 0; i < numeros; i++) {
					System.out.println("¿Dame un número? ");
					suma = suma + sc.nextDouble();
				}
				media = suma / numeros;
				System.out.println("La suma es: " + suma + " Y la media es : "+ media);
				suma = 0; 
			}	
	}
		sc.close();
}
}
