# DAO (Data Access Object) em Java

## O que é DAO?

DAO, ou **Data Access Object**, é um padrão de projeto (design pattern) muito utilizado em aplicações Java para separar a lógica de acesso a dados da lógica de negócio.

Em outras palavras, o DAO é responsável por encapsular todas as operações que envolvem o acesso ao banco de dados, como criar, ler, atualizar e deletar registros (as chamadas operações CRUD).

## Por que usar DAO?

* **Separa responsabilidades:** Mantém o código mais organizado ao isolar as operações de banco de dados da lógica principal da aplicação.
* **Facilita a manutenção:** Se precisar trocar o banco de dados ou a forma de acesso, você altera apenas o DAO.
* **Melhora a testabilidade:** Permite criar testes mais facilmente, simulando o acesso a dados.
* **Reutilização:** Pode ser reutilizado em diferentes partes da aplicação ou em diferentes projetos.

## Como funciona um DAO em Java?

Um DAO geralmente é representado por uma interface e uma implementação concreta. A interface define os métodos para manipulação dos dados, como:

* `save()` — para salvar um objeto no banco.
* `update()` — para atualizar um objeto existente.
* `delete()` — para remover um objeto.
* `findById()` — para buscar um objeto pelo identificador.
* `findAll()` — para listar todos os objetos.

A implementação usa APIs de persistência, como JDBC, JPA, Hibernate, entre outras, para executar essas operações no banco de dados.

## Exemplo simples de DAO usando JDBC

### Interface:

```java
public interface UsuarioDAO {
    void salvar(Usuario usuario);
    Usuario buscarPorId(int id);
    void atualizar(Usuario usuario);
    void deletar(int id);
    List<Usuario> listarTodos();
}
```

### Implementação:

```java
public class UsuarioDAOImpl implements UsuarioDAO {

    private Connection conexao;

    public UsuarioDAOImpl(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void salvar(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // demais métodos
}
```

## Conclusão

O padrão DAO é fundamental para organizar o acesso a dados em projetos Java, promovendo um código mais limpo, modular e fácil de manter. Ele facilita futuras mudanças no banco de dados e melhora a qualidade geral do software.