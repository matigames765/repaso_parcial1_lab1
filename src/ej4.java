import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) {
        /*
        Programa java para convertir una calificación numérica en alfabética.
        El programa lee por teclado una calificación numérica entre 0 y 10 y muestra
        por pantalla su correspondiente calificación alfabética.
        La equivalencia entre la calificación numérica y la alfabética se muestra en
        esta tabla:

        La calificación numérica que se introduce por teclado debe estar comprendida
        entre 0 y 10 para poder obtener su equivalente calificación alfabética. Si la
        calificación introducida no es válida se muestra un mensaje indicándolo y el
        programa finaliza.

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una calificacion numerica del 0 al 10: ");
        int qualification = sc.nextInt();
        switch (qualification){
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Calificacion no valida");

        }


    }
}
