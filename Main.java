import java.util.List;

/**
 * CLASSE EXECUTÁVEL: Ponto de entrada da JVM (psvm).
 */
public class Main {
    public static void main(String[] args) {
        // Instanciação: Criação de objetos na memória Heap
        Mastercard meuCartao = new Mastercard(1111222233334444L);
        meuCartao.deposit(1000.0);

        BankSystem banco = new BankSystem();
        Auditor<TransactionReport> auditoria = new Auditor<>();

        // List.of: Cria uma coleção imutável (Java 9+)
        List<Double> transacoesExternas = List.of(100.0, 250.0, 900.0, 50.0);

        // Chamada de método concorrente
        banco.processarLoteAssincrono(meuCartao, transacoesExternas);

        // Uso do Optional com ifPresent (Estilo funcional)
        meuCartao.getBalance().ifPresent(saldo -> {
            // Criação do Record
            TransactionReport report = new TransactionReport(
                meuCartao.getNumber(), 
                saldo, 
                java.time.LocalDateTime.now(), 
                true
            );
            auditoria.registrar(report);
        });

        auditoria.exibirRelatorio();
    }
}
