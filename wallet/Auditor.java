import java.util.ArrayList;
import java.util.List;

/**
 * GENERICS (<T>): Permite que a classe trabalhe com qualquer tipo de objeto.
 * Tecnologia: Garante Type Safety em tempo de compilação.
 */
public class Auditor<T> {
    // Coleção Genérica: Armazena qualquer tipo T
    private List<T> historico = new ArrayList<>();

    public void registrar(T item) {
        historico.add(item);
        System.out.println("[AUDITORIA]: Novo registro adicionado: " + item);
    }

    public void exibirRelatorio() {
        System.out.println("\n--- RELATÓRIO DE AUDITORIA COMPLETO ---");
        // LAMBDA EXPRESSION: Forma funcional de percorrer a lista
        historico.forEach(item -> System.out.println("LOG -> " + item));
    }
}
