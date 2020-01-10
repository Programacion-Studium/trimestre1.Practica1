package es.Studium.Trimestre1.Practica1;
import java.util.Scanner;
/**
 * @author alv
 *
 */
public class leer10Numeros {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		Scanner teclado = new Scanner(System.in); 
		introducirNumeros(numeros, teclado);
		media(numeros);
		imprimirInverso(numeros);
		teclado.close(); 
	}
	private static void introducirNumeros(int[] numeros, Scanner teclado) {
		int i;
		// Recorrido para rellenar la tabla 
		for(i=0;i<numeros.length;i++)
		{
		System.out.println("Ingrese el numero "+(i+1));
		numeros[i] = teclado.nextInt(); 
		}
	}
	private static void imprimirInverso(int[] numeros) {
		int i;
		// Recorrido para mostrar los valores de la tabla 
		for(i=numeros.length-1;i>=0;i--)
		{
		System.out.println("numero "+(i+1)+" es "+numeros[i]); 
		}
	}
	private static void media(int[] numeros) {
		int i;
		double media;
		int suma=0;
		for(i=0;i<numeros.length;i++)
		{
			suma=suma+numeros[i];
		}
		media=suma/numeros.length;
		System.out.println(media);
	}
}
