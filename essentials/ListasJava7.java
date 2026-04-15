import java.util.ArrayList;
import java.util.List;

/**
 * CONCEITO: Diamond Operator (<>).
 * Antes do Java 7: new ArrayList<String>()
 * Java 7+: O compilador infere o tipo no lado direito.
 */
public class ListasJava7 {
    public static void main(String[] args) {
        // Diamond operator <> reduz repetição de código
        List<String> tecnologias = new ArrayList<>(); 
        tecnologias.add("Java 7");
        tecnologias.add("Ant");
        tecnologias.add("EJB 3");

        // Loop For-Each: Sintaxe simplificada para iterar coleções e arrays.
        for (String tech : tecnologias) {
            System.out.println("Tecnologia: " + tech);
        }
    }
}
