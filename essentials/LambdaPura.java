import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class LambdaPura {
    public static void main(String[] args) {
        
        // 1. Lambda que recebe dois números e retorna a soma
        // Usa a interface funcional nativa BinaryOperator<T>
        BinaryOperator<Integer> somar = (a, b) -> a + b;

        // 2. Lambda que recebe um texto e imprime (sem retorno)
        // Usa a interface funcional nativa Consumer<T>
        Consumer<String> imprimir = mensagem -> System.out.println(">>> " + mensagem);

        // Execução
        int resultado = somar.apply(10, 5);
        imprimir.accept("Resultado da Lambda: " + resultado);

        // 3. Exemplo de Lambda inline (passada como argumento)
        executarTarefa(() -> System.out.println(">>> Tarefa executada via Lambda!"));
    }

    private static void executarTarefa(Runnable tarefa) {
        tarefa.run();
    }
}
