// PAQUETE ====================================================================================================================================================

    // Aquí vamos a declarar el paquete que contendrá a esta clase.
    package Proyectos.InstaDAM.DatosGenerales;

// IMPORTS ====================================================================================================================================================

    // Aquí vamos a importar todas las librerías necesarias para el correcto funcionamiento de la aplicación.

    // Primero vamos a importar la librería "Util" para poder usar las variables "Date".
    import java.util.Date;

// CLASE DATOS PUBLICACIÓN ====================================================================================================================================

    // Esta clase contendrá los datos de las publicaciones que se muestren en el programa.
    public class DatosPublicacion {

    // DECLARACIONES ==========================================================================================================================================

        // Aquí vamos a declarar diferentes objetos que podremos usar en la aplicación.

        // Datos comunes

            // Primero vamos a declarar una variable de tipo "String" para el autor de la publicación y el mensaje que escriba.
            private String VariableAutor;
            private String VariableMensaje;

            // Ahora vamos a declarar una variable de tipo "Integer" para los "Me gusta" que obtenga la publicación.
            private int VariableMeGusta;

            // Declaramos una variable de tipo "Date" para la fecha de publicación.
            private Date VariableFechaPublicación;

    // COMIENZO DEL CÓDIGO ====================================================================================================================================

        // Aquí comienza a correr el código.

        // CONSTRUCTOR PARAMETRIZADO ==========================================================================================================================

            // Para comenzar el código vamos a crear un constructor parametrizado que recoja todos los datos que hemos declarado.
            public DatosPublicacion(String VariableAutor, String VariableMensaje, int VariableMeGusta, Date VariableFechaPublicación) {

                // Dentro del constructor parametrizado vamos a darle datos a las variables.
                this.VariableAutor = VariableAutor;
                this.VariableMensaje  = VariableMensaje;
                this.VariableFechaPublicación = VariableFechaPublicación;
                this.VariableMeGusta = 0;

            }; // Fin del constructor parametrizado.

        // GETTERS ============================================================================================================================================

            // Aquí vamos a crear los "Getters" para que el programa pueda recoger datos y usarlos.

            public String GetVariableAutor() {

                return VariableAutor;

            }; // Fin GetVariableAutor.
        
            public String GetVariableMensaje() {

                return VariableMensaje;

            }; // Fin GetVariableMensaje.

            public int GetVariableMeGusta() {

                return VariableMeGusta;

            }; // Fin GetVariableMeGusta.
        
            public Date GetVariableFechaPublicación() {

                return VariableFechaPublicación;

            }; // Fin GetVariableFechaPublicación.

        // SETTERS ============================================================================================================================================

            // Aquí vamos a crear los "Setters" para que el programa pueda actualizar los datos para usarlos más adelante.

            public void SetVariableAutor(String VariableAutor) {

                this.VariableAutor = VariableAutor;

            }; // Fin SetVariableAutor.
        
            public void SetVariableMensaje(String VariableMensaje) {

                this.VariableMensaje = VariableMensaje;

            }; // Fin SetVariableMensaje.

            public void SetVariableMeGusta(int VariableMeGusta) {

                this.VariableMeGusta = VariableMeGusta;

            }; // Fin SetVariableMeGusta.

            public void SetVariableFechaPublicación(Date VariableFechaPublicación) {

                this.VariableFechaPublicación = VariableFechaPublicación;

            }; // Fin SetVariableFechaPublicación.

        // MÉTODO MOSTRAR PUBLICACIONES =======================================================================================================================

            // Aquí vamos a crear un método que imprima las publicaciones dentro del programa.
            public String MétodoImpresiónPublicación() {

                // Dentro del método vamos a crear un constructor de Strings para imprimir los datos en un cuadro de texto.
                StringBuilder ImpresiónDeDatos = new StringBuilder();

                // Creado el constructor de strings vamos a especificar como se imprimirán los datos.
                ImpresiónDeDatos.append(VariableAutor);

                ImpresiónDeDatos.append("\t\t\t");

                ImpresiónDeDatos.append(VariableFechaPublicación);

                ImpresiónDeDatos.append("\n");

                ImpresiónDeDatos.append(VariableMensaje);
                
                ImpresiónDeDatos.append("\n");

                ImpresiónDeDatos.append("<3 ");
                
                ImpresiónDeDatos.append(VariableMeGusta);
                
                ImpresiónDeDatos.append("\n");

                // Finalmente retornamos el texto para que se pueda imprimir.
                return ImpresiónDeDatos.toString();

            } // Fin MétodoImpresiónPublicación.
        } // Fin de la clase.
