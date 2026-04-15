/**
 * CONCEITO: Estruturas de Repetição.
 * for: Loop com contador definido.
 * while: Pre-teste (pode nunca rodar).
 * do-while: Pos-teste (roda pelo menos uma vez).
 * break/continue: Controle de interrupção.
 */
public class LoopsJava7 {
    public static void main(String[] args) {
        System.out.println("--- 1. FOR TRADICIONAL ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Contagem: " + i);
        }

        System.out.println("\n--- 2. WHILE (Pre-teste) ---");
        int contador = 5;
        while (contador > 3) {
            System.out.println("While rodando: " + contador);
            contador--;
        }

        System.out.println("\n--- 3. DO-WHILE (Pos-teste) ---");
        int j = 10;
        do {
            System.out.println("Executa pelo menos uma vez, mesmo J sendo 10: " + j);
        } while (j < 5); // Condicao avaliada no final

        System.out.println("\n--- 4. BREAK E CONTINUE ---");
        for (int k = 1; k <= 5; k++) {
            if (k == 2) continue; // Pula a iteração atual e vai para o próximo K
            if (k == 4) break;    // Aborta o loop completamente
            System.out.println("Valor de K: " + k);
        }
    }
}
