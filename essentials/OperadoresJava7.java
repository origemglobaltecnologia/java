/**
 * CONCEITO: Operadores da Linguagem.
 * Módulo (%): Resto da divisão inteira.
 * Curto-Circuito (&&, ||): Se o primeiro termo define o resultado, o segundo não é avaliado.
 * Atribuição Composta (+=, *=): Realiza operação e atribui na mesma variável.
 */
public class OperadoresJava7 {
    public static void main(String[] args) {
        System.out.println("--- 1. OPERADORES ARITMETICOS ---");
        int a = 10, b = 3;
        int soma = a + b;
        int resto = a % b; // Útil para verificar números pares/ímpares
        System.out.println("Soma (10 + 3): " + soma);
        System.out.println("Resto da divisao (10 % 3): " + resto);

        System.out.println("\n--- 2. INCREMENTO ---");
        int x = 5;
        int y = x++; // y=5, x=6 (Pós)
        int z = ++x; // x=7, z=7 (Pré)

        System.out.println("\n--- 3. OPERADORES LOGICOS ---");
        boolean v = true, f = false;
        System.out.println("True && False: " + (v && f)); // AND
        System.out.println("True || False: " + (v || f)); // OR

        System.out.println("\n--- 4. ATRIBUICAO COMPOSTA ---");
        double saldo = 100.0;
        saldo += 50.0; // Acumulador
        saldo *= 2;    // Multiplicador
        System.out.println("Saldo Final: " + saldo);

        System.out.println("\n--- 5. COMPARACAO ---");
        System.out.println("10 == 10: " + (10 == 10)); // Igualdade
        System.out.println("10 != 5: " + (10 != 5));   // Diferença
    }
}
