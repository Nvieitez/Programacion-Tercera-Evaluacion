// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package Funcionalidades;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Primero vamos a importar la funcionalidad "JFrame", esta nos permite crear ventanas que muestren información al usuario.
    import javax.swing.JFrame;

    // Ahora vamos a importar la funcionalidad "JPanel", esta nos permite crear contenedores para los componentes del entorno gráfico.
    import javax.swing.JPanel;

    // Ahora vamos a importar la funcionalidad "JTextArea", esta nos permite crear cuadros de texto.
    import javax.swing.JTextArea;

    // Importamos la funcionalidad "ImageIcon", esta nos permite introducir imágenes en nuestro entorno gráfico.
    import javax.swing.ImageIcon;

    // Importamos la funcionalidad "JButton", esta nos permite crear botones con diferentes funcionalidades.
    import javax.swing.JButton;

    // Importamos la funcionalidad "JLabel", esta nos permite crear etiquetas donde poner información para mostrar al usuario.
    import javax.swing.JLabel;

    // Importamos la funcionalidad "JComboBox", esta nos permite crear desplegables con diferentes opciones.
    import javax.swing.JComboBox;

    // Importamos la funcionalidad "ItemListener", esta nos permite hacer que determinados componentes reaccionen ante el usuario.
    import java.awt.event.ItemListener;

    // Importamos la funcionalidad "ItemEvent", esta nos permite determinar la reacción de determinados componentes ante el usuario.
    import java.awt.event.ItemEvent;

    // Importamos la funcionalidad "ActionListener", esta nos permite que los diferentes componentes escuchen a las acciones del usuario.
    import java.awt.event.ActionListener;

    // Importamos la funcionalidad "ActionEvent", esta nos permite crear la respuesta de los componentes al usuario.
    import java.awt.event.ActionEvent;

    // Importamos la funcionalidad "Random", esta nos permite darle un valor aleatorio a una variable.
    import java.util.Random;

// CLASE MENU PRINCIPAL -----------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene el entorno gráfico del menú principal de nuestro programa.
    public class FuncionalidadGestionPeleas{

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Para comenzar el sistema lógico, primero debemos crear un método.
    public static void MétodoGestiónPeleas(){

        // Dentro del método, Primero vamos a declarar todos los componentes de nuestro entrono gráfico.
        JFrame FrameMenúGestiónPeleas = new JFrame();
        JPanel PanelMenúGestiónPeleas = new JPanel();
        JLabel LabelGestiónPeleas = new JLabel();
        JButton BotónGestiónPeleas = new JButton();
        JComboBox ComboGestiónPersonaje = new JComboBox<String>(new String[]{
            "Hechicero de la Llama Eterna",                                      
            "Guardián de la Sombra Eterna", 
            "Cazador de Pesadillas" });

        JTextArea TextoPeleas = new JTextArea();

// FRAME MENÚ GESTIÓN PELEAS ------------------------------------------------------------------------------------------------------------------------

    // Título
    FrameMenúGestiónPeleas.setTitle("Gestor de Peleas");

    // Tamaño
    FrameMenúGestiónPeleas.setSize(505, 270);

    // Localización
    FrameMenúGestiónPeleas.setLocation(1, 1);

// PANEL MENÚ GESTIÓN PELEAS ------------------------------------------------------------------------------------------------------------------------

    // Layout
    PanelMenúGestiónPeleas.setLayout(null);

// COMBO GESTIÓN PERSONAJE --------------------------------------------------------------------------------------------------------------------------

    // Primero vamos a declarar un array que contenga la ruta de todas nuestras imágenes.
    ImageIcon [] ImágenesClases;

    // Ahora vamos a inicializar las imágenes de las Peleas de nuestro juego.
    ImágenesClases = new ImageIcon[] {
        new ImageIcon("10- ProyectoEldenRing/src/Imágenes/Hechicero.jpg"),
        new ImageIcon("10- ProyectoEldenRing/src/Imágenes/Guardián.jpg"),
        new ImageIcon("10- ProyectoEldenRing/src/Imágenes/Cazador.jpg")

    }; // Fin del array "ImágenesPeleas".

    // Creamos un array que contenga los ataques de cada personaje.
    Integer [] AtaquePersonajes;

    // Añadimos datos al nuevo array.

    AtaquePersonajes = new Integer[]{
        new Integer(6),
        new Integer(8),
        new Integer(7)

    }; // Fin del array "AtaquePersonajes".

    // Determinamos los ajustes del "JComboBox".

        // Tamaño
        ComboGestiónPersonaje.setSize(250, 50);

        // Localización
        ComboGestiónPersonaje.setLocation(10, 10);

        // Visibilidad 
        ComboGestiónPersonaje.setVisible(true);

    // Ahora vamos a crear un "ActionListener" para que el JComboBox actúe a las acciones del usuario.
    ComboGestiónPersonaje.addItemListener(new ItemListener() {

        // Ahora vamos a crear la respuesta del JComboBox utilizando un "ActionPerformed".
        public void itemStateChanged(ItemEvent AcciónComboGestiónPersonaje){

            // Cargamos el icono antes de que se cambie el JComboBox.
            LabelGestiónPeleas.setIcon(ImágenesClases[ComboGestiónPersonaje.getSelectedIndex()]);

            // Aquí vamos a determinar la respuesta de cada selección.
            if (AcciónComboGestiónPersonaje.getStateChange() == ItemEvent.SELECTED) {

                // Dentro del "ItemEvent" primero vamos a borrar todo el texto que se encuentre dentro del cuadro de texto
                TextoPeleas.setText("");

                // Ahora vamos a determinar que imagen se debe poner cuando cambias de opción.
                LabelGestiónPeleas.setIcon(ImágenesClases[ComboGestiónPersonaje.getSelectedIndex()]);
                TextoPeleas.append("Ataque: " + AtaquePersonajes[ComboGestiónPersonaje.getSelectedIndex()]);
                        
            } // Fin del "if".

        } // Fin del "ActionPerformed".

    }); // Fin del "ActionListener".

    // Añadimos el "JComboBox" al "JPanel".
    PanelMenúGestiónPeleas.add(ComboGestiónPersonaje);

// BOTÓN GESTIONAR PELEAS -----------------------------------------------------------------------------------------------------------------------------

    // Texto
    BotónGestiónPeleas.setText("Pelea!");

    // Tamaño
    BotónGestiónPeleas.setSize(250, 50);

    // Localización
    BotónGestiónPeleas.setLocation(10, 70);

    // Visibilidad 
    BotónGestiónPeleas.setVisible(true);

    // Ahora vamos a crear un "ActionListener" para que el botón actúe a las acciones del usuario.
    BotónGestiónPeleas.addActionListener(new ActionListener() {

        // Dentro del ActionListener usamos un @Override para crear un nuevo método.
        @Override

        // Ahora vamos a crear la respuesta del botón utilizando un "ActionPerformed".
        public void actionPerformed(ActionEvent AcciónBotónGestiónPeleas){

            // Aquí vamos a hacer el sistema lógico de las peleas.

            // Primero vamos a declarar el ataque del enemigo.
            int AtaqueEnemigo = 0;

            // Ahora vamos a crear un objeto "Random".
            Random Random = new Random();

            // Limpiamos el texto de las batallas anteriores.
            TextoPeleas.setText("Ataque: " + AtaquePersonajes[ComboGestiónPersonaje.getSelectedIndex()]);

            // Convertimos la variable en un número aleatorio del 1 al 10.
            AtaqueEnemigo = Random.nextInt(10);

            // Imprimimos en el cuadro de texto el nuevo valor.
            TextoPeleas.append("\n\nHa aparecido un enemigo, ataque: " + AtaqueEnemigo);

            // Ahora creamos un condicional que determina el resultado de la pelea.
            if (AtaqueEnemigo < AtaquePersonajes[ComboGestiónPersonaje.getSelectedIndex()]){

                // Resultado si tu ataque es mayor al del enemigo.
                TextoPeleas.append("\n\nGanaste!!!");

            }

            else {

                // Resultado si tu ataque es menor al de tu enemigo.
                TextoPeleas.append("\n\nPerdiste!!!");

            } // Fin del condicional "If".

        } // Fin del "ActionPerformed".

    }); // Fin del "ActionListener".

    // Añadimos el botón al "JPanel".
    PanelMenúGestiónPeleas.add(BotónGestiónPeleas);

// TEXTO PELEAS ------------------------------------------------------------------------------------------------------------------------------------

    // Contenido
    TextoPeleas.setText("Ataque: " + AtaquePersonajes[0]);

    // Tamaño
    TextoPeleas.setSize(250, 90);

    // Localización
    TextoPeleas.setLocation(10, 130);

    // Final
    TextoPeleas.setLineWrap(true);

    // Espacio
    TextoPeleas.setWrapStyleWord(true);

    // Visibilidad 
    TextoPeleas.setVisible(true);
            
    // Añadimos el texto al "JPanel".
    PanelMenúGestiónPeleas.add(TextoPeleas);

// LABEL IMÁGENES PELEAS ----------------------------------------------------------------------------------------------------------------------------
            
    // Imagen
    LabelGestiónPeleas.setIcon(ImágenesClases[0]);

    // Tamaño
    LabelGestiónPeleas.setSize(210, 210);

    // Localización
    LabelGestiónPeleas.setLocation(270, 10);

    // Visibilidad 
    LabelGestiónPeleas.setVisible(true);

    // Añadimos el "JLabel" al "JPanel".
    PanelMenúGestiónPeleas.add(LabelGestiónPeleas);

// INICIO JFRAME ------------------------------------------------------------------------------------------------------------------------------------

    // Añadimos el "JPanel" al "JFrame".
    FrameMenúGestiónPeleas.add(PanelMenúGestiónPeleas);

    // Finalmente añadimos la visibilidad del frame.
    FrameMenúGestiónPeleas.setVisible(true);

    } // Fin del "MétodoGestiónPeleas".

    } // Fin de la clase "FuncionalidadGestionPeleas".

