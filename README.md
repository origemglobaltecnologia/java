# 💳 Java Wallet System - OCP Study Path

Este repositório contém um ecossistema de microserviços simplificado para gestão de carteira digital, desenvolvido com foco nos tópicos da certificação **Oracle Certified Professional (OCP) Java SE 21**.

## 🚀 Conceitos Técnicos Aplicados

O projeto foi estruturado para demonstrar o domínio das seguintes áreas da linguagem:

### 1. Orientação a Objetos Avançada
- **Abstração & Polimorfismo**: Classe base `Card` e especializações `Mastercard` e `Visa`.
- **Interfaces e Contratos**: `PaymentProcessor` define o comportamento obrigatório de pagamento.
- **Enums**: Uso de `CardStatus` para garantir *Type Safety* e evitar estados inválidos.

### 2. Recursos Modernos (Java 17/21)
- **Records**: `TransactionReport` utilizado como DTO (Data Transfer Object) imutável.
- **Virtual Threads**: Processamento concorrente de alta performance em `BankSystem.java`.
- **Sealed Interfaces (Conceitual)**: Estrutura preparada para controle estrito de hierarquia.

### 3. Java API & Robustez
- **Optional**: Gestão de retornos nulos em `getBalance()`.
- **Generics**: Classe `Auditor<T>` para auditoria de qualquer tipo de evento.
- **Collections**: Uso de `HashSet` em `Wallet.java` para garantir a unicidade de elementos através do contrato `hashCode` e `equals`.
- **Exceções Customizadas**: Tratamento de erros de negócio com `InsufficientFundsException`.

## 📂 Estrutura de Arquivos

- `Card.java`: Classe pai abstrata com lógica de saldo e igualdade.
- `Mastercard.java` / `Visa.java`: Subclasses que herdam de Card.
- `Wallet.java`: Gerenciador de cartões utilizando `Set`.
- `Auditor.java`: Sistema de logs genérico utilizando Lambdas.
- `BankSystem.java`: Motor de execução utilizando as novas Virtual Threads do Java 21.
- `TransactionReport.java`: Record para persistência de dados de transação.
- `PaymentProcessor.java`: Interface fundamental do sistema.

## 🛠️ Como Compilar e Rodar

```bash
javac *.java && java Main

