// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a determinar la localización de nuestra clase, esto nos permite dividir nuestro programa y hacerlo más ágil.
    package Funcionalidades;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las diferentes funcionalidades que permiten el correcto funcionamiento de nuestro programa.

    // Primero vamos a importar la funcionalidad "JFrame", esta nos permite crear ventanas que muestren información al usuario.
    import javax.swing.JFrame;

    // Ahora vamos a importar la funcionalidad "JPanel", esta nos permite crear contenedores para los componentes del entorno gráfico.
    import javax.swing.JPanel;

    // Importamos la funcionalidad "JTextArea", esta nos permite crear espacios donde mostrar texto al usuario.
    import javax.swing.JTextArea;

    // Importamos la funcionalidad "ImageIcon", esta nos permite introducir imágenes en nuestro entorno gráfico.
    import javax.swing.ImageIcon;

    // Importamos la funcionalidad "JLabel", esta nos permite crear etiquetas donde poner información para mostrar al usuario.
    import javax.swing.JLabel;

    // Importamos la funcionalidad "JButton", esta nos permite crear botones con diferentes funcionalidades.
    import javax.swing.JButton;

    // Importamos la funcionalidad "JOptionPane", esta nos permite mostrar e introducir datos por pantalla.
    import javax.swing.JOptionPane;

    // Importamos la funcionalidad "ActionListener", esta nos permite que los diferentes componentes escuchen a las acciones del usuario.
    import java.awt.event.ActionListener;

    // Importamos la funcionalidad "ActionEvent", esta nos permite crear la respuesta de los componentes al usuario.
    import java.awt.event.ActionEvent;

// CLASE MANEJO CARTERA -----------------------------------------------------------------------------------------------------------------------------

    // Esta clase se encargará del sistema lógico de la cartera.
    public class ClaseManejoCartera {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

    // Primero vamos a declarar una variable de tipo "Int" que recoja el valor dentro de la cartera.
    static int DineroCartera = 100;

// INICIO DEL CÓDIGO --------------------------------------------------------------------------------------------------------------------------------

    // Para iniciar el entorno gráfico, primero debemos crear un método que lo contenga.
    public static void MétodoManejoCartera(){

        // Dentro del método vamos a crear un "JFrame", siendo esta la ventana que muestre toda la información.
        JFrame FrameMenúCartera = new JFrame();

            // Ahora vamos a determinar los ajustes del "JFrame".

            // Título
            FrameMenúCartera.setTitle("Maneja tu cartera!");

            // Tamaño
            FrameMenúCartera.setSize(505, 270);

            // Localización
            FrameMenúCartera.setLocation(1, 1);

        // Ahora vamos a crear un "JPanel", este será el contenedor que incluya todos los componentes de nuestro entorno gráfico.
        JPanel PanelMenúCartera = new JPanel();

            // Determinamos los ajustes del "JPanel".

            // Layout
            PanelMenúCartera.setLayout(null);

            // Dentro del "JPanel" creamos los componentes necesarios para nuestro entorno gráfico.
            JButton BotónIntroducirDinero = new JButton();

                // Determinamos los ajustes del "JButton".

                // Texto
                BotónIntroducirDinero.setText("Introduce dinero a tu cartera!");

                // Tamaño
                BotónIntroducirDinero.setSize(250, 100);

                // Localización
                BotónIntroducirDinero.setLocation(10, 10);

                // Visibilidad 
                BotónIntroducirDinero.setVisible(true);

            // Ahora vamos a crear un "ActionListener" para que el botón actúe a las acciones del usuario.
            BotónIntroducirDinero.addActionListener(new ActionListener() {
                
                // Dentro del ActionListener usamos un @Override para crear un nuevo método.
                @Override

                // Ahora vamos a crear la respuesta del botón utilizando un "ActionPerformed".
                public void actionPerformed(ActionEvent AcciónBotónIntroducirDinero){

                    // Añadimos un JOptionPane para que el usuario introduzca el dinero por consola.
                    DineroCartera = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero quieres introducir?"));

                    // Eliminamos la ventana anterior para que no se creen ventanas infinitas.
                    FrameMenúCartera.dispose();

                    // Creamos la nueva ventana actualizada. 
                    ClaseManejoCartera.MétodoManejoCartera();

                } // Fin del "ActionPerformed".

            }); // Fin del "ActionListener".

            // Añadimos el botón al "JPanel".
            PanelMenúCartera.add(BotónIntroducirDinero);

            // Ahora creamos otro botón dentro del JPanel.
            JButton BotónRetirarDinero = new JButton();

                // Determinamos los ajustes del "JButton".

                // Texto
                BotónRetirarDinero.setText("Retira tu dinero!");

                // Tamaño
                BotónRetirarDinero.setSize(250, 100);

                // Localización
                BotónRetirarDinero.setLocation(10, 120);

                // Visibilidad 
                BotónRetirarDinero.setVisible(true);

            // Ahora vamos a crear un "ActionListener" para que el botón actúe a las acciones del usuario.
            BotónRetirarDinero.addActionListener(new ActionListener() {
                
                // Dentro del ActionListener usamos un @Override para crear un nuevo método.
                @Override

                // Ahora vamos a crear la respuesta del botón utilizando un "ActionPerformed".
                public void actionPerformed(ActionEvent AcciónBotónRetirarDinero){

                    // Aquí vamos a crear el sistema lógico de retirar el dinero de tu cartera.
                    DineroCartera = 0;

                    // Eliminamos la ventana anterior para que no se creen ventanas infinitas.
                    FrameMenúCartera.dispose();

                    // Creamos la nueva ventana actualizada. 
                    ClaseManejoCartera.MétodoManejoCartera();

                } // Fin del "ActionPerformed".

            }); // Fin del "ActionListener".

            // Añadimos el botón al "JPanel".
            PanelMenúCartera.add(BotónRetirarDinero);

            // Introducimos dentro de "JPanel" un "JLabel" que mostrará una imagen.
            JLabel LabelMenúCartera = new JLabel();

                // Determinamos los ajustes de "JLabel".
                
                // Imagen
                LabelMenúCartera.setIcon(new ImageIcon("Proyecto Criptomonedas/src/Imágenes/ImagenMenúCartera.jpg"));

                // Tamaño
                LabelMenúCartera.setSize(210, 170);

                // Localización
                LabelMenúCartera.setLocation(270, 10);

                // Visibilidad 
                LabelMenúCartera.setVisible(true);

            // Añadimos el "JLabel" al "JPanel".
            PanelMenúCartera.add(LabelMenúCartera);

            // Introducimos dentro de "JPanel" un "JTextArea" que mostrará la información de la cartera.
            JTextArea TextoMenúCartera = new JTextArea();

                // Determinamos los ajustes de "JTextArea".
                TextoMenúCartera.append("Dinero en cartera: " + DineroCartera + " €");
                
                // Tamaño
                TextoMenúCartera.setBounds(270,190,210,30);

                // Visibilidad 
                TextoMenúCartera.setVisible(true);

            // Añadimos el "JTextArea" al "JPanel".
            PanelMenúCartera.add(TextoMenúCartera);

        // Añadimos el "JPanel" al "JFrame".
        FrameMenúCartera.add(PanelMenúCartera);

        // Finalmente añadimos la visibilidad del frame.
        FrameMenúCartera.setVisible(true);

    } // Fin del "MétodoManejoCartera".

    } // Fin de la "ClaseManejoCartera".

