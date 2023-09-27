import java.util.Scanner;
import java.lang.Math;
public class ej1 {
    public static void main(String[] args) {
        /*
        8. Programa que tome como dato de entrada un número que corresponde a la longitud
        del radio una esfera y nos calcula y escribe el volumen de la esfera que se
        corresponden con dicho radio.

        La fórmula para calcular el volumen de la esfera es
        v = (4/3)*PI*r^3

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio de la esfera: ");
        double radio = sc.nextDouble();
        double volume = (4.0 / 3) * Math.PI * Math.pow(radio,3);
        System.out.print("El volumen de la esfera es " + volume);

    }
}
