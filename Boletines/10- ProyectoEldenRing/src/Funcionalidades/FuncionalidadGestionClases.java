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
    public class FuncionalidadGestionClases{

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Para comenzar el sistema lógico, primero debemos crear un método.
    public static void MétodoGestiónClases(){

        // Dentro del método, Primero vamos a declarar todos los componentes de nuestro entrono gráfico.
        JFrame FrameMenúGestiónClases = new JFrame();
        JPanel PanelMenúGestiónClases = new JPanel();
        JLabel LabelGestiónClases = new JLabel();
        JComboBox ComboGestiónPersonaje = new JComboBox<String>(new String[]{
            "Hechicero de la Llama Eterna",                                      
            "Guardián de la Sombra Eterna", 
            "Cazador de Pesadillas" });

        JTextArea TextoClases = new JTextArea();

// FRAME MENÚ GESTIÓN CLASES ------------------------------------------------------------------------------------------------------------------------

    // Título
    FrameMenúGestiónClases.setTitle("Gestor de Clases");

    // Tamaño
    FrameMenúGestiónClases.setSize(505, 270);

    // Localización
    FrameMenúGestiónClases.setLocation(1, 1);

// PANEL MENÚ GESTIÓN CLASES ------------------------------------------------------------------------------------------------------------------------

    // Layout
    PanelMenúGestiónClases.setLayout(null);

// COMBO GESTIÓN CLASES -----------------------------------------------------------------------------------------------------------------------------

    // Primero vamos a declarar un array que contenga la ruta de todas nuestras imágenes.
    ImageIcon [] ImágenesClases;

    // Ahora vamos a inicializar las imágenes de las clases de nuestro juego.
    ImágenesClases = new ImageIcon[] {
        new ImageIcon("10- ProyectoEldenRing/src/Imágenes/Hechicero.jpg"),
        new ImageIcon("10- ProyectoEldenRing/src/Imágenes/Guardián.jpg"),
        new ImageIcon("10- ProyectoEldenRing/src/Imágenes/Cazador.jpg")

    }; // Fin del array "ImágenesClases".

    // Creamos un segundo array que contenga los atributos de cada clase.
    String [] AtributosClases;

    // Iniciamos la variable y le damos datos.
    AtributosClases = new String[]{
        new String(""" 
            Atributos: 

            - Vitalidad: 10
            - Resistencia: 8
            - Fuerza: 6
            - Destreza: 9
            - Inteligencia: 15
            - Fe: 12
            - Suerte: 7
        """),

        new String("""
            Atributos:

            - Vitalidad: 12
            - Resistencia: 10
            - Fuerza: 8
            - Destreza: 7
            - Inteligencia: 10
            - Fe: 14
            - Suerte: 6
        """),

        new String("""
            Atributos:

            - Vitalidad: 11
            - Resistencia: 13
            - Fuerza: 7
            - Destreza: 14
            - Inteligencia: 8
            - Fe: 10
            - Suerte: 6
        """)

    }; // Fin del array "AtributosClases".

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

            LabelGestiónClases.setIcon(ImágenesClases[ComboGestiónPersonaje.getSelectedIndex()]);

            // Aquí vamos a determinar la respuesta de cada selección.
            if (AcciónComboGestiónPersonaje.getStateChange() == ItemEvent.SELECTED) {

                // Dentro del "ItemEvent" primero vamos a borrar todo el texto que se encuentre dentro del cuadro de texto
                TextoClases.setText("");

                // Ahora vamos a determinar que imagen se debe poner cuando cambias de opción.
                LabelGestiónClases.setIcon(ImágenesClases[ComboGestiónPersonaje.getSelectedIndex()]);

                // Determinamos que dato se debe poner cuando cambias de opción.
                TextoClases.append(AtributosClases[ComboGestiónPersonaje.getSelectedIndex()]);
                        
            } // Fin del "if".

        } // Fin del "ActionPerformed".

    }); // Fin del "ActionListener".

    // Añadimos el "JComboBox" al "JPanel".
    PanelMenúGestiónClases.add(ComboGestiónPersonaje);

// TEXTO ClASES ------------------------------------------------------------------------------------------------------------------------------------

    // Contenido
    TextoClases.setText(AtributosClases[0]);

    // Tamaño
    TextoClases.setSize(250, 150);

    // Localización
    TextoClases.setLocation(10, 70);

    // Final
    TextoClases.setLineWrap(true);

    // Espacio
    TextoClases.setWrapStyleWord(true);

    // Visibilidad 
    TextoClases.setVisible(true);
            
    // Añadimos el texto al "JPanel".
    PanelMenúGestiónClases.add(TextoClases);

// LABEL IMÁGENES CLASES ----------------------------------------------------------------------------------------------------------------------------
            
    // Imagen
    LabelGestiónClases.setIcon(ImágenesClases[0]);

    // Tamaño
    LabelGestiónClases.setSize(210, 210);

    // Localización
    LabelGestiónClases.setLocation(270, 10);

    // Visibilidad 
    LabelGestiónClases.setVisible(true);

    // Añadimos el "JLabel" al "JPanel".
    PanelMenúGestiónClases.add(LabelGestiónClases);

// INICIO JFRAME ------------------------------------------------------------------------------------------------------------------------------------

    // Añadimos el "JPanel" al "JFrame".
    FrameMenúGestiónClases.add(PanelMenúGestiónClases);

    // Finalmente añadimos la visibilidad del frame.
    FrameMenúGestiónClases.setVisible(true);

    } // Fin del "MétodoGestiónClases".

    } // Fin de la clase "FuncionalidadGestionClases".

