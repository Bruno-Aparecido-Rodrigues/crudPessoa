package io.github.fatec.repository;

import io.github.fatec.entity.Pessoa;
import java.util.List;

public interface PessoaRepository {

    Pessoa salve(Pessoa pessoa);

    Pessoa atualizar(Pessoa pessoa);

    void deletar(String id);

    List<Pessoa> listar();

}