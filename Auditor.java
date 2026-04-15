import java.util.ArrayList;
import java.util.List;

public class Auditor<T> {
    private List<T> historico = new ArrayList<>();

    public void registrar(T item) {
        historico.add(item);
        System.out.println("[AUDITORIA]: Novo registro adicionado: " + item);
    }

    public void exibirRelatorio() {
        System.out.println("\n--- RELATÓRIO DE AUDITORIA COMPLETO ---");
        historico.forEach(item -> System.out.println("LOG -> " + item));
    }
}
