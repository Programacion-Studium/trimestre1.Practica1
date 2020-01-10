/**
 * 
 */
package es.Studium.Trimestre1.Practica1;
import java.util.Random;
import java.util.Scanner;
/**
 * @author alv
 *
 */
public class preguntasRespuestas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		int respuesta[] = new int[3];
		int aleatoria[] = new int[3];
		String pregunta[] = new String[10];
		pregunta[0]="¿5+10?";
		pregunta[1]="¿1 elevado a 3?";
		pregunta[2]="¿5*10?";
		pregunta[3]="¿En un haz de luz cuantos colores forman el blanco?";
		pregunta[4]="¿10-5?";
		pregunta[5]="¿10/2?";
		pregunta[6]="¿2 elevado a 2?";
		pregunta[7]="¿En el pigmento cuantos colores forman el negro?";
		pregunta[8]="¿2+2?";
		pregunta[9]="¿6+4?";
		preguntasYrespuestas(teclado, respuesta, aleatoria, pregunta);
		int contador = comprobarRespuestas(respuesta, aleatoria);
		System.out.println("Tiene "+contador+" respuestas correctas");
	}
	/**
	 * @param respuesta
	 * @param aleatoria
	 * @return
	 */
	private static int comprobarRespuestas(int[] respuesta, int[] aleatoria) {
		int i;
		int contador=0;
		for(i=0;i<3;i++)
		{
			switch (aleatoria[i])
			{
				case 0:
					if (respuesta[i]==15)
					{
						contador++;
					}
					break;
				case 1:
					if (respuesta[i]==1)
					{
						contador++;
					}
					break;
				case 2:
					if (respuesta[i]==50)
					{
						contador++;
					}
					break;
				case 3:
					if (respuesta[i]==3)
					{
						contador++;
					}
					break;
				case 4:
					if (respuesta[i]==5)
					{
						contador++;
					}
					break;
				case 5:
					if (respuesta[i]==5)
					{
						contador++;
					}
					break;
				case 6:
					if (respuesta[i]==4)
					{
						contador++;
					}
					break;
				case 7:
					if (respuesta[i]==3)
					{
						contador++;
					}
					break;
				case 8:
					if (respuesta[i]==4)
					{
						contador++;
					}
					break;
				case 9:
					if (respuesta[i]==10)
					{
						contador++;
					}
					break;
			}
		}
		return contador;
	}

	/**
	 * @param teclado
	 * @param respuesta
	 * @param aleatoria
	 * @param pregunta
	 */
	private static void preguntasYrespuestas(Scanner teclado, int[] respuesta, int[] aleatoria, String[] pregunta) {
		int i;
		for(i=0;i<3;i++)
		{
			Random rnd=new Random();
			aleatoria[i]= rnd.nextInt(10);
			System.out.println(pregunta[aleatoria[i]]);
			respuesta[i] = teclado.nextInt();	
		}
	}

}