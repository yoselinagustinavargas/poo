import java.util.Scanner;

public class ControlCamiones {
    public static void main(String[] args) {
        final int TOTAL_CAMIONES = 30;
        
        // Arrays para guardar los datos de cada camión
        String[] patentes = new String[TOTAL_CAMIONES];
        String[] nombresChofer = new String[TOTAL_CAMIONES];
        String[] tiposCarga = new String[TOTAL_CAMIONES];
        String[] horasEgreso = new String[TOTAL_CAMIONES];
        
        // Contador para camiones que llevan té
        int contadorTe = 0;
        
        // Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Control de Egreso de Camiones ===");
        
        // Carga de datos
        for (int i = 0; i < TOTAL_CAMIONES; i++) {
            System.out.println("\nCamión " + (i + 1));
            
            System.out.print("Ingrese patente: ");
            patentes[i] = scanner.nextLine();
            
            System.out.print("Ingrese nombre y apellido del chofer: ");
            nombresChofer[i] = scanner.nextLine();
            
            // Validar tipo de carga
            boolean tipoValido = false;
            while (!tipoValido) {
                System.out.print("Ingrese tipo de carga (madera, yerba o té): ");
                tiposCarga[i] = scanner.nextLine().toLowerCase();
                
                if (tiposCarga[i].equals("madera") || tiposCarga[i].equals("yerba") || tiposCarga[i].equals("té")) {
                    tipoValido = true;
                    if (tiposCarga[i].equals("té")) {
                        contadorTe++;
                    }
                } else {
                    System.out.println("Tipo de carga inválido. Intente nuevamente.");
                }
            }

            System.out.print("Ingrese hora de egreso (ej. 14:30): ");
            horasEgreso[i] = scanner.nextLine();
        }
        
        // Mostrar resultados
        System.out.println("\n=== Informe de Egreso de Camiones ===");
        for (int i = 0; i < TOTAL_CAMIONES; i++) {
            System.out.println("Camión " + (i + 1));
            System.out.println("Patente: " + patentes[i]);
            System.out.println("Chofer: " + nombresChofer[i]);
            System.out.println("Tipo de carga: " + tiposCarga[i]);
            System.out.println("Hora de egreso: " + horasEgreso[i]);
            System.out.println("-----------------------------");
        }

        System.out.println("Cantidad de camiones que transportaron té: " + contadorTe);
        
        scanner.close();
    }
}
