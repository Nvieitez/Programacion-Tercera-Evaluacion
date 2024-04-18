// PAQUETE ====================================================================================================================================================

    // Aquí vamos a declarar el paquete que contendrá a esta clase.
    package Proyectos.InstaDAM.DatosGenerales;

// IMPORTS ====================================================================================================================================================

    // Aquí vamos a importar todas las librerías necesarias para el correcto funcionamiento de la aplicación.

    // Primero vamos a importar la librería "Util" para poder utilizar los arrays y sus funcionalidades.
    import java.util.ArrayList;

// CLASE DATOS USUARIO ========================================================================================================================================

    // Esta es la clase que contendrá todos los datos que utilice el sistema de inicio de sesión.
    public class DatosUsuario {

    // DECLARACIONES ==========================================================================================================================================

        // Aquí vamos a declarar diferentes objetos que podremos usar en la aplicación.

        // DATOS COMUNES ======================================================================================================================================

            // Primero vamos a declarar una variable de tipo "String" para el nombre de usuario y la contraseña.
            private String VariableNombreUsuario;
            private String VariableContraseña;

            // Ahora vamos a declarar una variable de tipo "Int" para los seguidores del usuario.
            private int VariableSeguidores;
 
    // COMIENZO DEL CÓDIGO ====================================================================================================================================

        // Aquí comienza a correr el código.

        // Primero vamos a declarar un array list para mostrar un menú con las publicaciones recientes.
        public static ArrayList<DatosPublicacion> PublicacionesRecientes = new ArrayList<>();

        // CONSTRUCTOR PARAMETRIZADO ==========================================================================================================================

            // Ahora vamos a declarar un constructor parametrizado que incluya las variables declaradas.

            public DatosUsuario(String VariableNombreUsuario, String VariableContraseña){

                // Aquí vamos a inicializar los datos declarados.
                this.VariableNombreUsuario = VariableNombreUsuario;
                this.VariableContraseña = VariableContraseña;
                this.VariableSeguidores = 0;

            } // Fin del constructor parametrizado

        // GETTERS ============================================================================================================================================

            // Aquí vamos a crear los "Getters" para que el programa pueda recoger datos y usarlos.

            public String GetVariableNombreUsuario() {

                return VariableNombreUsuario;

            } // Fin GetVariableNombreUsuario.
        
            public String GetVariableContraseña() {

                return VariableContraseña;

            } // Fin VariableContraseña.
        
            public int GetVariableSeguidores() {

                return VariableSeguidores;

            } // Fin GetVariableSeguidores.
        
            public static ArrayList<DatosPublicacion> GetPublicacionesRecientes() {

                return PublicacionesRecientes;

            } // Fin GetPublicacionesRecientes.

        // SETTERS ============================================================================================================================================

            // Aquí vamos a crear los "Setters" para que el programa pueda actualizar los datos para usarlos más adelante.

            public void SetVariableNombreUsuario(String VariableNombreUsuario) {

                this.VariableNombreUsuario = VariableNombreUsuario;

            } // Fin SetVariableNombreUsuario.
        
            public void SetVariableContraseña(String VariableContraseña) {

                this.VariableContraseña = VariableContraseña;

            } // Fin SetVariableContraseña.
        
            public void SetVariableSeguidores(int VariableSeguidores) {

                this.VariableSeguidores = VariableSeguidores;

            } // Fin SetVariableSeguidores.

            // Creamos un método que actualizará las publicaciones creadas por el usuario.
        
            public void MétodoActualizarPublicaciones(DatosPublicacion Artículo) {

                PublicacionesRecientes.add(Artículo);

            } // Fin MétodoActualizarPublicaciones.

        } // Fin de la clase.
