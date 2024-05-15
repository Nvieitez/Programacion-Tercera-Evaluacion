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
    public class FuncionalidadGestionPersonajes{

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Para comenzar el sistema lógico, primero debemos crear un método.
    public static void MétodoGestiónPersonajes(){

        // Dentro del método, Primero vamos a declarar todos los componentes de nuestro entrono gráfico.
        JFrame FrameMenúGestiónPersonajes = new JFrame();
        JPanel PanelMenúGestiónPersonajes = new JPanel();
        JLabel LabelGestiónPersonajes = new JLabel();
        JComboBox ComboGestiónPersonaje = new JComboBox<String>(new String[]{
            "Eldrin, el guardián de las estrellas", 
            "Zephyra, la Susurrante del Viento", 
            "Seraphina, la Luz de las Galaxias" });
            
        JTextArea TextoPersonajes = new JTextArea();

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

    // Creamos un segundo array que contenga el texto de cada personaje.
    String [] HistoriasPersonajes;

    // Iniciamos la variable y le damos datos.
    HistoriasPersonajes = new String[]{
        new String(""" 
        Eldrin era un simple mortal que vivía en una aldea tranquila en las montañas de Freljord.

        Su vida cambió para siempre cuando un meteorito cayó del cielo. Impulsado por la curiosidad, fue el primero en llegar al lugar del impacto y encontró un cristal brillante en el centro del cráter. Al tocar el cristal, Eldrin fue imbuido con el poder de las estrellas.
        """),

        new String("""
        Zephyra nació en las altas cumbres de las montañas de Ionia.

        Desde pequeña, Zephyra tenía una conexión especial con el viento. Con el tiempo, esta conexión se hizo más fuerte y Zephyra descubrió que podía controlar los vientos a su antojo. Ahora, como la Susurrante del Viento, usa sus poderes para proteger a Ionia.
        """),

        new String("""
        Seraphina era una joven astrónoma en la ciudad de Piltover.

        Un día, mientras observaba las estrellas, un cometa pasó y dejó caer un fragmento de cristal estelar. Recogió el cristal y fue imbuida con el poder de las galaxias. Ahora, como la Luz de las Galaxias, usa sus poderes para iluminar el camino hacia un futuro mejor.
        """)

    }; // Fin del array "HistoriasPersonajes".

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

            LabelGestiónPersonajes.setIcon(ImágenesPersonajes[ComboGestiónPersonaje.getSelectedIndex()]);

            // Aquí vamos a determinar la respuesta de cada selección.
            if (AcciónComboGestiónPersonaje.getStateChange() == ItemEvent.SELECTED) {

                // Dentro del "ItemEvent" primero vamos a borrar todo el texto que se encuentre dentro del cuadro de texto
                TextoPersonajes.setText("");

                // Ahora vamos a determinar que imagen se debe poner cuando cambias de opción.
                LabelGestiónPersonajes.setIcon(ImágenesPersonajes[ComboGestiónPersonaje.getSelectedIndex()]);

                // Determinamos que dato se debe poner cuando cambias de opción.
                TextoPersonajes.append(HistoriasPersonajes[ComboGestiónPersonaje.getSelectedIndex()]);
                        
            } // Fin del "if".

        } // Fin del "ActionPerformed".

    }); // Fin del "ActionListener".

    // Añadimos el "JComboBox" al "JPanel".
    PanelMenúGestiónPersonajes.add(ComboGestiónPersonaje);

//  TEXTO PERSONAJES --------------------------------------------------------------------------------------------------------------------------------

    // Contenido
    TextoPersonajes.setText(HistoriasPersonajes[0]);

    // Tamaño
    TextoPersonajes.setSize(250, 150);

    // Localización
    TextoPersonajes.setLocation(10, 70);

    // Final
    TextoPersonajes.setLineWrap(true);

    // Espacio
    TextoPersonajes.setWrapStyleWord(true);

    // Visibilidad 
    TextoPersonajes.setVisible(true);
            
    // Añadimos el texto al "JPanel".
    PanelMenúGestiónPersonajes.add(TextoPersonajes);

// LABEL IMÁGENES PERSONAJES ------------------------------------------------------------------------------------------------------------------------
            
    // Imagen
    LabelGestiónPersonajes.setIcon(ImágenesPersonajes[0]);

    // Tamaño
    LabelGestiónPersonajes.setSize(210, 210);

    // Localización
    LabelGestiónPersonajes.setLocation(270, 10);

    // Visibilidad 
    LabelGestiónPersonajes.setVisible(true);

    // Añadimos el "JLabel" al "JPanel".
    PanelMenúGestiónPersonajes.add(LabelGestiónPersonajes);

// INICIO JFRAME ------------------------------------------------------------------------------------------------------------------------------------

    // Añadimos el "JPanel" al "JFrame".
    FrameMenúGestiónPersonajes.add(PanelMenúGestiónPersonajes);

    // Finalmente añadimos la visibilidad del frame.
    FrameMenúGestiónPersonajes.setVisible(true);

    } // Fin del "MétodoGestiónPersonajes".

    } // Fin de la clase "FuncionalidadGestionPersonajes".

