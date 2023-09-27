import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {
        /*
        Programa java para comprobar si un año es bisiesto.
        El programa pide que se introduzca el valor de un año por teclado y calcula
        si es un año bisiesto o no lo es.
        Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible
        por 400.

         */
        Scanner sc = new Scanner(System.in);
        int year = -30;
        do{
            System.out.print("Introduzca un año para saber si es o no bisiesto: ");
            year = sc.nextInt();
            if (year < 0){
                System.out.println("Año no valido, por favor vuelva a ingresar");
            }else if (year % 4 == 0 & (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("El año es bisiesto");
            }else {
                System.out.println("El año no es bisiesto");
            }
        }while (year < 0);

    }
}
