// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package Funcionalidades;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Primero importamos la funcionalidad "JOptionPane", esta nos permite mostrar e introducir datos por pantalla.
    import javax.swing.JOptionPane;

// CLASE GESTIÓN MATERIALES -------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene el sistema lógico de la gestión de materiales.
    public class ClaseGestionMateriales {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.
    static public int Madera;
    static public int Piedra;
    static public int Hierro;
    static public int Diamante;
    static public int Netherita;

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Para comenzar nuestro código vamos a crear el sistema de modificación, para ello empezamos creando un método.
    public static void MétodoGestiónMateriales(){

        // Primero vamos a crear el menú para cambiar los datos.
        String Menú = JOptionPane.showInputDialog("Escribe el nombre del material que quieras conseguir: " + 
                                                          "\n" + 
                                                          "\nMadera: " + "Conseguida en bosques, muy común" +
                                                          "\nPiedra: " + "Conseguida en cuevas, bastante común" +
                                                          "\nHierro: " + "Conseguida en minas, poco común" +
                                                          "\nDiamante: " + "Conseguida en ravines, rara" +
                                                          "\nNetherita: " + "Conseguida en el Nether, muy rara" + 
                                                          "\n");

        // Ahora creamos el sistema de cambio de datos.

        switch (Menú) {

            case "Madera":

                Madera = Integer.parseInt(JOptionPane.showInputDialog("Cuanta madera quieres conseguir?"));

                JOptionPane.showMessageDialog(null, "El valor se ha cambiado correctamente.");

                JOptionPane.showMessageDialog(null, "Ahora tienes: " + Madera + " de madera");
                
                ClaseGestionMateriales.MétodoGestiónMateriales();

                break;

            case "Piedra":

                Piedra = Integer.parseInt(JOptionPane.showInputDialog("Cuanta piedra quieres conseguir?"));

                JOptionPane.showMessageDialog(null, "El valor se ha cambiado correctamente.");

                JOptionPane.showMessageDialog(null, "Ahora tienes: " + Piedra + " de piedra");
                
                ClaseGestionMateriales.MétodoGestiónMateriales();

                break;

            case "Hierro":

                Hierro = Integer.parseInt(JOptionPane.showInputDialog("Cuanto hierro quieres conseguir?"));
                
                JOptionPane.showMessageDialog(null, "El valor se ha cambiado correctamente.");

                JOptionPane.showMessageDialog(null, "Ahora tienes: " + Hierro + " de hierro");

                ClaseGestionMateriales.MétodoGestiónMateriales();

                break;
                
            case "Diamante":

                Diamante = Integer.parseInt(JOptionPane.showInputDialog("Cuanto diamante quieres conseguir?"));
                
                JOptionPane.showMessageDialog(null, "El valor se ha cambiado correctamente.");

                JOptionPane.showMessageDialog(null, "Ahora tienes: " + Diamante+ " de diamante");

                ClaseGestionMateriales.MétodoGestiónMateriales();

                break;

            case "Netherita":

                Netherita = Integer.parseInt(JOptionPane.showInputDialog("Cuanta netherita quieres conseguir?"));
                
                JOptionPane.showMessageDialog(null, "Ahora tienes: " + Netherita + " de Netherita");

                ClaseGestionMateriales.MétodoGestiónMateriales();

                break;

            default:

                JOptionPane.showMessageDialog(null, "El dato introducido no es válido, vuelve a intentarlo", Menú, 3);

                ClaseGestionMateriales.MétodoGestiónMateriales();

                break;

        } // Fin del "switch-case".

    } // Fin del "MétodoGestiónMateriales".

    } // Fin de la "ClaseGestionMateriales".
