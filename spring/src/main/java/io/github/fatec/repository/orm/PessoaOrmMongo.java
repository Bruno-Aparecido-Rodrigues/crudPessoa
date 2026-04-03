package io.github.fatec.repository.orm;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pessoas")
public record PessoaOrmMongo(

        @Id
        String id,
        String nome,
        String telefone
) {}