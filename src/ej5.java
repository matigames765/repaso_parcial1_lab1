import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {
        /*
        25. Programa que pida que se introduzca por teclado el valor de un número entero
        N y muestre los números desde N hasta 1 ambos incluidos. Se debe resolver este
        ejercicio de tres formas distintas utilizando la estructura repetitiva:
        1.      Utilizando la estructura for
        2.      Utilizando la estructura while
        3.      Utilizando la estructura do .. while

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero N: ");
        int N = sc.nextInt();
        System.out.println("Con el bucle for: ");
        for (int i = N; i > 0;i--){
            System.out.println(i);
        }
        System.out.println("Con el bucle while: ");
        int j = N;
        while (j > 0){
            System.out.println(j);
            j--;
        }
        System.out.println("Con el bucle do while");
        int s = N;
        do{
            System.out.println(s);
            s--;
        }while (s > 0);
    }
}
