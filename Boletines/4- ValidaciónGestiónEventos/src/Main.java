// IMPORTS ======================================================================================================================

    // Primero importamos el scanner para usarlo en el programa
    import java.util.Scanner;

// MAIN =========================================================================================================================

public class Main{
    public static void main(String[] args) throws Exception {

    // ENUNCIADO ================================================================================================================

        // Crea un programa que valide si un número es par o impar, para ello usa una interfaz que contenga el booleano
        // que sea una clase anónima.

    // DECLARACIONES ============================================================================================================

        // Primero declaramos un scanner para pedir datos por consola.
        Scanner Scanner = new Scanner(System.in);

        // Declaramos el número que se va a pedir por consola
        int NúmeroConsola;
        
    // COMIENZO DEL CÓDIGO ======================================================================================================

        // Primero vamos a hacer una impresión para darle instrucciones al usuario.
        System.out.println("Por favor, escribe el número que desees validar.");

        // Ahora vamos a pedir el número a validar por consola.
        NúmeroConsola = Scanner.nextInt();

        // Ahora debemos declarar la interfaz en el main.
        InterfazValidacion InterfazValidacion = new InterfazValidacion() {

            // Dentro de la interfaz declarada creamos el código del método mediante un Override.
            @Override

            // Declaramos el método
            public void MétodoValidación() {
                
                // Dentro del método creamos un condicional que nos diga si el número es par o no

            // CONDICIONAL ======================================================================================================

                // NÚMERO PAR ===================================================================================================
                if (NúmeroConsola % 2 == 0){
                    System.out.println("El número es par");
                }

                // NÚMERO IMPAR =================================================================================================
                else {
                    System.out.println("El número es impar");
                }
            
            // FIN DEL CONDICIONAL ==============================================================================================

            } // Fin del método

        }; // Fin de la interfaz

        // Ahora llamamos al método para que se inicie al correr el programa.
        InterfazValidacion.MétodoValidación();

    } // Fin main.

} // Fin Programa.
