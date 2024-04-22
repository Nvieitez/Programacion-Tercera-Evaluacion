// PAQUETE ====================================================================================================================================================

    // Aquí definiremos la ruta de nuestra clase, para poder dividir y optimizar el código.
    package Main;

// IMPORTS ====================================================================================================================================================

    // Aquí vamos a importar las diferentes funcionalidades y paquetes de nuestro programa para su correcto funcionamiento.

        // Primero vamos a importar la "ClaseEntornoGráfico" para poder usarla dentro del main.
        import EntornoGráfico.ClaseEntornoGrafico;

// CLASE MAIN =================================================================================================================================================

    // Esta es la clase principal, aquí se iniciarán todas las acciones del programa.
    public class Main {

    // ENUNCIADO ==============================================================================================================================================

        // Crea un programa que simule el seguimiento de las misiones espaciales de la NASA, permitiendo al usuario crear y gestionar misiones, asignar
        // diferentes naves y tripulaciones y finalmente visualizar trayectorias y eventos clave de cada viaje.

        // Requisitos:

            // - Crear una Interfaz Gráfica.
            // - Crear un sistema de control de misiones.
            // - Crear un sistema de simulación de trayectorias.
            // - Crear un sistema de gestión de archivos.
            // - Crear un sistema de reportes de misión.

    // DECLARACIONES ==========================================================================================================================================

        // Aquí declararemos todas las variables necesarias para que el programa funcione correctamente.

    // COMIENZO DEL CÓDIGO ====================================================================================================================================

        public static void main(String[] args) throws Exception {

            // Primero vamos a llamar a la "ClaseEntornoGráfico", que contiene el menú principal y sus funciones.
            new ClaseEntornoGrafico();

        } // Fin del código.

    } // Fin de la clase "Main".
