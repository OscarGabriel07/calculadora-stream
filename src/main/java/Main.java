import java.util.Arrays;
import java.util.List;

/**
 * Main para la ejecución del programa
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 7-07-2022
 */
public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        List<Double> numbers1 = Arrays.asList(8D, 4D, 7D, 11D, 12D);
        List<Double> numbers2 = Arrays.asList(1D, 2D, 8D, 9D, 5D);

        System.out.println("------------------------------------------------");
        System.out.println("Lista 1: " + numbers1);
        System.out.println("Lista 2: " + numbers2);
        System.out.println("------------------------------------------------");
        System.out.println("Suma: " + calculator.add(numbers1, numbers2));
        System.out.println("Resta: " + calculator.substract(numbers1, numbers2));
        System.out.println("Multiplicación: " + calculator.multiply(numbers1, numbers2));
        System.out.println("División: " + calculator.split(numbers1, numbers2));
        System.out.println("Modulo: " + calculator.modul(numbers1, numbers2));


    }

}
