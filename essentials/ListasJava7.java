import java.util.ArrayList;
import java.util.List;

public class ListasJava7 {
    public static void main(String[] args) {
        // Diamond operator <> introduzido no Java 7
        List<String> tecnologias = new ArrayList<>();
        tecnologias.add("Java 7");
        tecnologias.add("Ant");
        tecnologias.add("EJB 3");

        // Loop For-Each (Sintaxe padrão para coleções no Java 7)
        for (String tech : tecnologias) {
            System.out.println("Tecnologia: " + tech);
        }
    }
}
