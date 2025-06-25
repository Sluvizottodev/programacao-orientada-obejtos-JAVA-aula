# 🧠 Java: `Comparable` vs `Comparator`

Este README explica de forma **simples e prática** o uso das interfaces `Comparable` e `Comparator` em Java para ordenação de objetos.

---

## 📌 Quando usar?

* 🔹 **`Comparable`**: quando a **classe sabe se comparar sozinha**, com **1 critério padrão de ordenação**.
* 🔸 **`Comparator`**: quando você quer usar **vários critérios diferentes**, com comparadores **externos**.

---

## ✅ `Comparable` (ordem natural)

### 📘 Como funciona?

Você implementa a interface `Comparable<T>` na **sua classe** e sobrescreve o método:

```java
public int compareTo(T outro);
```

* `negativo`: este objeto é **menor**
* `0`: os objetos são **iguais**
* `positivo`: este objeto é **maior**

### 🧱 Exemplo:

```java
public class Pessoa implements Comparable<Pessoa> {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    @Override
    public int compareTo(Pessoa outra) {
        return this.nome.compareTo(outra.getNome());
    }
}
```

### 🔄 Uso:

```java
List<Pessoa> lista = new ArrayList<>();
lista.add(new Pessoa("Ana"));
lista.add(new Pessoa("Carlos"));
lista.add(new Pessoa("Bruno"));

Collections.sort(lista); // Usa compareTo
```

---

## ✅ `Comparator` (ordens personalizadas)

### 📘 Como funciona?

Você cria uma classe (ou lambda) que implementa:

```java
public int compare(T obj1, T obj2);
```

### 🧱 Exemplo (ordenar por idade):

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() { return idade; }
    public String getNome() { return nome; }
}
```

```java
import java.util.Comparator;

public class ComparadorPorIdade implements Comparator<Pessoa> {
    public int compare(Pessoa p1, Pessoa p2) {
        return Integer.compare(p1.getIdade(), p2.getIdade());
    }
}
```

### 🔄 Uso:

```java
Collections.sort(lista, new ComparadorPorIdade());
```

---

## 💡 Usando lambdas (forma moderna)

```java
lista.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
lista.sort(Comparator.comparing(Pessoa::getIdade));
```

---

## 🆖 Diferenças

| Característica      | Comparable                | Comparator                            |
| ------------------- | ------------------------- | ------------------------------------- |
| Local               | Dentro da própria classe  | Fora da classe                        |
| Método              | `compareTo()`             | `compare()`                           |
| Número de critérios | 1 (ordem natural)         | Vários (flexível)                     |
| Uso                 | `Collections.sort(lista)` | `Collections.sort(lista, comparator)` |

---

## 📌 Dica para provas

* Use `compareTo` para ordenar por `String`, `int`, `double`, etc.
* Prefira `Integer.compare(a, b)` no lugar de `a - b` para evitar erros.
* Use `Comparator` quando quiser comparar por mais de um critério.
* Sempre declare listas com `List<T>` (boa prática de polimorfismo):

```java
List<Pessoa> lista = new ArrayList<>();
```

---

## 👨‍💻 Exemplo completo

```java
import java.util.*;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    @Override
    public int compareTo(Pessoa outra) {
        return this.nome.compareTo(outra.getNome());
    }

    public String toString() {
        return nome + " - " + idade;
    }
}
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Carlos", 30));
        lista.add(new Pessoa("Ana", 22));
        lista.add(new Pessoa("Bruno", 25));

        Collections.sort(lista); // Ordena por nome (Comparable)
        System.out.println("Ordenado por nome:");
        lista.forEach(System.out::println);

        lista.sort(Comparator.comparing(Pessoa::getIdade)); // Comparator por idade
        System.out.println("\nOrdenado por idade:");
        lista.forEach(System.out::println);
    }
}
```