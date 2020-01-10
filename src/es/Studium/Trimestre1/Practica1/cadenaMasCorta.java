/**
 * 
 */
package es.Studium.Trimestre1.Practica1;
import java.util.Scanner;
/**
 * @author alv
 *
 */
public class cadenaMasCorta {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena[] = new String[10];
		Scanner teclado = new Scanner(System.in); 
		for(int i=0;i<cadena.length;i++)
		{
		System.out.println("Ingrese la cadena "+(i+1));
		cadena[i] = teclado.nextLine(); 
		}
		teclado.close();
		menorCadena(cadena);
	}

	/**
	 * @param cadena
	 */
	private static void menorCadena(String[] cadena) {
		if ((cadena[0].compareTo(cadena[1])==0)&(cadena[0].compareTo(cadena[2])==0)&(cadena[0].compareTo(cadena[3])==0)&(cadena[0].compareTo(cadena[4])==0)&(cadena[0].compareTo(cadena[5])==0)&(cadena[0].compareTo(cadena[6])==0)&(cadena[0].compareTo(cadena[7])==0)&(cadena[0].compareTo(cadena[8])==0)&(cadena[0].compareTo(cadena[9])==0))
		{
			System.out.println("Todas las cadenas son iguales");
		}
		else if ((cadena[1].compareTo(cadena[0])<0)&(cadena[1].compareTo(cadena[2])<0)&(cadena[1].compareTo(cadena[3])<0)&(cadena[1].compareTo(cadena[4])<0)&(cadena[1].compareTo(cadena[5])<0)&(cadena[1].compareTo(cadena[6])<0)&(cadena[1].compareTo(cadena[7])<0)&(cadena[1].compareTo(cadena[8])<0)&(cadena[1].compareTo(cadena[9])<0))
		{
			System.out.println("La cadena: "+cadena[1]+" es la menor");
		}
		else if ((cadena[2].compareTo(cadena[1])<0)&(cadena[2].compareTo(cadena[0])<0)&(cadena[2].compareTo(cadena[3])<0)&(cadena[2].compareTo(cadena[4])<0)&(cadena[2].compareTo(cadena[5])<0)&(cadena[2].compareTo(cadena[6])<0)&(cadena[2].compareTo(cadena[7])<0)&(cadena[2].compareTo(cadena[8])<0)&(cadena[2].compareTo(cadena[9])<0))
		{
			System.out.println("La cadena: "+cadena[2]+" es la menor");
		}
		else if ((cadena[3].compareTo(cadena[1])<0)&(cadena[3].compareTo(cadena[2])<0)&(cadena[3].compareTo(cadena[0])<0)&(cadena[3].compareTo(cadena[4])<0)&(cadena[3].compareTo(cadena[5])<0)&(cadena[3].compareTo(cadena[6])<0)&(cadena[3].compareTo(cadena[7])<0)&(cadena[3].compareTo(cadena[8])<0)&(cadena[3].compareTo(cadena[9])<0))
		{
			System.out.println("La cadena: "+cadena[3]+" es la menor");
		}
		else if ((cadena[4].compareTo(cadena[1])<0)&(cadena[4].compareTo(cadena[2])<0)&(cadena[4].compareTo(cadena[3])<0)&(cadena[4].compareTo(cadena[0])<0)&(cadena[4].compareTo(cadena[5])<0)&(cadena[4].compareTo(cadena[6])<0)&(cadena[4].compareTo(cadena[7])<0)&(cadena[4].compareTo(cadena[8])<0)&(cadena[4].compareTo(cadena[9])<0))
		{
			System.out.println("La cadena: "+cadena[4]+" es la menor");
		}
		else if ((cadena[5].compareTo(cadena[1])<0)&(cadena[5].compareTo(cadena[2])<0)&(cadena[5].compareTo(cadena[3])<0)&(cadena[5].compareTo(cadena[4])<0)&(cadena[5].compareTo(cadena[0])<0)&(cadena[5].compareTo(cadena[6])<0)&(cadena[5].compareTo(cadena[7])<0)&(cadena[5].compareTo(cadena[8])<0)&(cadena[5].compareTo(cadena[9])<0))
		{
			System.out.println("La cadena: "+cadena[5]+" es la menor");
		}
		else if ((cadena[6].compareTo(cadena[1])<0)&(cadena[6].compareTo(cadena[2])<0)&(cadena[6].compareTo(cadena[3])<0)&(cadena[6].compareTo(cadena[4])<0)&(cadena[6].compareTo(cadena[5])<0)&(cadena[6].compareTo(cadena[0])<0)&(cadena[6].compareTo(cadena[7])<0)&(cadena[6].compareTo(cadena[8])<0)&(cadena[6].compareTo(cadena[9])<0))
		{
			System.out.println("La cadena: "+cadena[6]+" es la menor");
		}
		else if ((cadena[7].compareTo(cadena[1])<0)&(cadena[7].compareTo(cadena[2])<0)&(cadena[7].compareTo(cadena[3])<0)&(cadena[7].compareTo(cadena[4])<0)&(cadena[7].compareTo(cadena[5])<0)&(cadena[7].compareTo(cadena[6])<0)&(cadena[7].compareTo(cadena[0])<0)&(cadena[7].compareTo(cadena[8])<0)&(cadena[7].compareTo(cadena[9])<0))
		{
			System.out.println("La cadena: "+cadena[7]+" es la menor");
		}
		else if ((cadena[8].compareTo(cadena[1])<0)&(cadena[8].compareTo(cadena[2])<0)&(cadena[8].compareTo(cadena[3])<0)&(cadena[8].compareTo(cadena[4])<0)&(cadena[8].compareTo(cadena[5])<0)&(cadena[8].compareTo(cadena[6])<0)&(cadena[8].compareTo(cadena[7])<0)&(cadena[8].compareTo(cadena[0])<0)&(cadena[8].compareTo(cadena[9])<0))
		{
			System.out.println("La cadena: "+cadena[8]+" es la menor");
		}
		else if ((cadena[9].compareTo(cadena[1])<0)&(cadena[9].compareTo(cadena[2])<0)&(cadena[9].compareTo(cadena[3])<0)&(cadena[9].compareTo(cadena[4])<0)&(cadena[9].compareTo(cadena[5])<0)&(cadena[9].compareTo(cadena[6])<0)&(cadena[9].compareTo(cadena[7])<0)&(cadena[9].compareTo(cadena[8])<0)&(cadena[9].compareTo(cadena[0])<0))
		{
			System.out.println("La cadena: "+cadena[9]+" es la menor");
		}
		else if ((cadena[0].compareTo(cadena[1])<0)&(cadena[0].compareTo(cadena[2])<0)&(cadena[0].compareTo(cadena[3])<0)&(cadena[0].compareTo(cadena[4])<0)&(cadena[0].compareTo(cadena[5])<0)&(cadena[0].compareTo(cadena[6])<0)&(cadena[0].compareTo(cadena[7])<0)&(cadena[0].compareTo(cadena[8])<0)&(cadena[0].compareTo(cadena[9])<0))
		{
			System.out.println("La cadena: "+cadena[0]+" es la menor");
		}
	}

}
