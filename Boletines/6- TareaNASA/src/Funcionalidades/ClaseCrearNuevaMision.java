// PAQUETE ====================================================================================================================================================

    // Aquí definiremos la ruta de nuestra clase, para poder dividir y optimizar el código.
    package Funcionalidades;
    
// IMPORTS ====================================================================================================================================================

    // Aquí podremos importar diferentes librerías que añadirán funciones a nuestro programa.

    // Primero vamos a importar la funcionalidad "ArrayList" para poder usar listas de arrays en nuestro programa.
    import java.util.ArrayList;

    // Ahora vamos a importar la funcionalidad "List" para crear listas de array lists.
    import java.util.List;

    // Importamos JOptionPane para poder pedir datos por pantalla.
    import javax.swing.JOptionPane;

// CLASE CLASE NUEVA MISIÓN ===================================================================================================================================

    // Aquí crearemos la funcionalidad de crear una nueva misión.
    public class ClaseCrearNuevaMision {

    // DECLARACIONES ==========================================================================================================================================

        // Aquí declararemos todas las variables necesarias para que el programa funcione correctamente.
        
            // Primero vamos a declarar el nombre de la misión que introducirá el usuario.        
            private String VariableNombreMisión;

            // Ahora vamos a declarar la fecha de lanzamiento que introducirá el usuario.
            private String VariableFechaLanzamiento;

            // Declaramos los objetivos de la misión que introducirá el usuario.
            private String VariableObjetivos;

            // Declaramos la nave espacial que introducirá el usuario.
            private String VariableNombreNaveEspacial;

            // Declaramos los miembros que introducirá el usuario (Máximo 3).
            private String VariableNombreMiembro1;
            private String VariableNombreMiembro2;
            private String VariableNombreMiembro3;
 
    // COMIENZO DEL CÓDIGO ====================================================================================================================================

        // Primero vamos a crear un constructor parametrizado.

        // CONSTRUCTOR PARAMETRIZADO ==========================================================================================================================

            // Primero declaramos el constructor y añadimos las variables que queramos.
            public ClaseCrearNuevaMision(String VariableNombreMisión, String VariableFechaLanzamiento, String VariableObjetivos, String VariableNombreNaveEspacial, String VariableNombreMiembro1, String VariableNombreMiembro2, String VariableNombreMiembro3){

                // Dentro del constructor declaramos el array.
                List <ClaseCrearNuevaMision> ListaCrearNuevaMisión = new ArrayList<>();

                // Pedimos los datos necesarios por pantalla.
                VariableNombreMisión = JOptionPane.showInputDialog("Por favor, introduce el nombre de la misión.");
                VariableFechaLanzamiento = JOptionPane.showInputDialog("Por favor, introduce la fecha de lanzamiento.");
                VariableObjetivos = JOptionPane.showInputDialog("Por favor, introduce los objetivos de la misión.");
                VariableNombreNaveEspacial = JOptionPane.showInputDialog("Por favor, introduce el nombre de la nave espacial.");
                VariableNombreMiembro1 = JOptionPane.showInputDialog("Por favor, introduce el nombre de tu primer miembro de la tripulación.");
                VariableNombreMiembro2 = JOptionPane.showInputDialog("Por favor, introduce el nombre de tu segundo miembro de la tripulación.");
                VariableNombreMiembro3 = JOptionPane.showInputDialog("Por favor, introduce el nombre de tu tercer miembro de la tripulación.");

                // Finalmente añadimos los datos al ArrayList.
                ListaCrearNuevaMisión.

            } // Fin del constructor parametrizado.     

    } // Fin de la "ClaseNuevaMision".
