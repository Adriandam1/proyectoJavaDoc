// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

/**
 * @author Adrian
 * @version v1.0
 *
 */
public class Main {

    /**
     * atributo contador1750 cuenta cuantos sueldos tienen entre 1000 y 1750€
     * atributo contador1000 cuenta cuantos sueldos tienen menos de 1000 €
     * atributo contador1750 cuenta cuantos sueldos tienen mas de 1750€
     */

    static Integer contador1750 = 0;

    static Integer contador1000 = 0;

    static Integer contadorMas1750 = 0;

    /**
     * Aumenta contador según rango del sueldo del trabajador
     * * @param args
     */

        public static void main(String[] args) {
            //Declaramos trabajador
            Trabajador auxTrabajador;
            // No hace falta instanciar el objeto por que es static //Funciones obx = new Funciones();
            do {
                // No hace falta instanciar el objeto por que es static //obx.darAltaTrabajador();
                auxTrabajador = Funciones.darAltaTrabajador();
                actualizarContadores(auxTrabajador);
            } while (auxTrabajador.getSueldo() !=0);

            mostrarContadores();
        }

    /**
     * Aumenta contadores segun rango
     * auxTrabajador Trabajador actual
     */
        public static void actualizarContadores(Trabajador auxTrabajador) {
            if (Funciones.obtenerSueldo1750(auxTrabajador.getSueldo()))
                contador1750++;
            else if (Funciones.obtenerSueldo1000(auxTrabajador.getSueldo()))
                contador1000++;
        }

    /**
     * Muestra por consola los contadores
     */
    public static void mostrarContadores(){
            System.out.println("Entre 1000-1750 "+contador1750+" menos de 1000: "+contador1000);
        }

}