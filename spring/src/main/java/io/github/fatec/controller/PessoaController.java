package io.github.fatec.controller;

import io.github.fatec.entity.Pessoa;
import io.github.fatec.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa) {
        return service.criar(pessoa);
    }

    @PutMapping
    public Pessoa atualizar(@RequestBody Pessoa pessoa) {
        return service.atualizar(pessoa);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable String id) {

        service.deletar(id);

        return "Usuario: " + id + " deletado";
    }

    @GetMapping
    public List<Pessoa> listar() {
        return service.listar();
    }
}