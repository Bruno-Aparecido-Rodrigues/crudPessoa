package io.github.fatec.repository;

import io.github.fatec.entity.Pessoa;
import io.github.fatec.repository.adapter.PessoaRepositoryAdapter;
import io.github.fatec.repository.mongo.PessoaRepositoryWithMongoDB;
import io.github.fatec.repository.orm.PessoaOrmMongo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PessoaRepositoryImpl implements PessoaRepository {

    private final PessoaRepositoryWithMongoDB repository;

    public PessoaRepositoryImpl(PessoaRepositoryWithMongoDB repository) {
        this.repository = repository;
    }

    @Override
    public Pessoa salve(Pessoa pessoa) {

        PessoaOrmMongo orm = PessoaRepositoryAdapter.castEntity(pessoa);

        PessoaOrmMongo ormSave = repository.save(orm);

        return PessoaRepositoryAdapter.castOrm(ormSave);
    }

    @Override
    public Pessoa atualizar(Pessoa pessoa) {

        PessoaOrmMongo orm = PessoaRepositoryAdapter.castEntity(pessoa);

        PessoaOrmMongo ormUpdate = repository.save(orm);

        return PessoaRepositoryAdapter.castOrm(ormUpdate);
    }

    @Override
    public void deletar(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Pessoa> listar() {

        return repository.findAll()
                .stream()
                .map(PessoaRepositoryAdapter::castOrm)
                .collect(Collectors.toList());
    }
}