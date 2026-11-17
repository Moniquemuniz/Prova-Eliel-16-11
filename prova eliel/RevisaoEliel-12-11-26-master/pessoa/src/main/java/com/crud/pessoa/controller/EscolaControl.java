
package com.crud.pessoa.controller;

import com.crud.pessoa.models.EscolaModel;
import com.crud.pessoa.services.EscolaServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class EscolaControl {

    @Autowired
    private EscolaServ escolaServ;

    // GET - Listar todas as pessoas
    @GetMapping
    public List<EscolaModel> listar() {
        return escolaServ.listar();
    }

    // POST - Cadastrar uma pessoa
    @PostMapping
    public EscolaModel cadastrar(@RequestBody EscolaModel escolaModel) {
        return escolaServ.salvar(escolaModel);
    }
}
