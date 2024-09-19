import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double calificacion = 0;
        double mediaCalificacion = 0;
        int totalCalificaciones = 0;

        while (calificacion != -1){
            System.out.println("Ingresa la calificación de la película");
            calificacion = sc.nextDouble();

            if (calificacion != -1){
                mediaCalificacion += calificacion;
                totalCalificaciones++;
            }
        }
        System.out.println("La calficicación media es: " + (mediaCalificacion / totalCalificaciones));
    }
}
