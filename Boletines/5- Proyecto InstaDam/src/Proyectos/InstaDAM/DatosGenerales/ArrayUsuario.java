// PAQUETE ====================================================================================================================================================

    // Aquí vamos a declarar el paquete que contendrá a esta clase.
    package Proyectos.InstaDAM.DatosGenerales;

// IMPORTS ====================================================================================================================================================

    // Aquí vamos a importar todas las librerías necesarias para el correcto funcionamiento de la aplicación.

    // Primero vamos a importar la librería "Util" para poder buscar en el array los datos necesarios.
    import java.util.HashMap;

// CLASE ARRAY USUARIO ========================================================================================================================================

    // Esta es la clase contendrá el array de inicio de sesión que permita al usuario poner su nombre y contraseña.
    public class ArrayUsuario {

    // DECLARACIONES ==========================================================================================================================================

        // Aquí vamos a declarar diferentes objetos que podremos usar en la aplicación.

    // COMIENZO DEL CÓDIGO ====================================================================================================================================

        // Aquí comienza a correr el código.

        // Primero vamos a crear un "HashMap" que nos permita buscar los datos "Usuario" y "Contraseña" para iniciar sesión.
        private static HashMap<String, DatosUsuario> BúsquedaUsuarios = new HashMap<>();

        // Vamos a crear método que recoja los usuarios y las contraseñas.
        public static void MétodoUsuarioPredeterminado() {

            // Aquí encontramos los usuarios registrados de manera predeterminada.
            BúsquedaUsuarios.put("Admin", new DatosUsuario("Postgres", "Postgres"));
            BúsquedaUsuarios.put("Alguien", new DatosUsuario("Nombre", "Contraseña"));

        } // Fin MétodoUsuarioPredeterminado.

        
}
