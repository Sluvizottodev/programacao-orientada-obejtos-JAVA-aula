# Questões da Prova - Programação Orientada a Objetos em Java

Este repositório contém as questões da prova de POO para serem implementadas em Java, focando em conceitos de abstração, herança, polimorfismo e encapsulamento.

---

## 1. Classe Veículo (2,0 pontos)

Crie a classe **Veículo** com os atributos:

- `modelo` (tipo a definir)
- `ano` (tipo a definir)
- `valorMercado` (tipo a definir)  

O construtor deve receber essas três informações inicialmente, mas os valores podem ser alterados posteriormente.

Além disso, a classe deve ter um atributo `motor` (tipo a ser definido pelo aluno).

**Regras:**

- A classe **Veículo** deve ser **abstrata** (não pode ser instanciada diretamente).
- Garantir que todos os objetos derivados de **Veículo** possam se representar adequadamente, aplicando polimorfismo.

---

## 2. Subclasses de Veículo (3,0 pontos)

Crie as seguintes subclasses que herdam de **Veículo**:

- **Carro**: com as mesmas características de **Veículo**.
- **Caminhão**: que adiciona um atributo inteiro obrigatório `capacidadeCarga` (deve ser fornecido no construtor).

---

## 3. Cálculo de Imposto (2,0 pontos)

Cada subclasse deve implementar o método `gerarImposto()` para calcular seu imposto específico:

- **Carro**: imposto de 10% sobre o valor de mercado.
- **Caminhão**: imposto de 20% sobre o valor de mercado.

**Requisito:**

- Garantir que todas as subclasses de **Veículo** implementem o método `gerarImposto()`.

---

## 4. Classe para Acumular Impostos (2,0 pontos)

Crie a classe **SistemaImpostos** com:

- Método `acumularImposto(Veiculo veiculo)`: soma o imposto gerado pelo veículo ao atributo `totalImpostos`.
- Método `getTotalImpostos()`: retorna o valor acumulado dos impostos.

---

## Observações Gerais

- Não é necessário criar uma classe de teste com método `main`.
- A ausência de boas práticas (encapsulamento, herança, polimorfismo) resultará em perda de pontos.
- Para atributos não especificados (ex: motor), basta incluir comentários como `// get e set` ou `// set`.
- Dica: utilize classes e métodos abstratos para garantir a implementação obrigatória dos requisitos.

---

Boa sorte!
