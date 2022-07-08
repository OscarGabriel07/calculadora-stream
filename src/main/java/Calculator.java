import java.util.List;
import java.util.stream.Collectors;

/**
 * Calculadora
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 7-07-2022
 */
public class Calculator {

    /**
     * Método para sumar los elementos de dos listas del mismo tamaño,
     * si las listas son de diferente tamaño devuelve un arreglo vacío
     *
     * @param list1 primera lista de tipo Double
     * @param list2 segunda lista de tipo Double
     * @return devuelve una nueva lista con los valores de cada item sumados
     */
    public List<Double> add(List<Double> list1, List<Double> list2){
        if(list1.size() != list2.size()){return List.of();}
        List<Double> resultado = list1.stream()
                .map(element -> {
                    Integer index = list1.indexOf(element);
                    return element + list2.get(index);
                }).collect(Collectors.toList());

        return resultado;
    }

    /**
     * Método para restar los elementos de dos listas del mismo tamaño,
     * si las listas son de diferente tamaño devuelve un arreglo vacío
     *
     * @param list1 primera lista de tipo Double
     * @param list2 segunda lista de tipo Double
     * @return devuelve una nueva lista con los valores de cada item sumados
     */
    public List<Double> substract(List<Double> list1, List<Double> list2){
        if(list1.size() != list2.size()){return List.of();}
        List<Double> resultado = list1.stream()
                .map(element -> {
                    Integer index = list1.indexOf(element);
                    return element - list2.get(index);
                }).collect(Collectors.toList());

        return resultado;
    }

    /**
     * Método para multiplicar los elementos de dos listas del mismo tamaño,
     * si las listas son de diferente tamaño devuelve un arreglo vacío
     *
     * @param list1 primera lista de tipo Double
     * @param list2 segunda lista de tipo Double
     * @return devuelve una nueva lista con los valores de cada item sumados
     */
    public List<Double> multiply(List<Double> list1, List<Double> list2){
        if(list1.size() != list2.size()){return List.of();}
        List<Double> resultado = list1.stream()
                .map(element -> {
                    Integer index = list1.indexOf(element);
                    return element * list2.get(index);
                }).collect(Collectors.toList());

        return resultado;
    }

    /**
     * Método para dividir los elementos de dos listas del mismo tamaño,
     * si las listas son de diferente tamaño devuelve un arreglo vacío
     *
     * @param list1 primera lista de tipo Double
     * @param list2 segunda lista de tipo Double
     * @return devuelve una nueva lista con los valores de cada item sumados
     */
    public List<Double> split(List<Double> list1, List<Double> list2){
        if(list1.size() != list2.size()){return List.of();}
        List<Double> resultado = list1.stream()
                .map(element -> {
                    Integer index = list1.indexOf(element);
                    if(list2.get(index) == 0D){
                        return 0D;
                    }
                    return element / list2.get(index);
                }).collect(Collectors.toList());

        return resultado;
    }

    /**
     * Método para calcular el módulo de los elementos de dos listas del mismo tamaño,
     * si las listas son de diferente tamaño devuelve un arreglo vacío
     *
     * @param list1 primera lista de tipo Double
     * @param list2 segunda lista de tipo Double
     * @return devuelve una nueva lista con los valores de cada item sumados
     */
    public List<Double> modul(List<Double> list1, List<Double> list2){
        if(list1.size() != list2.size()){return List.of();}
        List<Double> resultado = list1.stream()
                .map(element -> {
                    Integer index = list1.indexOf(element);
                    if(list2.get(index) == 0D){
                        return 0D;
                    }
                    return element % list2.get(index);
                }).collect(Collectors.toList());

        return resultado;
    }

}
