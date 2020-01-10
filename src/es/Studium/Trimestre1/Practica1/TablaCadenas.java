package es.Studium.Trimestre1.Practica1;

import java.util.Scanner;
/**
 * @author alv
 *
 */
public class TablaCadenas {

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
		for(int i=0;i<cadena.length;i++)
		{
		System.out.println(cadena[i]);
		}
	}

}
