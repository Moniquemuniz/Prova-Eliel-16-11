
package com.crud.pessoa.services;

import com.crud.pessoa.models.EscolaModel;
import com.crud.pessoa.repository.EscolaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EscolaServ {

    @Autowired
    private EscolaRepo escolaRepo;

    // Listar todas as pessoas
    public List<EscolaModel> listar() {
        return escolaRepo.findAll();
    }

    // Cadastrar pessoa
    public EscolaModel salvar(EscolaModel escolaModel) {
        return escolaRepo.save(escolaModel);
    }

    // Buscar pessoa pelo nome
    public Optional<EscolaModel> buscarPorNome(String nome) {
        return escolaRepo.findByNome(nome);
    }
}
