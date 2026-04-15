public class DesafioOperadores {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        
        // Vamos decompor a linha: int c = a++ * --b;
        int valorUsadoEmA = a++; // Aqui ele pega 2
        int valorUsadoEmB = --b; // Aqui ele transforma 3 em 2
        
        int c = valorUsadoEmA * valorUsadoEmB;

        System.out.println("--- RESULTADO DO SEU DESAFIO ---");
        System.out.println("Valor de A usado na conta: " + valorUsadoEmA);
        System.out.println("Valor de B usado na conta: " + valorUsadoEmB);
        System.out.println("Resultado Final de C: " + c);
        System.out.println("Valor atual de A na memoria: " + a);
        System.out.println("Valor atual de B na memoria: " + b);
    }
}
