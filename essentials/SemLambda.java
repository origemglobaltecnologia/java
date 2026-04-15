import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class SemLambda {
    public static void main(String[] args) {
        
        // 1. O equivalente à (a, b) -> a + b
        // No Java 7, precisamos instanciar a interface e abrir um bloco de código
        BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };

        // 2. O equivalente à mensagem -> System.out.println(...)
        Consumer<String> imprimir = new Consumer<String>() {
            @Override
            public void accept(String mensagem) {
                System.out.println(">>> " + mensagem);
            }
        };

        // Execução (Idêntica ao exemplo anterior)
        int resultado = somar.apply(10, 5);
        imprimir.accept("Resultado sem Lambda: " + resultado);

        // 3. Exemplo de Classe Anônima passada como argumento (antigo Runnable)
        executarTarefa(new Runnable() {
            @Override
            public void run() {
                System.out.println(">>> Tarefa executada via Classe Anônima!");
            }
        });
    }

    private static void executarTarefa(Runnable tarefa) {
        tarefa.run();
    }
}
