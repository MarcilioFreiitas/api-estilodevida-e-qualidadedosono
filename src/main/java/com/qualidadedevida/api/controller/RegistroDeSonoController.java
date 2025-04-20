package com.qualidadedevida.api.controller;

import com.qualidadedevida.api.dto.IndicadoresDTO;
import com.qualidadedevida.api.dto.RegistroDeSonoDTO;
import com.qualidadedevida.api.service.RegistroDeSonoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/registrosSono")
@Tag(name = "Registros de Sono", description = "Endpoints para consulta, filtragem e análise dos registros de sono")
public class RegistroDeSonoController {

    @Autowired
    private RegistroDeSonoService service;

    @Operation(
        summary = "Consulta de registros",
        description = "Retorna uma lista de registros filtrados por gênero e faixa etária. Se nenhum filtro for informado, retorna todos os registros."
    )
    @GetMapping
    public List<RegistroDeSonoDTO> obterRegistros(
            @RequestParam(name = "genero", required = false) String genero,
            @RequestParam(name = "idadeMin", required = false) Integer idadeMin,
            @RequestParam(name = "idadeMax", required = false) Integer idadeMax
    ) {
        return service.obterRegistros(genero, idadeMin, idadeMax);
    }

    @Operation(
        summary = "Busca de registros por termo",
        description = "Pesquisa registros pelo termo informado, aplicando-se aos campos 'transtorno do sono' ou 'qualidade do sono'."
    )
    @GetMapping("/search")
    public List<RegistroDeSonoDTO> buscarRegistros(
            @RequestParam(name = "termo") String termo
    ) {
        return service.buscarRegistrosPorTermo(termo);
    }

    @Operation(
        summary = "Indicadores de qualidade do sono",
        description = "Retorna estatísticas agregadas como média da duração do sono, total de registros, distribuição por gênero e por faixa etária."
    )
    @GetMapping("/relatorios/indicadores")
    public IndicadoresDTO obterIndicadores() {
        return service.obterIndicadores();
    }
}
