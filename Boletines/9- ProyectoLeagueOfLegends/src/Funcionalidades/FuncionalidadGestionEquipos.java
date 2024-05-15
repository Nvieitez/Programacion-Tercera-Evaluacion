// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package Funcionalidades;

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

    // Importamos la funcionalidad "JComboBox", esta nos permite crear desplegables con diferentes opciones.
    import javax.swing.JComboBox;

    // Importamos la funcionalidad "ItemListener", esta nos permite hacer que determinados componentes reaccionen ante el usuario.
    import java.awt.event.ItemListener;

    // Importamos la funcionalidad "ItemEvent", esta nos permite determinar la reacción de determinados componentes ante el usuario.
    import java.awt.event.ItemEvent;

// CLASE MENU PRINCIPAL -----------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene el entorno gráfico del menú principal de nuestro programa.
    public class FuncionalidadGestionEquipos{

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Para comenzar el sistema lógico, primero debemos crear un método.
    public static void MétodoGestiónPersonajes(){

        // Dentro del método, Primero vamos a declarar todos los componentes de nuestro entrono gráfico.
        JFrame FrameMenúGestiónPersonajes = new JFrame();
        JPanel PanelMenúGestiónPersonajes = new JPanel();
        JLabel LabelGestiónEquipos = new JLabel();
        JComboBox ComboGestiónPersonaje = new JComboBox<String>(new String[]{
            "Eldrin, el guardián de las estrellas", 
            "Zephyra, la Susurrante del Viento", 
            "Seraphina, la Luz de las Galaxias" });

        JComboBox LabelGestiónPosición = new JComboBox<String>(new String[]{
            "Linea Superior",
            "Linea Central",
            "Linea Inferior"});

        JComboBox LabelGestiónSkin = new JComboBox<String>(new String[]{
            "Skin Común",
            "Skin Rara",
            "Skin Legendaria"});

        // Ahora vamos a determinar los ajustes de cada componente.

// FRAME MENÚ GESTIÓN PERSONAJES --------------------------------------------------------------------------------------------------------------------

    // Título
    FrameMenúGestiónPersonajes.setTitle("Gestor de personajes");

    // Tamaño
    FrameMenúGestiónPersonajes.setSize(505, 270);

    // Localización
    FrameMenúGestiónPersonajes.setLocation(1, 1);

// PANEL MENÚ GESTIÓN PERSONAJES --------------------------------------------------------------------------------------------------------------------

    // Layout
    PanelMenúGestiónPersonajes.setLayout(null);

// COMBO GESTIÓN PERSONAJE --------------------------------------------------------------------------------------------------------------------------

    // Primero vamos a declarar un array que contenga la ruta de todas nuestras imágenes.
    ImageIcon [] ImágenesPersonajes;

    // Ahora vamos a inicializar las imágenes de los personajes de nuestro juego.
    ImágenesPersonajes = new ImageIcon[] {
        new ImageIcon("9- ProyectoLeagueOfLegends/src/Imágenes/Eldrin.jpg"),
        new ImageIcon("9- ProyectoLeagueOfLegends/src/Imágenes/Zephyra.jpg"),
        new ImageIcon("9- ProyectoLeagueOfLegends/src/Imágenes/Seraphina.jpg")

    }; // Fin del array "ImágenesPersonajes".

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

            LabelGestiónEquipos.setIcon(ImágenesPersonajes[ComboGestiónPersonaje.getSelectedIndex()]);

            // Aquí vamos a determinar la respuesta de cada selección.
            if (AcciónComboGestiónPersonaje.getStateChange() == ItemEvent.SELECTED) {

                // Dentro del "ItemEvent" primero vamos  a determinar que imagen se debe poner cuando cambias de opción.
                LabelGestiónEquipos.setIcon(ImágenesPersonajes[ComboGestiónPersonaje.getSelectedIndex()]);
                        
            } // Fin del "if".

        } // Fin del "ActionPerformed".

    }); // Fin del "ActionListener".

    // Añadimos el "JComboBox" al "JPanel".
    PanelMenúGestiónPersonajes.add(ComboGestiónPersonaje);

// COMBO GESTIÓN POSICIÓN ---------------------------------------------------------------------------------------------------------------------------

    // Determinamos los ajustes del "JComboBox".

        // Tamaño
        LabelGestiónPosición.setSize(250, 50);

        // Localización
        LabelGestiónPosición.setLocation(10, 70);

        // Visibilidad 
        LabelGestiónPosición.setVisible(true);

    // Añadimos el "JComboBox" al "JPanel".
    PanelMenúGestiónPersonajes.add(LabelGestiónPosición);

// COMBO GESTIÓN SKIN ---------------------------------------------------------------------------------------------------------------------------

    // Determinamos los ajustes del "JComboBox".

        // Tamaño
        LabelGestiónSkin.setSize(250, 50);

        // Localización
        LabelGestiónSkin.setLocation(10, 130);

        // Visibilidad 
        LabelGestiónSkin.setVisible(true);

    // Añadimos el "JComboBox" al "JPanel".
    PanelMenúGestiónPersonajes.add(LabelGestiónSkin);

// LABEL IMÁGENES PERSONAJES ------------------------------------------------------------------------------------------------------------------------
            
    // Imagen
    LabelGestiónEquipos.setIcon(ImágenesPersonajes[0]);

    // Tamaño
    LabelGestiónEquipos.setSize(210, 210);

    // Localización
    LabelGestiónEquipos.setLocation(270, 10);

    // Visibilidad 
    LabelGestiónEquipos.setVisible(true);

    // Añadimos el "JLabel" al "JPanel".
    PanelMenúGestiónPersonajes.add(LabelGestiónEquipos);

// INICIO JFRAME ------------------------------------------------------------------------------------------------------------------------------------

    // Añadimos el "JPanel" al "JFrame".
    FrameMenúGestiónPersonajes.add(PanelMenúGestiónPersonajes);

    // Finalmente añadimos la visibilidad del frame.
    FrameMenúGestiónPersonajes.setVisible(true);

    } // Fin del "MétodoGestiónPersonajes".

    } // Fin de la clase "FuncionalidadGestionPersonajes".
