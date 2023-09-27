import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        /*
        Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual
        que en el ejemplo.




        Por ejemplo para un número N = 12345    La salida debe ser:

        5
        45
        345
        2345
        12345

         */
        Scanner sc = new Scanner(System.in);
        int number = 400;
        while (number < 10000 || number > 99999){
            System.out.print("Introduzca un numero de 5 cifras: ");
            number =  sc.nextInt();
            if (number < 10000 || number > 99999){
                System.out.println("El numero no es de 5 cifras, vuelva a introducir...");
            }else{
                System.out.println(number % 10);
                System.out.println(number % 100);
                System.out.println(number % 1000);
                System.out.println(number % 10000);
                System.out.println(number);
            }
            System.out.println(number / 10000);
            System.out.println(number / 1000);
            System.out.println(number / 100);
            System.out.println(number / 10);
            System.out.println(number);
        }

    }
}
