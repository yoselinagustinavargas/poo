import java.util.Scanner;

public class MejorTiempoCarrera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroVehiculoMejor = 0;
        double mejorTiempo = Double.MAX_VALUE;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Ingrese el número del vehículo #" + i + ": ");
            int numeroVehiculo = scanner.nextInt();

            System.out.println("Ingrese el tiempo (en segundos) del vehículo #" + numeroVehiculo + ": ");
            double tiempo = scanner.nextDouble();

            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                numeroVehiculoMejor = numeroVehiculo;
            }
        }

        System.out.println("\nEl mejor tiempo fue del vehículo #" + numeroVehiculoMejor +
                           " con un tiempo de " + mejorTiempo + " segundos.");

        scanner.close();
    }
}
