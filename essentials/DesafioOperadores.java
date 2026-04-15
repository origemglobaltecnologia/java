/**
 * CONCEITO: Precedência de Operadores Unários.
 * a++ (Pós): Usa o valor e depois incrementa.
 * --b (Pré): Decrementa e depois usa o valor.
 * Pegadinha clássica de prova OCP.
 */
public class DesafioOperadores {
    public static void main(String[] args) {
        int a = 2; // Variável inicial
        int b = 3; // Variável inicial
        
        // DECOMPOSIÇÃO: c = 2 (a) * 2 (b pré-decrementado)
        int valorUsadoEmA = a++; // Salva 2, incrementa A para 3
        int valorUsadoEmB = --b; // Decrementa B para 2, salva 2
        
        int c = valorUsadoEmA * valorUsadoEmB; // 2 * 2 = 4

        System.out.println("--- RESULTADO DO SEU DESAFIO ---");
        System.out.println("Valor de A usado na conta: " + valorUsadoEmA);
        System.out.println("Valor de B usado na conta: " + valorUsadoEmB);
        System.out.println("Resultado Final de C: " + c);
        System.out.println("Valor atual de A na memoria: " + a);
        System.out.println("Valor atual de B na memoria: " + b);
    }
}
