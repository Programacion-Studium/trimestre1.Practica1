package es.Studium.Trimestre1.Practica1;
/*
 * Traductor - Realizar un programa que lea una frase en español y la traduzca al
inglés o viceversa. Usaremos un diccionario reducido compuesto por las palabras
yo, tu, el, ella, soy, eres, es, alto, bajo, español y sus equivalentes en inglés.
 */
import java.util.Scanner;
/**
 * @author alv
 *
 */
public class Traductor 
{

	public static void main(String[] args) 
	{
		// Le aplicamos a teclado la utilidad escáner
		Scanner teclado = new Scanner(System.in);
		String palabra;
		System.out.println("Atención, escriba todo en minúsculas");
		System.out.println("Indique una palabra a traducir:");
		palabra=teclado.nextLine();//Leemos la cadena a traducir
		teclado.close(); //Cerramos teclado
		String[] parts = palabra.split(" ");//split separa por lo que se le diga
		System.out.println("La frase traducida es:");
		revisarTraductor(parts);
	}


	private static void revisarTraductor(String[] parts) {
		for(int i=0;i<parts.length;i++)//recorremos tantas veces como palabras hay.
		{
			switch (parts[i])//Miramos si las palabras almacenadas en la tabla y imprimimos el resultado
			{
			case "yo":
				System.out.print("i");
				System.out.print(" ");
				break;//detiene el switch
			case "tu":
				System.out.print("you");
				System.out.print(" ");
				break;//detiene el switch
			case "el":
				System.out.print("he");
				System.out.print(" ");
				break;//detiene el switch
			case "ella":
				System.out.print("she");
				System.out.print(" ");
				break;//detiene el switch
			case "soy":
				System.out.print("am");
				System.out.print(" ");
				break;//detiene el switch
			case "eres":
				System.out.print("are");
				System.out.print(" ");
				break;//detiene el switch
			case "es":
				System.out.print("is");
				System.out.print(" ");
				break;//detiene el switch
			case "alto":
				System.out.print("tall");
				System.out.print(" ");
				break;//detiene el switch
			case "bajo":
				System.out.print("low");
				System.out.print(" ");
				break;//detiene el switch
			case "español":
				System.out.print("spanish");
				System.out.print(" ");
				break;//detiene el switch
			case "i":
				System.out.print("yo");
				System.out.print(" ");
				break;//detiene el switch
			case "you":
				System.out.print("tu");
				System.out.print(" ");
				break;//detiene el switch
			case "he":
				System.out.print("el");
				System.out.print(" ");
				break;//detiene el switch
			case "she":
				System.out.print("ella");
				System.out.print(" ");
				break;//detiene el switch
			case "i am":
				System.out.print("soy");
				System.out.print(" ");
				break;//detiene el switch
			case "you are":
				System.out.print("eres");
				System.out.print(" ");
				break;//detiene el switch
			case "is":
				System.out.print("es");
				System.out.print(" ");
				break;//detiene el switch
			case "tall":
				System.out.print("alto");
				System.out.print(" ");
				break;//detiene el switch
			case "low":
				System.out.print("bajo");
				System.out.print(" ");
				break;//detiene el switch
			case "spanish":
				System.out.print("español");
				System.out.print(" ");
				break; //detiene el switch
			default://Por defecto mostrara el siguiente mensaje de error
				System.out.println("Error, la palabra no se encuentra");
			}
		}
	}
}