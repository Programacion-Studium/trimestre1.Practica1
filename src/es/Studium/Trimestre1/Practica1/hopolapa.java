package es.Studium.Trimestre1.Practica1;
/*
 * Hopolapa - Realizar un programa que lea una cadena e inserte detrás de cada
vocal que encuentre, una p y la vocal encontrada. Por ejemplo, si tenemos Hola
se transformará en Hopolapa.
 */
import java.util.Scanner; //importamos el escáner
/**
 * @author alv
 *
 */
public class hopolapa 
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//aplicamos el escáner
        String palabra, palabra2="";//declaramos variables
        System.out.println("indique la palabra o frase a cambiar");
        palabra=teclado.nextLine();//leemos la palabra o frase a cambiar
        teclado.close();// cerramos teclado
        char tabla[] = new char[palabra.length()];//creamos las tablas que almacenara lo introducido por teclado
        //declaramos las tablas que vamos a necesitar para cambiar los caracteres y ponerlos como srting
        String tabla2[] = new String[palabra.length()];
        String tabla3[] = new String[palabra.length()];
        char vocales[] = new char[10];//declaramos las tablas que contendrá los elementos a cambiar
        //creamos los elementos a cambiar
        vocales[0]='a';
        vocales[1]='e';
        vocales[2]='i';
        vocales[3]='o';
        vocales[4]='u';
        vocales[5]='A';
        vocales[6]='E';
        vocales[7]='I';
        vocales[8]='O';
        vocales[9]='U';
        for (int i=0; i<palabra.length();i++) //recorremos la palabra para meterla en la primera tabla
        {
            tabla[i]=palabra.charAt(i);
        }
        for (int i=0; i<tabla.length;i++)//recorremos la tabla
        {
            for (int z=0;z<vocales.length;z++)//recorremos las vocales
            {
                if (tabla[i]==vocales[z])//si la posición de la tabla contiene alguna vocal la pondrá en tabla2 añadiendo la vocal + p + la vocal
                {
                    tabla2[i]=(tabla[i]+"p"+tabla[i]);
                    z=vocales.length+1;//Si se encuentra la vocal con esto cerramos el bucle.
                }
                else if (tabla2[i]==null)
                {
                    tabla2[i]="";//donde no haya vocal lo rellenara con nada
                }
            }
            //cerramos bucle de recorrer vocales
            //si es diferente a cualquier vocal lo añadimos la tabla a tabla3
            if (tabla[i]!=vocales[0]&&tabla[i]!=vocales[1]&&tabla[i]!=vocales[2]&&tabla[i]!=vocales[3]&&tabla[i]!=vocales[4]&&tabla[i]!=vocales[5]&&tabla[i]!=vocales[6]&&tabla[i]!=vocales[7]&&tabla[i]!=vocales[8]&&tabla[i]!=vocales[9])
            {
                tabla3[i]=tabla[i]+"";
            }
            else
            {
                tabla3[i]="";//si no se cumple lo anterior rellenamos la tabla con nada
            }
        }
        //Cerramos el bucle de recorrer la tabla
        int i=0;
        while ((i<tabla2.length)||(i<tabla3.length))//recorremos las 2 tablas para juntarlas en un string cuando las 2 no cumplan la condición parara el bucle
        {
            if (tabla2.length-1>=i)//verificamos que en el bucle no pueda seguir en la tabla si este es mayor que la tabla
            {
                palabra2=palabra2+tabla2[i];//como en la tabla2 tenemos vacío los elementos que no nos interesan podemos meterlo todo
            }
            if (tabla3.length-1>=i)//verificamos que en el bucle no pueda seguir en la tabla si este es mayor que la tabla
            {
                palabra2=palabra2+tabla3[i];//como en la tabla3 tenemos vacío los elementos que no nos interesan podemos meterlo todo
            }
            i++;
        }
        System.out.println("Resultado: "+palabra2);
    }
}