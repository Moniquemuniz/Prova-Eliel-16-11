
package com.crud.pessoa.repository;

import com.crud.pessoa.models.EscolaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EscolaRepo extends JpaRepository<EscolaModel, Long> {

    Optional<EscolaModel> findByNome(String nome);

}
