// IMPORTS ======================================================================================================================

    import javax.swing.*;

    import java.awt.*;

    import java.awt.event.*;
import java.beans.EventHandler;

// CLASE COLORES ================================================================================================================

    public class ClaseColores extends JFrame {

    // DECLARACIONES ============================================================================================================

        // Creamos el desplegable donde se encontrarán todos los colores a elegir
        private JComboBox DesplegableColores;

        // Creamos el panel donde se mostrarán los colores que elegirá el usuario
        private JPanel Panel;

    // COMIENZO DEL CÓDIGO ======================================================================================================

        // Creamos un constructor que incluya toda la estructura gráfica de la aplicación
        public ClaseColores(){

            // Título de la ventana
            super("Cambio de color");

            // Declaración del diseño gráfico
            setLayout(new FlowLayout());

        // DESPLEGABLE DE COLORES ===============================================================================================

            // Aqui creamos el desplegable para introducir los colores y seleccionarlos

            // Primero creamos un string con las opciones que queremos introducir en el desplegable 
            String[] StringColores = {"Rojo", "Verde", "Azul"};

            // Declaramos el desplegable y lo igualamos al string
            DesplegableColores = new JComboBox<>(StringColores);

            // Creamos el actionlistener, para que reaccione a lo que haga el usuario
            DesplegableColores.addActionListener(new ActionListener() {

                // Creamos la acción de respuesta
                @Override
                public void actionPerformed (ActionEvent e){

                    // Le decimos al programa que recoja el valor elegido por el usuario
                    JComboBox<> DesplegableColores = (DesplegableColoress) event.getSource();
                    

                }
            });
        }
    }
