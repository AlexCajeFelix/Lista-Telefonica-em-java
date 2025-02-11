# 📒 Gerenciador de Contatos (Agenda)

Este é um projeto simples de gerenciamento de contatos em Java, desenvolvido para praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)** e boas práticas de desenvolvimento.

## 🚀 Aprendizados e Conceitos Aplicados

### 🔹 Programação Orientada a Objetos (POO)
- **Encapsulamento**: Os atributos das classes são privados e acessados por métodos públicos (`getters` e `setters`).
- **Herança e Abstração**: Possibilidade de transformar `Agenda` em uma classe abstrata para reutilização futura.
- **Polimorfismo**: Uso da interface `RepositorioContato`, permitindo múltiplas implementações (ex.: `AgendaBancoDeDados`).
- **Composição**: A `Agenda` gerencia uma lista de `Pessoa`, demonstrando a relação "tem um" (has-a).

### 🔹 Boas Práticas de Código
- **Baixo acoplamento**: O `App` não depende diretamente da `Agenda`, mas sim da interface `RepositorioContato`, facilitando a manutenção e testes.
- **Modularização**: Separação clara entre classes (`Pessoa`, `Agenda`, `RepositorioContato` e `App`).
- **Uso de Streams e Lambda**: Para manipulação de listas (`filter()`, `removeIf()`, etc.).
- **Tratamento de exceções**: Uso de `try-catch` para capturar possíveis erros na entrada de dados do usuário.

### 🔹 Estrutura do Projeto

## 🛠 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/agenda-contatos.git
## 🛠 Execute esses comandos
    javac src/App.java
    java src.App

## 📝 Exemplo de Uso

```java
(1) Adicionar um contato
(2) Visualizar todos os contatos
(3) Visualizar por nome
(4) Remover contato
(5) Sair
Digite a opção que você deseja: 1

Digite o nome do contato: João
Digite o número: 11932831344

Contato adicionado com sucesso!
