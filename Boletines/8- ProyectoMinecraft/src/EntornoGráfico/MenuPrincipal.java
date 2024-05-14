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

    // Importamos la "ClaseGestiónMateriales" para poder usar sus métodos y funcionalidades.
    import Funcionalidades.ClaseGestionMateriales;

    // Importamos la "ClaseGestiónProyectos" para poder usar sus métodos y funcionalidades.
    import Funcionalidades.ClaseGestionProyectos;

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
            FrameMenúPrincipal.setTitle("Minecraft Simulator");

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
            JButton BotónGestionarMateriales = new JButton();

                // Determinamos los ajustes del "JButton".

                // Texto
                BotónGestionarMateriales.setText("Gestiona los materiales de tu partida!");

                // Tamaño
                BotónGestionarMateriales.setSize(250, 100);

                // Localización
                BotónGestionarMateriales.setLocation(10, 10);

                // Visibilidad 
                BotónGestionarMateriales.setVisible(true);

            // Ahora vamos a crear un "ActionListener" para que el botón actúe a las acciones del usuario.
            BotónGestionarMateriales.addActionListener(new ActionListener() {
                
                // Dentro del ActionListener usamos un @Override para crear un nuevo método.
                @Override

                // Ahora vamos a crear la respuesta del botón utilizando un "ActionPerformed".
                public void actionPerformed(ActionEvent AcciónBotónGestionarMateriales){

                    // Aquí llamamos a la "ClaseGestiónMateriales", esta contiene todo el sistema lógico.
                    ClaseGestionMateriales.MétodoGestiónMateriales();

                } // Fin del "ActionPerformed".

            }); // Fin del "ActionListener".

            // Añadimos el botón al "JPanel".
            PanelMenúPrincipal.add(BotónGestionarMateriales);

            // Ahora creamos otro botón dentro del JPanel.
            JButton BotónGestionarProyectos = new JButton();

                // Determinamos los ajustes del "JButton".

                // Texto
                BotónGestionarProyectos.setText("Maneja tus proyectos!");

                // Tamaño
                BotónGestionarProyectos.setSize(250, 100);

                // Localización
                BotónGestionarProyectos.setLocation(10, 120);

                // Visibilidad 
                BotónGestionarProyectos.setVisible(true);

            // Ahora vamos a crear un "ActionListener" para que el botón actúe a las acciones del usuario.
            BotónGestionarProyectos.addActionListener(new ActionListener() {
                
                // Dentro del ActionListener usamos un @Override para crear un nuevo método.
                @Override

                // Ahora vamos a crear la respuesta del botón utilizando un "ActionPerformed".
                public void actionPerformed(ActionEvent AcciónBotónGestionarProyectos){

                   // Aquí llamamos a la "ClaseGestiónProyectos", esta contiene todo el sistema lógico.
                   ClaseGestionProyectos.MétodoGestiónProyectos();

                } // Fin del "ActionPerformed".

            }); // Fin del "ActionListener".

            // Añadimos el botón al "JPanel".
            PanelMenúPrincipal.add(BotónGestionarProyectos);

            // Introducimos dentro de "JPanel" un "JLabel" que mostrará una imagen.
            JLabel LabelMenúPrincipal = new JLabel();

                // Determinamos los ajustes de "JLabel".
                
                // Imagen
                LabelMenúPrincipal.setIcon(new ImageIcon("8- ProyectoMinecraft/src/Imágenes/ImagenMenúPrincipal.jpg"));

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
