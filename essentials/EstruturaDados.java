import java.util.*;

/**
 * CONCEITO: Framework de Coleções do Java.
 * List: Ordenada, aceita duplicatas.
 * Set: Não ordenada (geralmente), não aceita duplicatas.
 * Map: Par Chave-Valor.
 */
public class EstruturaDados {
    public static void main(String[] args) {
        // ARRAYLIST: Implementação de List baseada em arrays redimensionáveis.
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("Java"); // Permitido
        System.out.println("ArrayList (Ordenada): " + lista);

        // HASHSET: Implementação de Set baseada em Tabela Hash. Unicidade garantida.
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("Java"); // Ignorado silenciosamente
        System.out.println("HashSet (Sem repetidos): " + conjunto);

        // HASHMAP: Mapeamento de chaves únicas para valores.
        Map<String, String> dicionario = new HashMap<>();
        dicionario.put("OCP", "Oracle Certified Professional");
        dicionario.put("IDE", "Integrated Development Environment");
        
        System.out.println("Significado de OCP: " + dicionario.get("OCP"));
    }
}
