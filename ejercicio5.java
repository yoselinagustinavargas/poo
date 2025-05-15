import java.util.Scanner;

public class FacturacionInternet {
    public static void main(String[] args) {
        final int TOTAL_CLIENTES = 5;

        int[] dni = new int[TOTAL_CLIENTES];
        int[] tipoServicio = new int[TOTAL_CLIENTES];
        double[] montoPagar = new double[TOTAL_CLIENTES];

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Facturación de Servicio de Internet ===");

        // Recolección de datos
        for (int i = 0; i < TOTAL_CLIENTES; i++) {
            System.out.println("\nCliente " + (i + 1));

            System.out.print("Ingrese DNI: ");
            dni[i] = scanner.nextInt();

            boolean tipoValido = false;
            while (!tipoValido) {
                System.out.println("Seleccione tipo de servicio:");
                System.out.println("1. Internet 30 megas ($750)");
                System.out.println("2. Internet 50 megas ($1100)");
                System.out.println("3. Internet 100 megas ($1500 con 5% de descuento)");
                System.out.print("Opción (1-3): ");
                tipoServicio[i] = scanner.nextInt();

                switch (tipoServicio[i]) {
                    case 1:
                        montoPagar[i] = 750;
                        tipoValido = true;
                        break;
                    case 2:
                        montoPagar[i] = 1100;
                        tipoValido = true;
                        break;
                    case 3:
                        montoPagar[i] = 1500 * 0.95; // 5% de descuento
                        tipoValido = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            }
        }

        // Mostrar resultados
        System.out.println("\n=== Facturas Generadas ===");
        for (int i = 0; i < TOTAL_CLIENTES; i++) {
            System.out.println("Cliente " + (i + 1));
            System.out.println("DNI: " + dni[i]);
            System.out.println("Tipo de Servicio: " + tipoServicio[i]);
            System.out.printf("Monto a pagar: $%.2f%n", montoPagar[i]);
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}
