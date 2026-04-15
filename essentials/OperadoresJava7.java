public class OperadoresJava7 {
    public static void main(String[] args) {
        System.out.println("--- 1. OPERADORES ARITMETICOS ---");
        int a = 10;
        int b = 3;
        
        int soma = a + b;
        int resto = a % b; // Módulo: o que sobra da divisão
        
        System.out.println("Soma (10 + 3): " + soma);
        System.out.println("Resto da divisao (10 % 3): " + resto);

        System.out.println("\n--- 2. INCREMENTO: O PERIGO DA PROVA ---");
        int x = 5;
        System.out.println("Valor inicial de X: " + x);
        
        // Pós-incremento: Usa o valor atual e DEPOIS soma 1
        int y = x++; 
        System.out.println("Apos 'y = x++' -> Y eh " + y + " (recebeu o valor antigo) e X agora eh " + x);
        
        // Pré-incremento: Soma 1 e DEPOIS usa o valor
        int z = ++x;
        System.out.println("Apos 'z = ++x' -> Z eh " + z + " (recebeu o valor ja somado) e X agora eh " + x);

        System.out.println("\n--- 3. OPERADORES LOGICOS (CURTO-CIRCUITO) ---");
        boolean v = true;
        boolean f = false;
        
        // AND (&&): Só eh true se AMBOS forem true
        System.out.println("True && False: " + (v && f));
        
        // OR (||): Eh true se PELO MENOS UM for true
        System.out.println("True || False: " + (v || f));

        System.out.println("\n--- 4. ATRIBUICAO COMPOSTA ---");
        double saldo = 100.0;
        saldo += 50.0; // Mesmo que saldo = saldo + 50.0
        System.out.println("Saldo apos += 50.0: " + saldo);
        
        saldo *= 2;    // Mesmo que saldo = saldo * 2
        System.out.println("Saldo apos *= 2: " + saldo);

        System.out.println("\n--- 5. COMPARACAO ---");
        System.out.println("10 eh maior que 3? " + (10 > 3));
        System.out.println("10 eh igual a 10? " + (10 == 10));
        System.out.println("10 eh diferente de 5? " + (10 != 5));
    }
}
