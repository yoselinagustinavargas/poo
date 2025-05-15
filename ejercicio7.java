imimport java.util.Scanner;

public class CensoProvincial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPersonas = 0;
        int totalVarones = 0;
        int totalMujeres = 0;
        int varones16a65 = 0;

        int mayorEdad = -1;
        int dniMayorEdad = 0;
        char sexoMayorEdad = ' ';
        
        while (true) {
            System.out.print("Ingrese número de documento (0 para finalizar): ");
            int dni = scanner.nextInt();
            if (dni == 0) {
                break;
            }

            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese sexo (F o M): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            // Contar total de personas
            totalPersonas++;

            // Contar varones y mujeres
            if (sexo == 'M') {
                totalVarones++;
                if (edad >= 16 && edad <= 65) {
                    varones16a65++;
                }
            } else if (sexo == 'F') {
                totalMujeres++;
            }

            // Verificar si es la persona de mayor edad
            if (edad > mayorEdad) {
                mayorEdad = edad;
                dniMayorEdad = dni;
                sexoMayorEdad = sexo;
            }
        }

        System.out.println("\n--- Resultados del Censo ---");
        System.out.println("Cantidad total de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + totalVarones);
        System.out.println("Cantidad de mujeres: " + totalMujeres);

        if (totalVarones > 0) {
            double porcentajeVarones16a65 = (varones16a65 * 100.0) / totalVarones;
            System.out.printf("Porcentaje de varones entre 16 y 65 años: %.2f%%\n", porcentajeVarones16a65);
        } else {
            System.out.println("No se censaron varones.");
        }

        if (mayorEdad != -1) {
            System.out.println("Persona con mayor edad:");
            System.out.println("DNI: " + dniMayorEdad + ", Edad: " + mayorEdad + ", Sexo: " + sexoMayorEdad);
        }

        scanner.close();
    }
}
