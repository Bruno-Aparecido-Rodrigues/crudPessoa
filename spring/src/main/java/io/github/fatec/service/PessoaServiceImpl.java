package io.github.fatec.service;

import io.github.fatec.entity.Pessoa;
import io.github.fatec.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository repository;

    public PessoaServiceImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Pessoa criar(Pessoa pessoa) {
        return repository.salve(pessoa);
    }

    @Override
    public Pessoa atualizar(Pessoa pessoa) {
        return repository.atualizar(pessoa);
    }

    @Override
    public void deletar(String id) {
        repository.deletar(id);
    }

    @Override
    public List<Pessoa> listar() {
        return repository.listar();
    }
}