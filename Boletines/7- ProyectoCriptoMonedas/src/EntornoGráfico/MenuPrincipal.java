// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package EntornoGráfico;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Primero vamos a importar la funcionalidad "JFrame", esta nos permite crear ventanas que muestren información al usuario.
    import javax.swing.JFrame;

    // Ahora vamos a importar la funcionalidad "JPanel", esta nos permite crear contenedores para los componentes del entorno gráfico.
    import javax.swing.JPanel;

    // Importamos la funcionalidad "ImageIcon", esta nos permite introducir imágenes en nuestro entorno gráfico.
    import javax.swing.ImageIcon;

    // Importamos la funcionalidad "JLabel", esta nos permite crear etiquetas donde poner información para mostrar al usuario.
    import javax.swing.JLabel;

    // Importamos la funcionalidad "JButton", esta nos permite crear botones con diferentes funcionalidades.
    import javax.swing.JButton;

    // Importamos la funcionalidad "ActionListener", esta nos permite que los diferentes componentes escuchen a las acciones del usuario.
    import java.awt.event.ActionListener;

    // Importamos la funcionalidad "ActionEvent", esta nos permite crear la respuesta de los componentes al usuario.
    import java.awt.event.ActionEvent;

    // Importamos la "ClaseManejoCartera" para poder usar sus métodos y funciones.
    import Funcionalidades.ClaseManejoCartera;

    // Importamos la "ClaseDatosMercado" para poder usar sus métodos y funciones.
    import Funcionalidades.ClaseDatosMercado;

// CLASE MENU PRINCIPAL -----------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene el entorno gráfico del menú principal de nuestro programa.
    public class MenuPrincipal {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Para iniciar el entorno gráfico, primero debemos crear un método que lo contenga.
    public static void MétodoMenúPrincipal(){

        // Dentro del método vamos a crear un "JFrame", siendo esta la ventana que muestre toda la información.
        JFrame FrameMenúPrincipal = new JFrame();

            // Ahora vamos a determinar los ajustes del "JFrame".

            // Título
            FrameMenúPrincipal.setTitle("Mercado de CriptoMonedas");

            // Tamaño
            FrameMenúPrincipal.setSize(505, 270);

            // Localización
            FrameMenúPrincipal.setLocation(1, 1);

        // Ahora vamos a crear un "JPanel", este será el contenedor que incluya todos los componentes de nuestro entorno gráfico.
        JPanel PanelMenúPrincipal = new JPanel();

            // Determinamos los ajustes del "JPanel".

            // Layout
            PanelMenúPrincipal.setLayout(null);

            // Dentro del "JPanel" creamos los componentes necesarios para nuestro entorno gráfico.
            JButton BotónVerMercado = new JButton();

                // Determinamos los ajustes del "JButton".

                // Texto
                BotónVerMercado.setText("Comprueba como está el mercado!");

                // Tamaño
                BotónVerMercado.setSize(250, 100);

                // Localización
                BotónVerMercado.setLocation(10, 10);

                // Visibilidad 
                BotónVerMercado.setVisible(true);

            // Ahora vamos a crear un "ActionListener" para que el botón actúe a las acciones del usuario.
            BotónVerMercado.addActionListener(new ActionListener() {
                
                // Dentro del ActionListener usamos un @Override para crear un nuevo método.
                @Override

                // Ahora vamos a crear la respuesta del botón utilizando un "ActionPerformed".
                public void actionPerformed(ActionEvent AcciónBotónVerMercado){

                    // Aquí llamamos a la "ClaseDatosMercado" para que inicie el sistema lógico.
                    ClaseDatosMercado.MétodoDatosMercado();

                } // Fin del "ActionPerformed".

            }); // Fin del "ActionListener".

            // Añadimos el botón al "JPanel".
            PanelMenúPrincipal.add(BotónVerMercado);

            // Ahora creamos otro botón dentro del JPanel.
            JButton BotónVerCartera = new JButton();

                // Determinamos los ajustes del "JButton".

                // Texto
                BotónVerCartera.setText("Maneja tu cartera!");

                // Tamaño
                BotónVerCartera.setSize(250, 100);

                // Localización
                BotónVerCartera.setLocation(10, 120);

                // Visibilidad 
                BotónVerCartera.setVisible(true);

            // Ahora vamos a crear un "ActionListener" para que el botón actúe a las acciones del usuario.
            BotónVerCartera.addActionListener(new ActionListener() {
                
                // Dentro del ActionListener usamos un @Override para crear un nuevo método.
                @Override

                // Ahora vamos a crear la respuesta del botón utilizando un "ActionPerformed".
                public void actionPerformed(ActionEvent AcciónBotónVerCartera){

                   // Aquí vamos a llamar a la "ClaseManejoCartera" para iniciar el sistema lógico.
                   ClaseManejoCartera.MétodoManejoCartera();

                } // Fin del "ActionPerformed".

            }); // Fin del "ActionListener".

            // Añadimos el botón al "JPanel".
            PanelMenúPrincipal.add(BotónVerCartera);

            // Introducimos dentro de "JPanel" un "JLabel" que mostrará una imagen.
            JLabel LabelMenúPrincipal = new JLabel();

                // Determinamos los ajustes de "JLabel".
                
                // Imagen
                LabelMenúPrincipal.setIcon(new ImageIcon("Proyecto Criptomonedas/src/Imágenes/ImagenMenúPrincipal.jpg"));

                // Tamaño
                LabelMenúPrincipal.setSize(210, 210);

                // Localización
                LabelMenúPrincipal.setLocation(270, 10);

                // Visibilidad 
                LabelMenúPrincipal.setVisible(true);

            // Añadimos el "JLabel" al "JPanel".
            PanelMenúPrincipal.add(LabelMenúPrincipal);

        // Añadimos el "JPanel" al "JFrame".
        FrameMenúPrincipal.add(PanelMenúPrincipal);

        // Finalmente añadimos la visibilidad del frame.
        FrameMenúPrincipal.setVisible(true);

    } // Fin del "MétodoMenúPrincipal".

    } // Fin de la clase "MenúPrincipal".
