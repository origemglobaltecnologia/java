import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * CONCEITO: Interfaces Funcionais do pacote java.util.function.
 * BinaryOperator<T>: Recebe dois T e retorna um T.
 * Consumer<T>: Recebe um T e não retorna nada (void).
 * Runnable: Não recebe nada e não retorna nada.
 */
public class LambdaPura {
    public static void main(String[] args) {
        
        // Lambda que implementa a lógica de soma
        BinaryOperator<Integer> somar = (a, b) -> a + b;

        // Lambda que implementa a lógica de saída de dados
        Consumer<String> imprimir = mensagem -> System.out.println(">>> " + mensagem);

        int resultado = somar.apply(10, 5);
        imprimir.accept("Resultado da Lambda: " + resultado);

        // Lambda inline para a interface funcional Runnable
        executarTarefa(() -> System.out.println(">>> Tarefa executada via Lambda!"));
    }

    private static void executarTarefa(Runnable tarefa) {
        tarefa.run();
    }
}
