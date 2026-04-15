public class ComparativoLambda {

    // 1. Definimos uma Interface Funcional (obrigatória para Lambdas)
    interface Operacao {
        int calcular(int x, int y);
    }

    public static void main(String[] args) {
        
        System.out.println("=== Comparativo: Java 7 (Sem Lambda) vs Java 21 (Com Lambda) ===\n");

        // --- ABORDAGEM 1: SEM LAMBDA (Java 7 e anteriores) ---
        // Usamos uma Classe Anônima. É preciso criar o objeto, 
        // abrir chaves, repetir o nome do método e dar o return.
        Operacao semLambda = new Operacao() {
            @Override
            public int calcular(int x, int y) {
                return x * y;
            }
        };

        // --- ABORDAGEM 2: COM LAMBDA (Java 8 até o 21) ---
        // O Java entende que "calcular" é o único método da interface.
        // Ele infere os tipos e o return automaticamente.
        Operacao comLambda = (x, y) -> x * y;

        // Executando ambas
        int res1 = semLambda.calcular(10, 5);
        int res2 = comLambda.calcular(10, 5);

        System.out.println("Resultado Sem Lambda (Classe Anônima): " + res1);
        System.out.println("Resultado Com Lambda (Sintaxe Curta):   " + res2);
        
        System.out.println("\nNota: O resultado é o mesmo, mas a Lambda economizou 5 linhas de código.");
    }
}
