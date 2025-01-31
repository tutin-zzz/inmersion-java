import java.util.Scanner;

public class Main {
    public static void main(String[] orgs) {
        System.out.println("Bienvenidos a la inmersión en Java");
        //System.out.println("pelicula Matrix");
        //declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvalucionesUsuario = 0;

        System.out.println("pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular del momento");
        } else {
            System.out.println("Pelicula retro que vale la pena");
        }

        int i = 0;
        while (i < 3) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la puntuación sobre Matrix:");
            try {
                double notaMatrix = teclado.nextDouble();
                mediaEvalucionesUsuario += notaMatrix;
                i++;
            } catch (Exception e) {
                System.out.println("Error: Ingresa un valor numérico válido.");
                teclado.nextLine(); // Limpiar el buffer del Scanner
            }
        }
        System.out.println("La media de la pelicula Matrix es: " + mediaEvalucionesUsuario / 3);

    }
}