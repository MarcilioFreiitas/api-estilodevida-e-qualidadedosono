package com.qualidadedevida.api.repository;

import com.qualidadedevida.api.model.RegistroDeSono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RegistroDeSonoRepository extends JpaRepository<RegistroDeSono, Long> {

    // Filtra registros pelo gênero (ignorando diferenças de maiúsculas/minúsculas) e faixa etária
    List<RegistroDeSono> findByGeneroIgnoreCaseAndIdadeBetween(String genero, Integer idadeMin, Integer idadeMax);

    // Pesquisa por um termo nos campos "transtornoDoSono" ou "qualidadeDoSono"
    List<RegistroDeSono> findByTranstornoDoSonoContainingIgnoreCaseOrQualidadeDoSonoContainingIgnoreCase(String termo1, String termo2);
}
