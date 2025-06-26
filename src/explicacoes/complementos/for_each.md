# 🔁 Uso do `for-each` em Java

O `for-each` é uma forma **simples, legível e segura** de percorrer coleções (como listas, arrays, conjuntos) **sem se preocupar com índices**.

---

## ✅ Sintaxe

```java
for (Tipo elemento : colecao) {
    // usar o elemento
}
```

* `Tipo`: o tipo de cada item da coleção (ex: `String`, `int`, `Pessoa`, etc).
* `elemento`: uma variável temporária que representa cada item da coleção.
* `colecao`: um array ou uma classe que implementa `Iterable` (como `List`, `Set`, etc).

---

## 📈 Exemplo com List

```java
List<String> nomes = List.of("Ana", "Bruno", "Carlos");

for (String nome : nomes) {
    System.out.println(nome);
}
```

---

## 📈 Exemplo com Array

```java
int[] numeros = {10, 20, 30};

for (int n : numeros) {
    System.out.println(n);
}
```

---

## 🔒 Observações importantes

* Você **não pode alterar** diretamente os elementos dentro do `for-each`.
* Ele **não fornece o índice** do elemento atual.
* Se você precisa modificar a lista ou saber o índice, use o `for` tradicional:

```java
for (int i = 0; i < lista.size(); i++) {
    System.out.println(lista.get(i));
}
```

---

## ❌ Erros comuns

| Erro                                          | Correto                     |
| --------------------------------------------- | --------------------------- |
| Tentar modificar a lista dentro do `for-each` | Use `Iterator`              |
| Usar índice dentro do `for-each`              | Use `for` com índice        |
| Esquecer o tipo correto do elemento           | Verifique o tipo da coleção |

---

## 🧐 Quando usar `for-each`?

* Quando você **apenas quer ler ou processar** os itens de uma coleção.
* Quando **não precisa do índice**.
* Quando deseja **simplicidade e clareza no código**.

---

## ✅ Conclusão

O `for-each` é uma ferramenta poderosa para **iterar coleções de forma segura e limpa**.
Use-o sempre que possível para tornar seu código mais legível e com menos erros.

```java
for (Elemento e : colecao) {
    // Lógica com o elemento e
}
```

---
