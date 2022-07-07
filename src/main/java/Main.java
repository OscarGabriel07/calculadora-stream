import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        List<Integer> numbers1 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7, 9);

        List<Integer> summedLists = Arrays.asList(calculator.add(numbers1), calculator.add(numbers2));

        System.out.println("La suma de las listas es: " + calculator.add(summedLists));
        System.out.println("La resta de las listas es: " + calculator.substract(summedLists));
        System.out.println("La multiplicación de las listas es: " + calculator.multiply(summedLists));
        System.out.println("La división de las listas es: " + calculator.split(summedLists));

    }

}
