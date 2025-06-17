# Tratamento de Exceptions em Java

## ✨ O que são Exceptions?

Em Java, *exceptions* são problemas que ocorrem durante a execução do programa, como acessar um arquivo inexistente ou dividir por zero. Quando isso acontece, o Java lança uma exceção que pode ser capturada (tratada) para evitar que o programa falhe.

---

## 📅 Tipos de Exceptions

* **Checked Exceptions**: Precisam ser tratadas com `try/catch` ou declaradas com `throws`. Ex: `IOException`, `SQLException`.
* **Unchecked Exceptions**: Não precisam ser tratadas obrigatoriamente. Ex: `NullPointerException`, `IllegalArgumentException`.

---

## 🔄 Criar, Lançar e Tratar Exceptions

| Etapa      | Descrição                                                                                |
| ---------- | ---------------------------------------------------------------------------------------- |
| **Criar**  | Definir uma classe de exceção personalizada (extends `Exception` ou `RuntimeException`). |
| **Lançar** | Usar `throw` para sinalizar que algo deu errado e uma exceção deve ser propagada.        |
| **Tratar** | Usar `try/catch` para capturar a exceção e lidar com o erro.                             |

---

## 📍 Onde cada etapa deve ocorrer nas camadas da aplicação?

| Camada               | Responsabilidade com exceções                                        |
| -------------------- | -------------------------------------------------------------------- |
| **Model/Entidade**   | Evitar lógica e lançamento de exceções.                              |
| **Repository (DAO)** | Pode **lançar** exceções técnicas como `SQLException`.               |
| **Service**          | Pode **tratar** exceções técnicas ou **lançar** exceções de negócio. |
| **Controller**       | Deve **tratar** exceções de negócio e responder ao usuário.          |
| **Exceptions**       | Onde se **criam** exceções personalizadas.                           |

---

## 🔧 Exemplo Prático

### 1. Criando exceção personalizada

```java
public class UsuarioNaoEncontradoException extends RuntimeException {
    public UsuarioNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
```

### 2. Lançando exceção na camada Repository

```java
public Usuario buscarPorId(String id) throws SQLException {
    throw new SQLException("Erro de conexão");
}
```

### 3. Tratando e relançando na camada Service

```java
public Usuario buscarUsuario(String id) {
    try {
        return usuarioRepository.buscarPorId(id);
    } catch (SQLException e) {
        throw new UsuarioNaoEncontradoException("Usuário não encontrado: " + id);
    }
}
```

---

## ✅ Boas Práticas

* Crie exceções específicas para regras de negócio.
* Evite expor erros técnicos ao usuário final.
* Use `try/catch` apenas onde realmente faz sentido.
* Não engula exceções com `catch (Exception e) {}` sem tratamento.

