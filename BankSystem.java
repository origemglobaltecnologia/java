import java.util.concurrent.Executors;
import java.util.List;
import java.time.LocalDateTime;

public class BankSystem {
    
    public void processarLoteAssincrono(Card card, List<Double> valores) {
        System.out.println("\n--- INICIANDO PROCESSAMENTO EM MASSA (VIRTUAL THREADS) ---");
        
        // Criando um executor que abre uma Virtual Thread por tarefa
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (Double valor : valores) {
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
        } // O try-with-resources garante que o programa espere todas as threads acabarem
        
        System.out.println("--- LOTE FINALIZADO ---");
    }
}
