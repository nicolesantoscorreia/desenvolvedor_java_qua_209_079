package com.projetofinal.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.projetofinal.app.models.PessoaDesaparecida;

public interface AppRepository extends CrudRepository<PessoaDesaparecida, String> {
    // TODO
}
