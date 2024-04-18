// PAQUETE ====================================================================================================================================================

    // Aquí vamos a declarar el paquete que contendrá a esta clase.
    package Proyectos.InstaDAM.DatosGenerales;

// IMPORTS ====================================================================================================================================================

    // Aquí vamos a importar todas las librerías necesarias para el correcto funcionamiento de la aplicación.

    // Primero vamos a importar la librería "Util" para poder utilizar los arrays y poder utilizar listas.
    import java.util.ArrayList;

    // También vamos a importar de la librería "Util" el método "Calendar" para poder manejar datos tipo "Date" y sus funcionalidades.
    import java.util.Calendar;

// CLASE ARRAY PUBLICACIÓN ====================================================================================================================================

    // Esta es la clase contendrá el array de publicaciones para poder añadir y guardar los mensajes que publique el usuario.
    public class ArrayPublicacion {

    // DECLARACIONES ==========================================================================================================================================

        // Aquí vamos a declarar diferentes objetos que podremos usar en la aplicación.

    // COMIENZO DEL CÓDIGO ====================================================================================================================================

        // Aquí comienza a correr el código.

        // Primero vamos a crear una lista que contendrá todos los mensajes publicados.
        private static ArrayList<DatosPublicacion> ArrayPublicaciones = new ArrayList<>();

        // Ahora vamos a crear un método que se encargará de la lectura de las publicaciones.
        public static void MétodoLecturaPublicaciones(){

            // Dentro del método vamos a crear unas publicaciones predeterminadas.
            DatosPublicacion Publicación1 = new DatosPublicacion("ASmoothCriminal", "Annie, are you OK?", 1405903, Calendar.getInstance().getTime());
            DatosPublicacion Publicación2 = new DatosPublicacion("SomebodyThatIUsedToKnow", "But you treat me like a stranger, and that feels so rough", 104392, Calendar.getInstance().getTime());
            DatosPublicacion Publicación3 = new DatosPublicacion("TheMississippiQueen", "If you know what I mean", 15049, Calendar.getInstance().getTime());
            DatosPublicacion Publicación4 = new DatosPublicacion("ThePainKiller", "Returns from Armageddon to the skies", 1293028, Calendar.getInstance().getTime());

            // Ahora debemos añadirlas al array
            ArrayPublicaciones.add(Publicación1);
            ArrayPublicaciones.add(Publicación2);
            ArrayPublicaciones.add(Publicación3);
            ArrayPublicaciones.add(Publicación4);

        } // Fin MétodoLecturaPublicaciones.

        // Ahora creamos el sistema para añadir nuevos mensajes.
        public void MétodoAgregarPublicaciones(DatosPublicacion Publicación){

            // Dentro del método añadimos la publicación.
            ArrayPublicaciones.add(Publicación);

        } // Fin MétodoAgregarPublicaciones.

        // Creamos un método "getter" para las publicaciones.
        public static ArrayList<DatosPublicacion> GetPublicaciones(){

            // Dentro del método vamos a retornar las publicaciones para que el programa pueda acceder a ellas
            return ArrayPublicaciones;

        } // Fin GetPublicaciones.

        // Creamos un método "setter" para las publicaciones, creando consigo una variable artículo que usaremos para leer el array.
        public static void SetPublicaciones(ArrayList<DatosPublicacion> Artículo){

            // Dentro del método vamos a igualar "Artículo" al array.
            ArrayPublicaciones = Artículo;

        } // Fin SetPublicaciones.

        // Finalmente vamos a crear un método "getter" que servirá para numerar todas las publicaciones que publique el usuario.
        public static DatosPublicacion GetPublicación(int VariableNúmeroPublicación){

            // Aquí vamos a crear un índice para poder numerar las publicaciones.
            int VariableÍndice = ArrayPublicaciones.size() - 1 - VariableNúmeroPublicación;

            // Retornamos las publicaciones dentro del índice
            return ArrayPublicaciones.get(VariableÍndice);

        } // Fin GetPublicación.

    } // Fin de la clase.
