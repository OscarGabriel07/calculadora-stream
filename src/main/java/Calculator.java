import java.util.Arrays;
import java.util.List;

public class Calculator {

    public Integer add(List<Integer> numbers){
        Integer resultado = numbers.stream()
                .reduce((acumulator, number) -> {
                    return acumulator + number;
                }).get();
        return resultado;
    }

    public Integer substract(List<Integer> numbers){
        Integer resultado = numbers.stream()
                        .reduce((acumulator, number) -> {
                            return acumulator - number;
                        }).get();
        return resultado;
    }

    public Integer multiply(List<Integer> numbers){
        Integer resultado = numbers.stream()
                .reduce((acumulador, number) -> {
                    return acumulador * number;
                }).get();
        return resultado;
    }

    public Integer split(List<Integer> numbers){
        Integer resultado = numbers.stream()
                .reduce((acumulador, number) -> {
                    return acumulador / number;
                }).get();
        return resultado;
    }

}
