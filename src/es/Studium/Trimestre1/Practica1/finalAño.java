package es.Studium.Trimestre1.Practica1;

import java.util.Scanner;
/**
 * @author alv
 *
 */
public class finalAño {

	public static void main(String[] args) {
		String fecha;
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Introduzca la fecha con el siguiente formato dd/mm/aaaa");
		fecha = teclado.next();
		teclado.close();
		String[] fecha2 = fecha.split("/");
		int dia=Integer.parseInt (fecha2[0]);
		int mes=Integer.parseInt (fecha2[1]);
		int anyo=Integer.parseInt (fecha2[2]);
		if((mes>0)&(mes<13))
		{
			if((anyo%4==0) & (anyo%100==0) || (anyo%400==0))
			{
				casosBisiesto(dia, mes);
				
			}
			else
			{
				casosNoBisiesto(dia, mes);
			}
		}
	}

	/**
	 * @param dia
	 * @param mes
	 */
	private static void casosNoBisiesto(int dia, int mes) {
		int contador;
		switch (mes)
		{
		case 1:
			contador=365-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 2:
			contador=334-dia;//28
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 3:
			contador=306-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 4:
			contador=275-dia;//30
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 5:
			contador=245-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 6:
			contador=214-dia;//30
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 7:
			contador=184-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 8:
			contador=153-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 9:
			contador=122-dia;//30
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 10:
			contador=92-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 11:
			contador=61-dia;//30
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 12:
			contador=31-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		}
	}

	private static void casosBisiesto(int dia, int mes) {
		int contador;
		switch (mes)
		{
		case 1:
			contador=366-dia;
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 2:
			contador=335-dia;//29
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 3:
			contador=306-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 4:
			contador=275-dia;//30
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 5:
			contador=245-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 6:
			contador=214-dia;//30
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 7:
			contador=184-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 8:
			contador=153-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 9:
			contador=122-dia;//30
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 10:
			contador=92-dia;//31
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 11:
			contador=61-dia;//30
			System.out.println ("Faltan "+contador+"dias hasta fin de año");
			break;
		case 12:
			contador=31-dia;//31
			System.out.println ("Faltan "+contador+" diasdias hasta fin de año");
			break;
		}
	}
}
