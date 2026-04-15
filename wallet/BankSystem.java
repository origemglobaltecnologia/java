import java.util.concurrent.Executors;
import java.util.List;

/**
 * MULTITHREADING: Processamento paralelo.
 * Tecnologia: VIRTUAL THREADS (Java 21) - Threads leves para alta escala.
 */
public class BankSystem {
    
    public void processarLoteAssincrono(Card card, List<Double> valores) {
        System.out.println("\n--- INICIANDO PROCESSAMENTO EM MASSA (VIRTUAL THREADS) ---");
        
        /**
         * TRY-WITH-RESOURCES: Fecha o executor automaticamente no final.
         * NewVirtualThreadPerTask: Cria uma thread virtual para cada transação.
         */
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (Double valor : valores) {
                // Submit envia a tarefa (Lambda) para execução em paralelo
                executor.submit(() -> {
                    try {
                        card.processPayment(valor);
                        System.out.println("[THREAD " + Thread.currentThread().threadId() + 
                                           "] Sucesso: R$ " + valor);
                    } catch (InsufficientFundsException e) {
                        System.out.println("[THREAD " + Thread.currentThread().threadId() + 
                                           "] Falha: " + e.getMessage());
                    }
                    return null;
                });
            }
        } 
        
        System.out.println("--- LOTE FINALIZADO ---");
    }
}
