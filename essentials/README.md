# 📚 Java Essentials - Masterizando os Fundamentos (OCP Study Path)

Este diretório é um laboratório de fundamentos da linguagem Java. O foco aqui é entender as regras de ouro de compilação, tipos primitivos, controle de fluxo e a transição histórica do Java imperativo para o funcional.

---

## 🛠️ O Coração da Linguagem (Core Syntax)

### 💎 Tipos Primitivos e Memória
- **`VariaveisJava7.java`**: Explora os 8 tipos primitivos. Essencial para entender o consumo de memória (bits) e a necessidade de sufixos como `L` (long) e `f` (float).
- **`TodosCastingPrimitivos.java`**: Guia sobre **Widening** (automático) e **Narrowing** (manual). Contém a famosa pegadinha do "overflow", onde um número maior que 127 "dá a volta" ao ser convertido para `byte`.

### 🧮 Operadores e Precedência
- **`OperadoresJava7.java`**: Demonstra aritmética, resto de divisão e a lógica de **Curto-Circuito** (`&&`, `||`).
- **`DesafioOperadores.java`**: Um mergulho na precedência de operadores unários. Diferencia claramente o `a++` (usa e incrementa) do `++a` (incrementa e usa).

---

## 🏗️ Estruturas de Controle e Robustez

### 🔄 Loops e Decisões
- **`LoopsJava7.java`**: O uso tático de `for`, `while` e `do-while`. Explica como o `break` e o `continue` alteram o fluxo de execução.
- **`SwitchJava7.java`**: Analisa o comportamento do `switch` com Strings e o efeito **Fall-through** (quando a ausência do `break` faz o código "escorregar" para o próximo caso).

### 🛡️ Tratamento de Exceções
- **`TratamentoErros.java`**: Ensina o **Multi-catch** (Java 7+) e a hierarquia de exceções. O bloco `finally` é destacado como o local garantido para limpeza de recursos.
- **`RecursosJava7.java`**: Demonstra o **Try-with-resources**, técnica fundamental para evitar vazamento de memória (Memory Leaks) ao fechar arquivos automaticamente.

---

## 🧬 Orientação a Objetos e Evolução Funcional

### 🏛️ POO e Collections
- **`UsuarioJava7.java`**: O modelo clássico de encapsulamento (JavaBeans) com atributos privados e métodos acessores.
- **`CastingObjetosCompleto.java`**: O mapa do **Polimorfismo**. Explica por que o Upcasting é seguro e por que o Downcasting exige o uso do `instanceof` para evitar o erro `ClassCastException`.
- **`EstruturaDados.java`**: Diferencia as três coleções principais: `ArrayList` (índices), `HashSet` (unicidade) e `HashMap` (chave-valor).

### ⚡ A Revolução das Lambdas
- **`SemLambda.java` vs `LambdaPura.java`**: Um comparativo direto. Mostra como o Java substituiu as verbosas **Classes Anônimas** pela sintaxe limpa das Lambdas e Interfaces Funcionais (`Consumer`, `BinaryOperator`).
- **`ComparativoLambda.java`**: Um resumo visual de como 5 linhas de código do Java 7 se transformam em apenas 1 linha no Java moderno.

---

## 🚀 Como Executar os Estudos

Para validar qualquer conceito no seu terminal (Termux/Linux):

1. **Compilar o arquivo:**
   ```bash
   javac NomeDoArquivo.java
