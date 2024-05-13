// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a determinar la localización de nuestra clase, esto nos permite dividir nuestro programa y hacerlo más ágil.
    package Funcionalidades;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las diferentes funcionalidades que permiten el correcto funcionamiento de nuestro programa.

    // Primero importamos la funcionalidad "JOptionPane", esta nos permite mostrar e introducir datos por pantalla.
    import javax.swing.JOptionPane;

    // Ahora importamos la funcionalidad "Random", esta nos permite generar valores aleatorios.
    import java.util.Random;

    // Importamos la "ClaseApi" para poder usar sus métodos y funcionalidades.
    import API.ClaseApi;

// CLASE DATOS MERCADO ------------------------------------------------------------------------------------------------------------------------------

    // Esta clase se encargará del sistema lógico y tratado de los datos de mercado.
    public class ClaseDatosMercado {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// INICIO DEL CÓDIGO --------------------------------------------------------------------------------------------------------------------------------

    // Para crear el sistema lógico de esta clase, primero vamos a crear un método que se encargue de recoger y mostrar los datos.
    public static void MétodoDatosMercado(){

        // Dentro del método vamos a recoger los datos de la API.
        String DatosDevueltos = API.ClaseApi.class.getName().formatted();

        // Declaramos un objeto "Random" que nos permite hacer pruebas de funcionalidad.
        Random Random = new Random();

        // Declaramos una variable "Int" que se encargue de recoger el valor de la bitcoin.
        int ValorBitcoin = Random.nextInt(1000);

        // Dentro del método vamos a introducir un JOptionPane que muestre los datos de como está el mercado gracias a la api.
        JOptionPane.showMessageDialog(null, "Las bitcoin están ahora a: " + ValorBitcoin + " €");


    } // Fin del "MétodoDatosMercado".

    } // Fin de la "ClaseDatosMercado".
