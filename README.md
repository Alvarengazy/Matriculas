 <div align="center">

# 🎓 Java — HashMap & Student Management System

**A practical Java study exploring HashMap, collection integration, object management, and CRUD fundamentals through a student management system — written, tested, and documented while learning.**

![Java](https://img.shields.io/badge/Java-Collections%20%26%20OOP-orange?logo=openjdk)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Level](https://img.shields.io/badge/Level-Beginner%20%2F%20Intermediate-blue)

**· [🇺🇸 English](#-english) · [🇧🇷 Português](#-português) · [🧭 Roadmap](#-learning-roadmap--roteiro-de-estudos) ·**

</div>

---

<details open>
<summary><strong>🇺🇸 English</strong></summary>

### 📖 About

This project explores Java Collections and their practical application in a student management system.

The study focuses on key-value storage, student identification, data retrieval, and the integration of different collection structures.

The practical system uses a `HashMap` to associate student IDs with student objects, a `HashSet` to prevent duplicate registration numbers, and an `ArrayList` to preserve student registration order.

The project also applies Java Records, Scanner, conditional statements, loops, methods, and input validation to implement student registration, consultation, listing, and deletion.

### 🎯 Topics Covered

- **HashMap:** Storing and managing data through key-value pairs.
- **put():** Adding entries to a map.
- **get():** Retrieving values using their keys.
- **remove():** Removing entries from collections.
- **contains():** Checking whether an element exists.
- **HashSet:** Preventing duplicate student registration numbers.
- **ArrayList:** Maintaining student registration order.
- **Collection Integration:** Combining different collections to manage related data.
- **Records:** Representing students through concise data-oriented types.
- **Scanner:** Reading user input.
- **CRUD Fundamentals:** Implementing creation, reading, and deletion operations.
- **for-each:** Iterating through registered student IDs.
- **switch:** Managing menu navigation.
- **do/while:** Keeping the menu running until the user chooses to exit.
- **Input Validation:** Preventing empty names, duplicate registration numbers, and invalid grades.

### 💻 Practical Examples

**Declaring a HashMap**

```java
HashMap<Integer, Aluno> alunos = new HashMap<>();
```

The `HashMap` associates an integer student ID with an `Aluno` object.

**Adding Students with put()**

```java
alunos.put(proximoId, novoAluno);
```

The `put()` method stores a value associated with a key.

**Retrieving Students with get()**

```java
Aluno aluno = alunos.get(id);
```

The `get()` method retrieves the student associated with the specified ID. If the key does not exist, it returns `null`.

**Preventing Duplicate Registration Numbers**

```java
if (matriculas.contains(numeromatricula)) {
    System.out.println("Registration number already exists!");
    return;
}
```

The `HashSet` checks whether a registration number has already been registered.

**Integrating HashMap and ArrayList**

```java
for (Integer id : ordemcadastro) {
    Aluno aluno = alunos.get(id);
    System.out.println(aluno);
}
```

The `ArrayList` provides the registration order, while the `HashMap` retrieves the corresponding student.

**Accessing Record Components**

```java
System.out.println(aluno.nome());
System.out.println(aluno.matricula());
System.out.println(aluno.nota());
```

Records provide accessor methods to retrieve their components.

### 🧠 Key Concepts

**HashMap and Key-Value Pairs**

A `HashMap` stores information through keys and values. Each key must be unique, while values can be repeated.

**HashMap vs. ArrayList vs. HashSet**

Each collection serves a different purpose:

- `HashMap` — associates keys with values.
- `ArrayList` — stores elements in an ordered sequence.
- `HashSet` — stores unique elements without guaranteeing insertion order.

**Collection Integration**

Different collections can work together to solve a practical problem. In this project, the student ID connects the `ArrayList` registration order to the student stored in the `HashMap`.

**Records and Immutability**

The `Aluno` record represents student information. Since records are immutable, changing student information requires creating a new instance and replacing the previous value in the `HashMap`.

**Data Consistency**

When removing a student, the system must update all three collections to avoid outdated IDs or registration numbers.

### 🛣️ Learning Roadmap

- [x] Understand the purpose of `HashMap`.
- [x] Declare a `HashMap` using generic types.
- [x] Store entries using `put()`.
- [x] Retrieve values using `get()`.
- [x] Understand what `null` represents in a failed lookup.
- [x] Check existing elements using `contains()`.
- [x] Integrate `HashMap` with `ArrayList`.
- [x] Use `HashSet` to prevent duplicate registration numbers.
- [x] Represent students using Java Records.
- [x] Implement student registration.
- [x] List registered students.
- [x] Search students by registration number.
- [x] Implement student removal.
- [x] Apply input validation.
- [x] Build a menu using `switch` and `do/while`.

</details>

---

<details>
<summary><strong>🇧🇷 Português</strong></summary>

### 📖 Sobre

Este projeto explora as Collections do Java e sua aplicação prática em um sistema de gerenciamento de alunos.

O estudo concentra-se no armazenamento de dados por pares de chave e valor, identificação de alunos, recuperação de informações e integração entre diferentes estruturas de coleções.

O sistema utiliza um `HashMap` para associar IDs aos objetos de alunos, um `HashSet` para impedir matrículas duplicadas e um `ArrayList` para preservar a ordem de cadastro.

O projeto também aplica Records, Scanner, estruturas condicionais, laços de repetição, métodos e validação de dados para implementar o cadastro, a consulta, a listagem e a exclusão de alunos.

### 🎯 Conteúdos Estudados

- **HashMap:** Armazenamento e gerenciamento de dados por pares de chave e valor.
- **put():** Inserção de elementos em um mapa.
- **get():** Recuperação de valores por meio de suas chaves.
- **remove():** Remoção de elementos de coleções.
- **contains():** Verificação da existência de elementos.
- **HashSet:** Prevenção de matrículas duplicadas.
- **ArrayList:** Preservação da ordem de cadastro dos alunos.
- **Integração de Coleções:** Combinação de diferentes estruturas para gerenciar dados relacionados.
- **Records:** Representação de alunos por meio de tipos concisos orientados a dados.
- **Scanner:** Leitura de entradas do usuário.
- **Fundamentos de CRUD:** Implementação de operações de criação, leitura e remoção.
- **for-each:** Percorrer os IDs dos alunos cadastrados.
- **switch:** Gerenciamento da navegação pelo menu.
- **do/while:** Manutenção do menu em execução até que o usuário escolha sair.
- **Validação de Dados:** Prevenção de nomes vazios, matrículas duplicadas e notas inválidas.

### 💻 Exemplos Práticos

**Declarando um HashMap**

```java
HashMap<Integer, Aluno> alunos = new HashMap<>();
```

O `HashMap` associa um ID inteiro a um objeto do tipo `Aluno`.

**Adicionando Alunos com put()**

```java
alunos.put(proximoId, novoAluno);
```

O método `put()` armazena um valor associado a uma chave.

**Consultando Alunos com get()**

```java
Aluno aluno = alunos.get(id);
```

O método `get()` recupera o aluno associado ao ID informado. Caso a chave não exista, retorna `null`.

**Impedindo Matrículas Duplicadas**

```java
if (matriculas.contains(numeromatricula)) {
    System.out.println("Matrícula já cadastrada!");
    return;
}
```

O `HashSet` verifica se a matrícula já foi registrada.

**Integrando HashMap e ArrayList**

```java
for (Integer id : ordemcadastro) {
    Aluno aluno = alunos.get(id);
    System.out.println(aluno);
}
```

O `ArrayList` fornece a ordem de cadastro, enquanto o `HashMap` recupera o aluno correspondente.

**Acessando os Componentes do Record**

```java
System.out.println(aluno.nome());
System.out.println(aluno.matricula());
System.out.println(aluno.nota());
```

Os Records fornecem métodos de acesso para recuperar seus componentes.

### 🧠 Conceitos Importantes

**HashMap e Pares de Chave e Valor**

Um `HashMap` armazena informações por meio de chaves e valores. Cada chave deve ser única, enquanto os valores podem se repetir.

**HashMap vs. ArrayList vs. HashSet**

Cada coleção possui uma finalidade diferente:

- `HashMap` — associa chaves a valores.
- `ArrayList` — armazena elementos em uma sequência ordenada.
- `HashSet` — armazena elementos únicos, sem garantir a ordem de inserção.

**Integração de Coleções**

Diferentes coleções podem trabalhar juntas para solucionar um problema prático. Neste projeto, o ID do aluno conecta a ordem de cadastro do `ArrayList` ao aluno armazenado no `HashMap`.

**Records e Imutabilidade**

O Record `Aluno` representa as informações dos estudantes. Como Records são imutáveis, a alteração de informações exige a criação de uma nova instância e a substituição do valor anterior no `HashMap`.

**Consistência dos Dados**

Ao remover um aluno, o sistema precisa atualizar as três coleções para evitar IDs ou matrículas desatualizados.

### 🛣️ Roadmap de Estudos

- [x] Compreender a finalidade do `HashMap`.
- [x] Declarar um `HashMap` utilizando tipos genéricos.
- [x] Armazenar elementos com `put()`.
- [x] Recuperar valores com `get()`.
- [x] Compreender o significado de `null` em uma consulta sem resultado.
- [x] Verificar elementos existentes com `contains()`.
- [x] Integrar `HashMap` com `ArrayList`.
- [x] Utilizar `HashSet` para impedir matrículas duplicadas.
- [x] Representar alunos utilizando Records.
- [x] Implementar o cadastro de alunos.
- [x] Listar alunos cadastrados.
- [x] Buscar alunos por matrícula.
- [x] Implementar a remoção de alunos.
- [x] Aplicar validação de entradas.
- [x] Construir um menu com `switch` e `do/while`.

</details>

---

<div align="center">

## 🚀 Next Steps

Continue developing Java knowledge by exploring additional collection structures, understanding their performance characteristics, and applying them to increasingly complex projects.

Continue desenvolvendo os conhecimentos em Java explorando outras estruturas de coleções, compreendendo suas características de desempenho e aplicando-as em projetos cada vez mais complexos.

## 📚 Repository

Part of the **Java-Learning-Library**, a collection of practical projects documenting the learning process from Java fundamentals to more advanced concepts.

Parte da **Java-Learning-Library**, uma coleção de projetos práticos que documentam o processo de aprendizagem, desde os fundamentos de Java até conceitos mais avançados.

**Made with ☕, curiosity, and consistency.**

**Feito com ☕, curiosidade e consistência.**

</div>