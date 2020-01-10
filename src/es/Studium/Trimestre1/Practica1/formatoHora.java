/**
 * 
 */
package es.Studium.Trimestre1.Practica1;
import java.util.Scanner;
/**
 * @author alv
 *
 */
public class formatoHora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hora;
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Introduzca la hora con el siguiente formato 24h");
		System.out.println("indique la separacion de las horas y los minutos con ':' para que quede de la sigiente forma HH:MM");
		hora = teclado.nextLine();
		teclado.close();
		String[] hora1 = hora.split(":");
		int hor=Integer.parseInt (hora1[0]);
		int min=Integer.parseInt (hora1[1]);
		if (hor<=12)
		{
			if((min<=59)&(min>0))
			{
				System.out.println(hor+":"+min+" am");
			}
			else if (min==0)
			{
				System.out.println(hor+":"+min+"0 am");
			}
			else
			{
				System.out.println("Error, debe introducir un formato valido.");
			}
		}
		else if ((hor>12)&(hor<24))
		{
			if((min<=59)&(min>0))
			{
				System.out.println((hor-12)+":"+min+" pm");
			}
			else if (min==0)
			{
				System.out.println((hor-12)+":"+min+"0 pm");
			}
			else
			{
				System.out.println("Error, debe introducir un formato valido.");
			}
		}
		else
		{
			System.out.println("Error, debe introducir un formato valido.");
		}
	}

}
