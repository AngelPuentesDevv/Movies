public class Populares {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 2014;
        boolean incluidoEnPlan = true;
        double calificacionPelicula = 8.0;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento>2023){
            System.out.println("Películas más populares");
        } else {
            System.out.println("Clásicos del cine");
        }

        if (incluidoEnPlan || tipoPlan.equalsIgnoreCase("plus")){
            System.out.println("Puedes disfrutar de esta película");
        } else {
            System.out.println("Este título no está incluido en tu plan");
        }
    }
}
