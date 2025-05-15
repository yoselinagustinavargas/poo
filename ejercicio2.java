
import java.util.Scanner;

public class Notas {
    private int [] notas; 
    private int cantidad;
 
    public Notas (int cantidad) {
        this.cantidad = cantidad;
        notas = New int [cantidad];

    }
   //metodo de cargar las notas
   public void cargarNotas() {
    scanner scanner = new Scanner (System.in);
    for (int i = 0; i < cantidad; i++){
        System.out.print("ingresar nota" + (i + 1) ":  ");
        notaa[i] = scanner.nextInt();
    }
   }
   //Metodo para contar aprobados 
   public int contarAprobados () {
       int aprobados = 0;
       for (int nota : notas)   {
           if (nota >= 6) {
              aprobados++;
           }
       }
       return aprobados; 

   }


//  contar desaprobados 
public int contarDesaprobados() {
    int desaprobados = 0;
    for (int nota : notas ) {
        if (nota < 6) {
            desaprobados++;
        }
    }
    return desaprobados

}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de notas: ");
    int cantidad = scanner.nextInt();

    Notas notasAlumno = new Notas(cantidad);
    notasAlumno.cargarNotas();

    int aprobados = notasAlumno.contarAprobados();
    int desaprobados = notasAlumno.contarDesaprobados();

    System.out.println("Cantidad de aprobados: " + aprobados);
    System.out.println("Cantidad de desaprobados: " + desaprobados);
    
   }
}