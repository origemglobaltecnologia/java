import java.io.*;

/**
 * CONCEITO: Try-with-resources.
 * Introduzido no Java 7 para gerenciar classes que implementam AutoCloseable.
 * Elimina a necessidade de blocos finally manuais para fechar streams.
 */
public class RecursosJava7 {
    public static void main(String[] args) {
        // O recurso fw será fechado automaticamente ao sair do bloco try
        try (FileWriter fw = new FileWriter("log.txt")) {
            fw.write("Java 7 executado com sucesso");
        } catch (IOException e) {
            System.err.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
