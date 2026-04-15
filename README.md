# ☕ Java Certification Study Path (OCP SE 21)

Este repositório é dedicado ao estudo intensivo das funcionalidades fundamentais e avançadas da linguagem Java, com foco total na preparação para a certificação **Oracle Certified Professional (OCP) Java SE 21**.

O objetivo aqui é documentar a evolução do aprendizado, desde a sintaxe básica até os novos recursos de concorrência e programação funcional.

## 🎯 Objetivos de Aprendizado

- Domínio da sintaxe e regras de compilação (Java 7 a 21).
- Entendimento profundo de Programação Orientada a Objetos (POO).
- Aplicação de Lambdas, Streams e Interfaces Funcionais.
- Implementação de concorrência moderna com **Virtual Threads**.
- Gestão eficiente de memória e tratamento de exceções.

## 📂 Organização do Repositório

O conteúdo está dividido em módulos para facilitar a revisão de tópicos específicos da prova:

### 1. [Essentials](./essentials/)
Focado na fundação da linguagem. Inclui:
- **Tipos Primitivos & Casting**: Regras de conversão e limites de memória.
- **Operadores**: Precedência e operadores unários (`++`, `--`).
- **Controle de Fluxo**: Estruturas de repetição e blocos `switch` clássicos.
- **Exceptions**: Tratamento de erros com `try-with-resources` e `multi-catch`.

### 2. [Wallet System / Advanced Concepts](./) (Raiz)
Exemplos de implementação de sistemas simulados para aplicar conceitos de nível sênior:
- **Collections Framework**: Uso estratégico de `List`, `Set` e `Map`.
- **Generics**: Criação de classes e métodos genéricos para reuso de código.
- **Record Types**: Uso de imutabilidade para transporte de dados.
- **Polimorfismo Avançado**: Interfaces, classes abstratas e métodos default.

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java 21 (LTS).
- **Ambiente de Desenvolvimento:** Termux (Mobile Terminal), GitHub Codespaces.
- **Versionamento:** Git para controle de histórico de estudos.

## 🚀 Como Executar os Exemplos

Todos os códigos são independentes e podem ser compilados diretamente via terminal:

```bash
# Para compilar
javac NomeDoArquivo.java

# Para executar
java NomeDoArquivo
