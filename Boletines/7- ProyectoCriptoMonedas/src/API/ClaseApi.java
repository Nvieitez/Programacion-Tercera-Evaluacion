// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a determinar la localización de nuestra clase, esto nos permite dividir nuestro programa y hacerlo más ágil.
    package API;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las diferentes funcionalidades que permiten el correcto funcionamiento de nuestro programa.

    // Primero vamos a importar la funcionalidad "BufferedReader", esta nos permite crear información externa.
    import java.io.BufferedReader;

    // Ahora vamos a importar la funcionalidad "IOException", esta nos permite manejar excepciones dentro del programa.
    import java.io.IOException;

    // Importamos la funcionalidad "InputStreamReader", esta nos permite convertir la información externa a datos que el programa pueda leer.
    import java.io.InputStreamReader;

    // Importamos la funcionalidad "HttpURLConnection", esta nos permite conectarnos a Urls del internet desde el programa.
    import java.net.HttpURLConnection;

    // Importamos la funcionalidad "URL", esta nos permite manejar las diferentes Url que introduzcamos en el programa.
    import java.net.URL;

// CLASE API ----------------------------------------------------------------------------------------------------------------------------------------

    // Esta clase se encargará de recoger los datos del mercado en tiempo real.
    public class ClaseApi { 

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// INICIO DEL CÓDIGO --------------------------------------------------------------------------------------------------------------------------------

    // Para iniciar el sistema lógico, primero vamos a crear un método que recoja los datos del mercado.
    public void MétodoRecogerDatos() {

        // Dentro del método vamos a determinar la url donde está el api que queremos introducir en el programa.
        String UrlApi = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd";

        // Ahora creamos un "try-catch" que se encargue de de comprobar que la conexión se haya creado correctamente.
        try {

            // Dentro del "try-catch" vamos a crear un nuevo objeto URL que contenga la variable UrlApi.
            URL Url = new URL(UrlApi);

            // Ahora determinamos un sistema de conexión con la url que acabamos de declarar.
            HttpURLConnection con = (HttpURLConnection) Url.openConnection();

            // Creamos un sistema de request para que devuelva los datos.
            con.setRequestMethod("GET");

            // Creamos un "BufferedReader" para que lea los datos que vamos a utilizar.
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            // Declaramos una variable String que se encargue de recoger los datos del BufferedReader.
            String DatosDevueltos;

            // Convertimos los datos del BufferedReader en un String que podamos utilizar dentro del programa.
            StringBuffer content = new StringBuffer();

            // Creamos un "while" que imprima los datos recogidos y de error si el dato es nulo.
            while ((DatosDevueltos = in.readLine()) != null) {

                // Imprimimos los datos.
                content.append(DatosDevueltos);

            } // Fin del "While".

            // Cerramos la conexión.
            in.close();

            // Nos desconectamos de la URL.
            con.disconnect();

        } catch (IOException ErrorConexión) {

            // Cerramos el "try-catch" con un mensaje de error en caso de que la conexión falle.
            ErrorConexión.printStackTrace();

        } // Fin del "catch".

    } // Fin del "MétodoRecogerDatos".

    } // Fin de la clase "API".
