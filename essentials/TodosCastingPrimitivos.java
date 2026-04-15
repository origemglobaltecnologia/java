/**
 * CONCEITO: Conversão de Tipos Primitivos.
 * Widening: De menor capacidade para maior (implícito).
 * Narrowing: De maior capacidade para menor (explícito/perigoso).
 * Estouro (Overflow): Quando o valor excede o limite do tipo destino.
 */
public class TodosCastingPrimitivos {
    public static void main(String[] args) {
        // 1. Widening (SEGURO): byte(8) -> int(32) -> double(64)
        byte b = 10;
        int i = b; 
        double d = i; 
        System.out.println("Widening (10 vira double): " + d);

        // 2. Narrowing (PERIGOSO): double -> int (perda de precisão)
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble; // Trunca o valor, não arredonda
        System.out.println("Narrowing (9.99 vira int): " + valorInt);

        // 3. Char e Int: Char no Java é baseado na tabela Unicode/ASCII.
        char letra = 'A'; 
        int codigoAscii = (int) letra; // 65
        System.out.println("Char para Int: " + letra + " eh o numero " + codigoAscii);
        
        // 4. Estouro de Capacidade: O byte vai de -128 a 127.
        int numeroGrande = 130;
        byte resultadoByte = (byte) numeroGrande; // Bit mais significativo vira 1 (negativo)
        System.out.println("Estouro de byte (130 vira): " + resultadoByte);
    }
}
