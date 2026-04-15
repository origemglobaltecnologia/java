import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * CONCEITO: Implementação manual de Interfaces Funcionais.
 * Mostra como o Java trabalhava antes das Lambdas (Java 8).
 */
public class SemLambda {
    public static void main(String[] args) {
        
        // Instanciação de Interface Funcional via Classe Anônima
        BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };

        Consumer<String> imprimir = new Consumer<String>() {
            @Override
            public void accept(String mensagem) {
                System.out.println(">>> " + mensagem);
            }
        };

        int resultado = somar.apply(10, 5);
        imprimir.accept("Resultado sem Lambda: " + resultado);

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
