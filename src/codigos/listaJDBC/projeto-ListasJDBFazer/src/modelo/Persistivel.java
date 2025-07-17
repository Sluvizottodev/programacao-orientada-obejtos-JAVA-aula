package modelo;

import java.util.List;

public interface Persistivel<T> {
    T inserir(T obj) throws DominioException;
    int alterar(T obj) throws DominioException;
    int excluir(int id) throws DominioException;
    List<T> listarTodos() throws DominioException;
    T obterPeloId(int id) throws DominioException;
}