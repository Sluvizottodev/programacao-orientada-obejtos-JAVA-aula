# 📘 P1 – POO – 2025

## 📝 Enunciado

Imagine uma empresa que comercializa produtos de limpeza, produtos estéticos e produtos esportivos.  
Leia atentamente as regras e informações a seguir:

---

### 📦 Informações sobre os produtos

Os 3 tipos de produtos possuem algumas características em comum:

- `descrição`
- `precoDeCusto`
- `fornecedor` (que deve ter `cnpj` e `nome`)
- Um método chamado `getPrecoDeVenda()` (que devolve o `precoDeVenda`)
- Um método chamado `getTaxaIPI()` (que devolve o valor da taxa de IPI de cada produto)

---

### 👷 Fornecedor

- Deve ser possível criar um **fornecedor independente de um produto**.
- Só deve ser possível criar um fornecedor fornecendo valores para seus atributos.
- O `cnpj` de um fornecedor deve ter **14 caracteres**, mas essa regra pode ficar mais complicada com o passar do tempo.
- Como já vimos nas aulas, quando uma regra pode se tornar complicada ela **não se encaixa necessariamente dentro de um método set**. Resolva isso.

---

### 💰 Preço de venda

O preço de venda dos produtos considera as seguintes **margens de lucro**:

- **Produto de Limpeza**: margem de lucro de **20%**
- **Produto Estético**: margem de lucro de **30%**
- **Produto Esportivo**: margem de lucro de **25%**

---

### 📊 Taxa de IPI

A taxa de IPI sobre o `precoDeCusto` dos produtos é:

- **Produtos de Limpeza e Estéticos**: **10%**
- **Produtos Esportivos**: **20%**

---

### ⚠️ Regras adicionais

- Além da regra para instanciar um fornecedor, também só deve ser possível instanciar quaisquer desses produtos fornecendo sua **descrição**.
- No caso de **produtos esportivos**, é **obrigatório fornecer também o precoDeCusto**.
- Só devem ser aceitos valores **a partir de R$ 10,00** para o `precoDeCusto` em qualquer circunstância.

Se as regras de validação **não forem atendidas**, basta apenas dar um **simples `return`** e sair do referido método **sem preencher o valor do atributo**.  
Essa regra **vale para qualquer classe citada acima**.

---

### 🧮 Calculador de IPI

O sistema também deve possuir uma classe chamada `CalculadorDeIPI`, que deve ter um método chamado `acumularGastosComIPI`.

- Esse método deverá preencher o valor do atributo `totalDeGastosComIPI`.
- O referido método poderá receber qualquer um dos objetos acima que forneçam o valor de seu IPI, para que ele seja acumulado no atributo citado.

---

### ⚙️ Questão prática

Escreva **todo o código necessário para o sistema citado.**

- **NÃO será necessário** criar uma classe de testes com método principal (`main`)
- **NÃO é necessário** criar **getters** referentes a atributos das classes
- Apenas crie os **setters que possuam alguma regra** e métodos auxiliares, se houver
- **PROIBIDO usar sobrecarga de métodos**

---

### 🔍 Orientações finais

Fica a seu critério:

- Identificar e criar todos os tipos de **classe** e **métodos**
- Determinar os **níveis de visibilidade**
- Estabelecer os **relacionamentos entre as classes**

Contudo:

> O uso de más práticas e/ou métodos e regras duplicados ou fora do lugar ideal resultará em perda de pontos ou anulação da questão.

**Boa prova!**
