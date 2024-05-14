// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package Funcionalidades;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Primero importamos la funcionalidad "JOptionPane", esta nos permite mostrar e introducir datos por pantalla.
    import javax.swing.JOptionPane;

// CLASE GESTIÓN PROYECTOS --------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene el sistema lógico de la gestión de proyectos.
    public class ClaseGestionProyectos {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Para comenzar nuestro código vamos a crear el sistema de modificación, para ello empezamos creando un método.
    public static void MétodoGestiónProyectos(){

        // Primero vamos a crear el menú para cambiar los datos.
        String Menú = JOptionPane.showInputDialog("Escribe el nombre del proyecto que quieras iniciar: " + 
                                                          "\n" + 
                                                          "\nCasa: " + "Corto tiempo de producción." +
                                                          "\nCueva: " + "Corto tiempo de producción." +
                                                          "\nPortal al Nether: " + "Medio tiempo de producción." +
                                                          "\nBastión: " + "Medio tiempo de producción." +
                                                          "\nPortal al END: " + "Largo tiempo de producción" + 
                                                          "\n");

        // Ahora creamos el sistema de cambio de datos.

        switch (Menú) {

            case "Casa":

                JOptionPane.showMessageDialog(null, "Para hacer una casa necesitas 10 de madera y 10 de piedra.");

                if (ClaseGestionMateriales.Madera == 10 && ClaseGestionMateriales.Piedra == 10){

                    JOptionPane.showMessageDialog(null, "Parece que tienes todos los materiales, la casa se ha construido sin problema.");

                } 
                
                else {

                    JOptionPane.showMessageDialog(null, "Parece que no cuentas con los materiales necesarios, tendrás que seguir consiguiendo más");

                    ClaseGestionMateriales.MétodoGestiónMateriales();
                    
                }
                
                break;

            case "Cueva":

                JOptionPane.showMessageDialog(null, "Para hacer una casa necesitas 10 de piedra y 10 de hierro.");

                if (ClaseGestionMateriales.Piedra == 10 && ClaseGestionMateriales.Hierro == 10){

                    JOptionPane.showMessageDialog(null, "Parece que tienes todos los materiales, la casa se ha construido sin problema.");

                } 
                
                else {

                    JOptionPane.showMessageDialog(null, "Parece que no cuentas con los materiales necesarios, tendrás que seguir consiguiendo más");

                    ClaseGestionMateriales.MétodoGestiónMateriales();
                    
                }
                
                break;

            case "Portal al Nether":

                JOptionPane.showMessageDialog(null, "Para hacer una casa necesitas 20 de hierro y 20 de diamante.");

                if (ClaseGestionMateriales.Hierro == 20 && ClaseGestionMateriales.Diamante == 20){

                    JOptionPane.showMessageDialog(null, "Parece que tienes todos los materiales, la casa se ha construido sin problema.");

                } 
                
                else {

                    JOptionPane.showMessageDialog(null, "Parece que no cuentas con los materiales necesarios, tendrás que seguir consiguiendo más");

                    ClaseGestionMateriales.MétodoGestiónMateriales();
                    
                }
                
                break;
                
            case "Bastión":

                JOptionPane.showMessageDialog(null, "Para hacer una casa necesitas 10 de Hierro y 5 de Netherita.");

                if (ClaseGestionMateriales.Hierro == 10 && ClaseGestionMateriales.Netherita == 5){

                    JOptionPane.showMessageDialog(null, "Parece que tienes todos los materiales, la casa se ha construido sin problema.");

                } 
                
                else {

                    JOptionPane.showMessageDialog(null, "Parece que no cuentas con los materiales necesarios, tendrás que seguir consiguiendo más");

                    ClaseGestionMateriales.MétodoGestiónMateriales();
                    
                }

                break;

            case "Portal al END":

                JOptionPane.showMessageDialog(null, "Para hacer una casa necesitas 30 de diamante y 30 de netherita.");

                if (ClaseGestionMateriales.Madera == 30 && ClaseGestionMateriales.Piedra == 30){

                    JOptionPane.showMessageDialog(null, "Parece que tienes todos los materiales, la casa se ha construido sin problema.");

                } 
                
                else {

                    JOptionPane.showMessageDialog(null, "Parece que no cuentas con los materiales necesarios, tendrás que seguir consiguiendo más");

                    ClaseGestionMateriales.MétodoGestiónMateriales();
                    
                }
            
                break;

            default:

                JOptionPane.showMessageDialog(null, "El dato introducido no es válido, vuelve a intentarlo", Menú, 3);

                ClaseGestionProyectos.MétodoGestiónProyectos();

                break;

        } // Fin del "switch-case".

    } // Fin del "MétodoGestiónProyectos".

    } // Fin de la "ClaseGestionProyectos".
