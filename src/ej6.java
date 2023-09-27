import java.util.Scanner;
public class ej6 {
    public static void main(String[] args) {
        /*
        Programa que lea dos números enteros positivos N y M y muestre los múltiplos de N
        que hay desde 1 hasta M. Por ejemplo si N = 4 y M = 500 el programa mostrará los
        múltiplos de 4 desde 1 hasta 500. El valor de N deberá ser menor que el valor de M.
        Si no se introducen valores válidos para N o M se mostrará el mensaje
        correspondiente y se vuelven a pedir.
         */
        Scanner sc = new Scanner(System.in);
        int N = 100;
        int M = 30;
        while (M < N){
            System.out.print("Introduzca un numero N: ");
            N = sc.nextInt();
            System.out.print("Introduzca un numero M: ");
            M = sc.nextInt();
            if (M < N){
                System.out.println("N debe ser menor que M vuelva a introducir");
            }
        }
        for (int i = 1; i <= M; i++){
            if (i % N == 0){
                System.out.println(i + " es multiplo de " + N);
            }
        }



    }
}
