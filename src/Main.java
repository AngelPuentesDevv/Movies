public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a ScreenMatch");
        System.out.println("El recuerdo de Marnie");
        int fechaDeLanzamiento = 2014;
        boolean incluidoEnPlan = true;
        double calificacionPelicula = 8.0;
        double media = (8.0 + 7.0 + 9.0) / 3;

        String sinopsis = """
                El recuerdo de Marnie fue dirigida por Hayao Miyazaki 
                en conjunto con Studio Ghibli, fue lanzada en:
                """+ fechaDeLanzamiento;
        System.out.println(sinopsis);

        //Realizar casting para trabajar un nuevo tipo de dato (double a int)
        int clasificacion = (int) (media/2);
        System.out.println("Estrellas: "+ clasificacion);
    }
}