/**
 * CONCEITO: Tipos Primitivos de Dados.
 * O Java possui 8 primitivos que não são objetos e ficam na memória Stack.
 * Tamanhos: byte(8), short(16), int(32), long(64), float(32), double(64), char(16), boolean(1).
 */
public class VariaveisJava7 {
    public static void main(String[] args) {
        // INTEIROS
        byte minúsculo = 127; 
        short pequeno = 32767;
        int comum = 2147483647;
        long gigante = 7000000000L; // Sufixo L obrigatório para literais long

        // DECIMAIS
        float preciso = 1.75f;      // Sufixo f obrigatório para literais float
        double muitoPreciso = 19.90;

        // OUTROS
        char letra = 'A';           // Aspas simples para char
        boolean ativo = true;

        // String: Objeto especial (Imutável)
        String texto = "Oracle Certified";

        System.out.println("--- TODOS OS 8 PRIMITIVOS DO JAVA 7 ---");
        System.out.println("01. Byte:    " + minúsculo);
        System.out.println("02. Short:   " + pequeno);
        System.out.println("03. Int:     " + comum);
        System.out.println("04. Long:    " + gigante);
        System.out.println("05. Float:   " + preciso);
        System.out.println("06. Double:  " + muitoPreciso);
        System.out.println("07. Char:    " + letra);
        System.out.println("08. Boolean: " + ativo);
    }
}
