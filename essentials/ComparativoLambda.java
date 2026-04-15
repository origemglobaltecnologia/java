/**
 * CONCEITO: Classes Anônimas vs Expressões Lambda.
 * Interface Funcional: Aquela que possui exatamente um método abstrato.
 * Lambda (Java 8+): Sintaxe simplificada para implementar interfaces funcionais.
 */
public class ComparativoLambda {

    @FunctionalInterface // Garante que a interface só tenha um método (ideal para Lambda)
    interface Operacao {
        int calcular(int x, int y);
    }

    public static void main(String[] args) {
        
        System.out.println("=== Comparativo: Java 7 (Sem Lambda) vs Java 21 (Com Lambda) ===\n");

        // ABORDAGEM JAVA 7: Classe Anônima. Muita verbosidade (Boilerplate).
        Operacao semLambda = new Operacao() {
            @Override
            public int calcular(int x, int y) {
                return x * y;
            }
        };

        // ABORDAGEM JAVA 8+: Lambda. Tipo dos parâmetros e return são inferidos.
        Operacao comLambda = (x, y) -> x * y;

        int res1 = semLambda.calcular(10, 5);
        int res2 = comLambda.calcular(10, 5);

        System.out.println("Resultado Sem Lambda (Classe Anônima): " + res1);
        System.out.println("Resultado Com Lambda (Sintaxe Curta):   " + res2);
    }
}
