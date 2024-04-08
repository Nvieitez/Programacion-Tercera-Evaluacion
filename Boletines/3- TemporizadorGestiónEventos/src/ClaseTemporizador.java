// IMPORTS ======================================================================================================================

    // Importamos el Javax.Swing para mostrar información por pantalla.
    import javax.swing.*;

    // Importamos el Java.Awt.Event para poder manejar eventos y que el programa responda a ellos
    import java.awt.event.*;
    
// CLASE TEMPORIZADOR ===========================================================================================================
    
    // La clase temporizador contendrá todo el funcionamiento de nuestro programa, además contendrá la clase anónima.

    public class ClaseTemporizador extends JFrame{

    // DECLARACIONES ============================================================================================================

        // Primero declaramos una variable que funcionará como nuestro tiempo de reacción.
        int TiempoReacción = 800;

        // Ahora declaramos una variable que servirá de contador para conocer las veces que se cumple el tiempo esperado.
        int Contador = 0;

    // COMIENZO DEL CÓDIGO ======================================================================================================

        // Vamos a declarar nuestro temporizador.
        Timer Temporizador = new Timer(TiempoReacción, new ActionListener(){
            
            // Dentro del Temporizador usamos el ActionListener y declaramos el código de respuesta.
            @Override
            public void actionPerformed(ActionEvent e){

                // Vamos a implementar el contador
                Contador++;
                
                // Ahora vamos a crear un condicional que determine el resultado del programa dependiendo de si el contador es par o no.
            
        // CONDICIONAL ==========================================================================================================

            // CONTADOR VALOR PAR ===============================================================================================

                if (Contador % 2 == 0){
                    System.out.println("El contador es par");
                }

            // CONTADOR VALOR IMPAR =============================================================================================

                else{
                    System.out.println("El contador es impar");
                }
                 
        // FIN DEL CONDICIONAL ==================================================================================================
            
            } // Fin del ActionPerformed.  
        }); // Fin del ActionListener.

        // Declaramos el inicio del temporizador.
        public void Inicio(){
            Temporizador.start();
            while(true);
        }

        public void Final(){
            Temporizador.stop();
        }

    } // Fin del programa.
    

    