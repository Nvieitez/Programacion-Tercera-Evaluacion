// PAQUETE ====================================================================================================================================================

    // Aquí definiremos la ruta de nuestra clase, para poder dividir y optimizar el código.
    package EntornoGráfico;
    
// IMPORTS ====================================================================================================================================================

    // Aquí podremos importar diferentes librerías que añadirán funciones a nuestro programa.

    // Primero vamos a importar la funcionalidad "JFrame" para poder crear entornos gráficos complejos.
    import javax.swing.JFrame;

    import Funcionalidades.ClaseCrearNuevaMision;

    // Importamos la funcionalidad "FlowLayout" para que nuestro programa se muestre en el orden que añadimos los componentes.
    import java.awt.FlowLayout;

    // Vamos a importar la funcionalidad "JButton" para poder crear botones funcionales.
    import javax.swing.JButton;

    // Vamos a importar la funcionalidad "ActionListener" para que nuestros componentes puedan escuchar a las acciones del usuario.
    import java.awt.event.ActionListener;

    // Vamos a importar la funcionalidad "ActionEvent" para que el componente responda a las acciones del usuario.
    import java.awt.event.ActionEvent;
    
// CLASE CLASE ENTORNO GRÁFICO ================================================================================================================================

    // Aquí diseñaremos el entorno gráfico de nuestro programa, por el cual se manejará el usuario.
    public class ClaseEntornoGrafico extends JFrame {

    // DECLARACIONES ==========================================================================================================================================

        // Aquí declararemos todas las variables necesarias para que el programa funcione correctamente.

            // BOTONES ========================================================================================================================================

                // Aquí vamos a declarar los botones que vamos a usar en nuestro programa.

                // Primero vamos a declarar un botón que nos permita crear las misiones.
                private JButton BotónCrearMisión;

                // Ahora vamos a crear un botón que nos permita ver el estado de las diferentes misiones que creemos.
                private JButton BotónVerDatosMisiones;

    // COMIENZO DEL CÓDIGO ====================================================================================================================================

        // Para crear el entorno gráfico primero debemos crear un constructor.

        // CONSTRUCTOR ========================================================================================================================================

            // Primero declaramos el constructor.
            public ClaseEntornoGrafico (){

                // Dentro del constructor parametrizado vamos a crear el entorno gráfico.

                // Primero vamos a crear un nuevo "JFrame" que se encargará de incluir todos los componentes dentro de nuestro entorno gráfico.
                JFrame MenúPrincipal = new JFrame();
                
                // Ahora vamos a crear los diferentes botones y a añadirlos al programa.

                // BOTÓN CREAR MISIÓN =========================================================================================================================

                    // Primero tenemos que declararlo dentro del constructor.
                    BotónCrearMisión = new JButton();

                    // Ahora vamos a darle un texto y hacer que se vea.
                    BotónCrearMisión.setText("      Crear una misión      ");
                    BotónCrearMisión.setVisible(true);

                    // Añadimos un "ActionListener" para que escuche las acciones del usuario y pueda responder a ellas.
                    BotónCrearMisión.addActionListener(new ActionListener(){

                        // Dentro del "ActionListener" ponemos un "Override" para que recoja los datos de la super clase.
                        @Override

                        // Aquí declaramos un "ActionPerformed", este nos permite crear la acción de respuesta que tendrá el botón.
                        public void actionPerformed(ActionEvent AcciónBotónCrearMisión) {
                            
                            // Dentro del "ActionPerformed" llamaremos a la "ClaseCrearNuevaMision", que contiene todo el sistema lógico.
                            new ClaseCrearNuevaMision(getName(), getName(), getName(), getName(), getTitle(), getWarningString(), getName());
                            
                        } // Fin del "ActionPerformed".
                        
                    }); // Fin del "ActionListener".

                // BOTÓN VER DATOS MISIONES ===================================================================================================================

                    // Primero tenemos que declararlo dentro del constructor.
                    BotónVerDatosMisiones = new JButton();

                    // Ahora vamos a darle un texto y hacer que se vea.
                    BotónVerDatosMisiones.setText("Ver datos de una misión");
                    BotónVerDatosMisiones.setVisible(true);

                    // Ahora añadimos un "ActionListener" para que escuche las acciones del usuario y pueda responder a ellas.
                    BotónVerDatosMisiones.addActionListener(new ActionListener(){

                        // Dentro del "ActionListener" ponemos un "Override" para que recoja los datos de la super clase.
                        @Override

                        // Aquí declaramos un "ActionPerformed", este nos permite crear la acción de respuesta que tendrá el botón.
                        public void actionPerformed(ActionEvent AcciónBotónVerDatosMisiones) {
                            
                            // TODO.
                            
                        } // Fin del "ActionPerformed".

                    }); // Fin del "ActionListener".

                // VENTANA ====================================================================================================================================

                    // Aquí vamos a declarar los ajustes que tenga la ventana.
                    MenúPrincipal.setTitle("Simulador de misiones: NASA");
                    MenúPrincipal.setSize(300, 150);
                    MenúPrincipal.setLocation(500, 300);
                    MenúPrincipal.setVisible(true);

                    // Aquí vamos a añadir los botones
                    MenúPrincipal.add(BotónCrearMisión);
                    MenúPrincipal.add(BotónVerDatosMisiones);

                    // Finalmente declaramos que tipo de LayOut queremos que tenga nuestro entorno gráfico
                    MenúPrincipal.getContentPane().setLayout(new FlowLayout());

            } // Fin del constructor parametrizado.

        } // Fin de la "ClaseEntornoGrafico".
