public class TodosCastingPrimitivos {
    public static void main(String[] args) {
        // --- APOSTILA DE CASTING ---

        // 1. Widening (Alargamento/Implícito) - SEGURO
        // byte -> short -> char -> int -> long -> float -> double
        byte b = 10;
        int i = b;            // Automático
        long l = i;           // Automático
        double d = l;         // Automático (vira 10.0)
        
        System.out.println("Widening (10 vira double): " + d);

        // 2. Narrowing (Estreitamento/Explícito) - PERIGOSO
        // double -> float -> long -> int -> char -> short -> byte
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble; // Perda de .99
        
        System.out.println("Narrowing (9.99 vira int): " + valorInt);

        // 3. O caso do Char (Conversão para número)
        char letra = 'A'; 
        int codigoAscii = (int) letra; // 'A' na tabela ASCII é 65
        
        System.out.println("Char para Int: " + letra + " eh o numero " + codigoAscii);
        
        // 4. Estouro de Capacidade (O perigo da prova)
        int numeroGrande = 130;
        byte resultadoByte = (byte) numeroGrande; 
        // O byte só vai até 127. Ele "dá a volta" e vira negativo!
        System.out.println("Estouro de byte (130 vira): " + resultadoByte);
    }
}
