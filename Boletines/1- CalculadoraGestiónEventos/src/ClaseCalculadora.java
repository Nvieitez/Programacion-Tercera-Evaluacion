// IMPORTS ======================================================================================================================

    // Importamos javax.swing para mostrar en pantalla las diferentes funciones.
    import javax.swing.*;

    // Importamos java.awt que nos permite crear interfaces gráficas.
    import java.awt.*;

    // Importamos java.awt.event que nos permite crear eventos que respondan a una situación concreta.
    import java.awt.event.*;

// CLASE CALCULADORA ============================================================================================================

    // La clase calculadora la debemos extenderse de JFrame, la librería gráfica, que permite imprimir por pantalla.
    
    public class ClaseCalculadora extends JFrame{

// DECLARACIONES ================================================================================================================

        // Dentro de la clase calculadora introducimos las partes gráficas que tendrá el programa.

        // Declaramos un campo de texto para introducir el primer valor a calcular.
        private JTextField CampoValor1;

        // Declaramos un segundo campo de texto para introducir el segundo valor a calcular.
        private JTextField CampoValor2;

        // Declaramos el botón que se encargará de hacer la suma de los valores.
        private JButton BotónSumar;

        // Declaramos el botón que se encargará de hacer la resta de los valores.
        private JButton BotónRestar;

        // Declaramos el area de texto donde se imprimirá el resultado del cálculo.
        private JTextArea AreaResultado;

// COMIENZO DEL CÓDIGO ==========================================================================================================

        // Creamos un constructor que se encargará de imprimir la calculadora por pantalla.
        public ClaseCalculadora(){
            
            // Aquí vamos a introducir que valores y tamaños tendrán las diferentes partes de la calculadora.

            // Primero utilizamos "super" para darle un nombre a la pestaña que se imprimirá.
            super ("Calculadora de sumas y restas");

            // Ahora creamos el layout, un método común que sirve para que se añadan y vean los botones de la aplicación.
            setLayout(new FlowLayout());

    // CAMPO DE TEXTO 1 =========================================================================================================

            // Vamos a introducir los campos de texto, primero los declaramos y ponemos su tamaño.
            CampoValor1 = new JTextField (10);

            // Añadimos el campo.
            add(CampoValor1);

    // CAMPO DE TEXTO 2 =========================================================================================================

            // Declaramos el segundo campo de texto.
            CampoValor2 = new JTextField(10);

            // Añadimos el segundo campo.
            add(CampoValor2);

    // BOTÓN DE SUMA ============================================================================================================

            //  Introducimos el botón de suma.
            BotónSumar = new JButton("Sumar");

                // Le decimos al programa que "BotónSumar" debe escuchar a una acción, para que responda a ella.
                BotónSumar.addActionListener(new ActionListener() {
                    
                    // Dentro del ActionListener creamos la acción con la que responde el botón al ser presionado.

                    // Primero declaramos un override para crear un método donde codificaremos la respuesta del botón.
                    @Override
                    public void actionPerformed (ActionEvent e){
                        
                        // Dentro del método primero le decimos al programa que recoja los valores que introduzcamos.
                        String ValorNúmero1 = CampoValor1.getText();
                        String ValorNúmero2 = CampoValor2.getText();

                        // Pasamos a Integer los valores de los campos para poder usarlos en el cálculo
                        int IntValorNúmero1 = Integer.parseInt(ValorNúmero1);
                        int IntValorNúmero2 = Integer.parseInt(ValorNúmero2);
                        
                        // Ahora creamos el sistema de cálculo.
                        int Resultado = (IntValorNúmero1 + IntValorNúmero2);

                        // Convertimos el resultado en String para poder imprimirlo
                        String StringResultado = Integer.toString(Resultado);

                        // Imprimimos el Resultado
                        AreaResultado.append(StringResultado + "\n");
                    }
                });

                // Añadimos el botón de suma
                add (BotónSumar);

    // BOTÓN DE RESTA ===========================================================================================================
            
            // Introducimos el botón de resta.
            BotónRestar = new JButton("Restar");

                // Le decimos al programa que "BotónRestar" debe escuchar a una acción, para que responda a ella.
                BotónRestar.addActionListener(new ActionListener() {
                    
                    // Dentro del ActionListener creamos la acción con la que responde el botón al ser presionado.

                    // Primero declaramos un override para crear un método donde codificaremos la respuesta del botón.
                    @Override
                    public void actionPerformed (ActionEvent e){
                        
                        // Dentro del método primero le decimos al programa que recoja los valores que introduzcamos.
                        String ValorNúmero1 = CampoValor1.getText();
                        String ValorNúmero2 = CampoValor2.getText();

                        // Pasamos a Integer los valores de los campos para poder usarlos en el cálculo
                        int IntValorNúmero1 = Integer.parseInt(ValorNúmero1);
                        int IntValorNúmero2 = Integer.parseInt(ValorNúmero2);
                        
                        // Ahora creamos el sistema de cálculo.
                        int Resultado = (IntValorNúmero1 - IntValorNúmero2);

                        // Convertimos el resultado en String para poder imprimirlo
                        String StringResultado = Integer.toString(Resultado);

                        // Imprimimos el Resultado
                        AreaResultado.append(StringResultado + "\n");
                    }
                });
                
                // Añadimos el botón de resta 
                add (BotónRestar);

    // ÁREA RESULTADO ===========================================================================================================

            // Declaramos el área de texto
            AreaResultado = new JTextArea(5, 20);

            // Añadimos el área de texto
            add(AreaResultado);

    // DISEÑO DEL CUADRO EXTERIOR ===============================================================================================

            // El cuadro exterior será el contenedor de todo el programa, donde aparecerá todo lo anterior
                
            // Declaramos el tamaño del cuadro exterior
            setSize(300, 200);

            // Declaramos la visibilidad del cuadro exterior 
            setVisible(true);

            // Declaramos el final de la aplicación
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
