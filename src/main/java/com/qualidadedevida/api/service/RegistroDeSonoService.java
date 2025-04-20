package com.qualidadedevida.api.service;

import com.qualidadedevida.api.dto.IndicadoresDTO;
import com.qualidadedevida.api.dto.RegistroDeSonoDTO;
import java.util.List;

public interface RegistroDeSonoService {

    List<RegistroDeSonoDTO> obterRegistros(String genero, Integer idadeMin, Integer idadeMax);
    
    List<RegistroDeSonoDTO> buscarRegistrosPorTermo(String termo);

    // Novo método para obter indicadores
    IndicadoresDTO obterIndicadores();
}
