
package lab1p1_joseseron;

import java.util.Scanner;

/**
 *
 * @author Jose Seron
 */
public class Lab1P1_JoseSeron {


    public static void main(String[] args) {  
        Scanner gabagool = new Scanner(System.in);
        int numero = 2;
        char caracter ='a';
        double doble = 0.25;
        boolean bandera = true;
        System.out.println("Elija el ejercicio");
        numero = gabagool.nextInt();
        
        
        if ( numero == 1 ) {
            
            int num1 = 15;
            int num2 = 30;
            int resultado;
            resultado = 15 * 30;
            System.out.print("Resultado: ");
            System.out.println(resultado);

        } else if (numero == 2) {

            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario = gabagool.nextInt();
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario2 = gabagool.nextInt();
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario3 = gabagool.nextInt();
            
            double Promedio = (numeroUsuario+numeroUsuario2+numeroUsuario3/3);
            System.out.println("Promedio: "+Promedio);

        } else {
            System.out.println("salio del programa");
        }
    }
    
}
