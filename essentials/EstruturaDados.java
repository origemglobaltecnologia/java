import java.util.*;

public class EstruturaDados {
    public static void main(String[] args) {
        // --- ARRAYLIST: Foco em Acesso Rápido ---
        // Bom para: Ler dados pelo índice. Ruim para: Inserir no meio da lista.
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("Java"); // Aceita duplicado
        System.out.println("ArrayList (Ordenada): " + lista);

        // --- HASHSET: Foco em Unicidade ---
        // Bom para: Garantir que não existam repetidos. Não garante ordem.
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("Java"); // Será ignorado
        System.out.println("HashSet (Sem repetidos): " + conjunto);

        // --- HASHMAP: Foco em Busca por Chave ---
        // Guarda um par (Chave -> Valor). Busca quase instantânea.
        Map<String, String> dicionario = new HashMap<>();
        dicionario.put("OCP", "Oracle Certified Professional");
        dicionario.put("IDE", "Integrated Development Environment");
        
        System.out.println("Significado de OCP: " + dicionario.get("OCP"));
    }
}
