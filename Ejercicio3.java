package ProyectoS1;

public class Ejercicio3 {
    /** Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
     * Concatenar nombres
     * Los textos pueden venir de un array String
     */
    public static void main(String[] args) {


        String[] nombres = {"Juan", "pedro", "Marcelo", "Tomás", "Juana", "Aldana"};
        String concatenado = "";

        for (String nombre: nombres ) {
            concatenado += nombre + " ";
            System.out.println(concatenado);

        }

    }
}


