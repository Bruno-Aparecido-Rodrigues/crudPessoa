package io.github.fatec.service;

import io.github.fatec.entity.Pessoa;
import java.util.List;

public interface PessoaService {

    Pessoa criar(Pessoa pessoa);

    Pessoa atualizar(Pessoa pessoa);

    void deletar(String id);

    List<Pessoa> listar();

}