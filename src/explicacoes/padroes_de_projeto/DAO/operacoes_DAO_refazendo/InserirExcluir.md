# DAO: Operações de Inserção e Exclusão

Este documento descreve como implementar as operações de inserção (INSERT) e exclusão (DELETE) em um padrão DAO (Data Access Object) em Java usando JDBC.

---

## 📋 Estrutura Geral do Projeto

* **Modelo**: classe que representa a entidade de domínio (por exemplo, `VeiculoAutomotor`).
* **Exceção de Domínio**: classe para tratar erros específicos (por exemplo, `DominioException`).
* **DAO**: classe responsável pelo acesso a dados (por exemplo, `VeiculoAutomotorDAO`).

---

## ✅ Pré-requisitos

1. Java 8 ou superior.
2. Driver JDBC compatível (MySQL, PostgreSQL etc.).
3. Conexão de banco de dados configurada (via `DriverManager` ou fábrica de conexões).

---

## 1. Operação de Inserção

### 1.1 Fluxo Geral

1. Receber a instância do modelo com os dados a serem persistidos.
2. Montar a instrução `INSERT` com parâmetros (`?`) para cada campo.
3. Criar um `PreparedStatement` a partir da conexão.
4. Atribuir os valores dos atributos do modelo nos parâmetros do `PreparedStatement`.
5. Executar `executeUpdate()` e obter o número de linhas afetadas.
6. Capturar `SQLException` e lançar a `DominioException` com mensagem adequada.

### 1.2 Exemplo de Pseudocódigo

```java
public int inserir(T entidade) throws DominioException {
    String sql = "INSERT INTO tabela(col1, col2, ...) VALUES (?, ?, ...)";
    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setTipo(1, entidade.getAtributo1());
        stmt.setTipo(2, entidade.getAtributo2());
        // ...
        return stmt.executeUpdate();
    } catch (SQLException e) {
        throw new DominioException("Erro ao inserir: " + e.getMessage());
    }
}
```

---

## 2. Operação de Exclusão

### 2.1 Fluxo Geral

1. Receber o identificador (`id`) da entidade a ser removida.
2. Montar a instrução `DELETE` com cláusula `WHERE id = ?`.
3. Criar um `PreparedStatement`.
4. Atribuir o valor do `id` no parâmetro.
5. Executar `executeUpdate()` e verificar o número de linhas afetadas.
6. Em caso de erro, capturar `SQLException` e lançar `DominioException`.

### 2.2 Exemplo de Pseudocódigo

```java
public int excluirPorId(int id) throws DominioException {
    String sql = "DELETE FROM tabela WHERE id = ?";
    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setInt(1, id);
        return stmt.executeUpdate();
    } catch (SQLException e) {
        throw new DominioException("Erro ao excluir: " + e.getMessage());
    }
}
```

---

## 3. Uso em Camada de Serviço ou Apresentação

Após implementar os métodos `inserir` e `excluirPorId` no DAO:

1. Obtenha ou injete a instância do DAO com uma conexão válida.
2. Chame `inserir(entidade)` para adicionar registros.
3. Chame `excluirPorId(id)` para remover registros.
4. Trate `DominioException` para exibir feedback ao usuário ou realizar rollback de transações.

---

## 4. Boas Práticas

* **Try-with-resources**: garante fechamento automático de recursos (statements e result sets).
* **PreparedStatement**: evita SQL Injection.
* **Separação de Responsabilidades**: DAO apenas acessa dados; lógica de negócio fica em outra camada.
* **Mensagens Claras**: ao lançar `DominioException`, inclua contexto na mensagem.
* **Testes Unitários**: utilize mocks de conexão para testar métodos de DAO sem acesso real ao banco.

---

Com este guia, você pode criar operações de inserção e exclusão consistentes em qualquer DAO, seguindo o padrão acadêmico e boas práticas de desenvolvimento Java e JDBC.
