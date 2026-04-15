import java.io.*;

public class RecursosJava7 {
    public static void main(String[] args) {
        // O recurso dentro do parênteses do try é fechado automaticamente
        try (FileWriter fw = new FileWriter("log.txt")) {
            fw.write("Java 7 executado com sucesso");
        } catch (IOException e) {
            System.err.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
