import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu película favorita?");
        String pelicula = sc.nextLine();
        System.out.println("¿Cuál es el año de lanzamiento?");
        int fechaDeLanzamiento = sc.nextInt();
        System.out.println("Califica la película en escala de 1 a 10");
        double calificacion = sc.nextDouble();

        System.out.println("Tu película favorita es: " + pelicula + ", fue lanzada en el año " + fechaDeLanzamiento + " y la calificaste con: " + calificacion);
    }
}
