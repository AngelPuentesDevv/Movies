import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double calificacion = 0;
        double mediaCalificacion = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa la calificación de la película");
            calificacion = sc.nextDouble();
            mediaCalificacion += calificacion;
        }
        System.out.println("La calficicación media es: " + (mediaCalificacion / 3));
    }
}
