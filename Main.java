import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Setup do Cartão
        Mastercard meuCartao = new Mastercard(1111222233334444L);
        meuCartao.deposit(1000.0);

        // 2. Setup do Sistema Bancário e Auditor
        BankSystem banco = new BankSystem();
        Auditor<TransactionReport> auditoria = new Auditor<>();

        // 3. Lista de transações vindas de um "JSON externo"
        List<Double> transacoesExternas = List.of(100.0, 250.0, 900.0, 50.0);

        // 4. Processamento Concorrente (Java 21)
        banco.processarLoteAssincrono(meuCartao, transacoesExternas);

        // 5. Gerando um Relatório Final com Records (Imutabilidade)
        meuCartao.getBalance().ifPresent(saldo -> {
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
