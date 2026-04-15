public class VariaveisJava7 {
    public static void main(String[] args) {
        // --- 1. OS 4 INTEIROS (Diferem pelo tamanho em memória) ---
        byte minúsculo = 127;                // 8-bit (-128 a 127)
        short pequeno = 32767;               // 16-bit
        int comum = 2147483647;              // 32-bit (O padrão)
        long gigante = 7000000000L;          // 64-bit (Precisa do L!)

        // --- 2. OS 2 DECIMAIS (Ponto Flutuante) ---
        float preciso = 1.75f;               // 32-bit (Precisa do f!)
        double muitoPreciso = 19.90;         // 64-bit (O padrão)

        // --- 3. OS 2 "OUTROS" ---
        char letra = 'A';                    // 16-bit (Guarda UM caractere)
        boolean ativo = true;                // 1-bit nominal (true/false)

        // --- BÔNUS: O OBJETO (Não é primitivo!) ---
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
        System.out.println("---------------------------------------");
        System.out.println("Bônus (String): " + texto);
    }
}
