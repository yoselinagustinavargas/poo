
// 1. Un alumno tiene “n” notas (Se ingresa por teclado la cantidad de notas) que se deben
// cargar en un vector (Se debe definir el vector en base a la cantidad de notas que se van a
// ingresar, por ejemplo: Si son 5 notas, el vector debe ser de tamaño 5). Luego de cargar las
// notas se debe mostrar la nota más alta y el promedio de notas.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[4];
        int suma = 0;
        int notaMaxima = Integer.MIN_VALUE;

        System.out.println("Ingresar 4 notas");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            notas[i] = scanner.nextInt(); // carga las 4 notas
             suma += notas[i];

            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
        }
        double promedio = (double) suma / notas.length;

        // System.out.println("\nNotas ingresadas:");
        // for (int nota : notas) {
        //     System.out.println(nota);
        // }  // imprime las 4 notas

        System.out.println("\nNota más alta: " + notaMaxima);
        System.out.printf("Promedio de notas: %.2f\n", promedio); // imprime el promedio

        // System.out.println("\nLos valores cargados son:");
        // for (int i = 0; i < vector.length; i++) {
        // System.out.println("vector[" + i + "] = " + vector[i]); //imprime las 4 notas
        // }

        scanner.close();
    }
}
