package com.qualidadedevida.api.service;

import com.qualidadedevida.api.dto.IndicadoresDTO;
import com.qualidadedevida.api.dto.RegistroDeSonoDTO;
import com.qualidadedevida.api.model.RegistroDeSono;
import com.qualidadedevida.api.repository.RegistroDeSonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class RegistroDeSonoServiceImpl implements RegistroDeSonoService {

    @Autowired
    private RegistroDeSonoRepository repository;

    @Override
    public List<RegistroDeSonoDTO> obterRegistros(String genero, Integer idadeMin, Integer idadeMax) {
        List<RegistroDeSono> registros;
        if (genero != null && idadeMin != null && idadeMax != null) {
            registros = repository.findByGeneroIgnoreCaseAndIdadeBetween(genero, idadeMin, idadeMax);
        } else {
            registros = repository.findAll();
        }
        return registros.stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<RegistroDeSonoDTO> buscarRegistrosPorTermo(String termo) {
        List<RegistroDeSono> registros = repository.findByTranstornoDoSonoContainingIgnoreCaseOrQualidadeDoSonoContainingIgnoreCase(termo, termo);
        return registros.stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }

    // Novo método para obter indicadores
    @Override
    public IndicadoresDTO obterIndicadores() {
        List<RegistroDeSono> registros = repository.findAll();
        
        // Calcula a média de duração do sono (ignorando registros com valor nulo)
        Double mediaDuracao = registros.stream()
                .filter(r -> r.getDuracaoDoSono() != null)
                .mapToDouble(RegistroDeSono::getDuracaoDoSono)
                .average()
                .orElse(0.0);

        // Total de registros
        Long totalRegistros = (long) registros.size();
        
        // Agrupamento por gênero (usando gênero em letras maiúsculas para consistência)
        Map<String, Long> registrosPorGenero = registros.stream()
                .filter(r -> r.getGenero() != null)
                .collect(Collectors.groupingBy(r -> r.getGenero().toUpperCase(), Collectors.counting()));

        // Agrupamento por faixa etária. Exemplo simples:
        // "18-25", "26-35", "36-45" e "46+"
        Map<String, Long> registrosPorFaixaEtaria = registros.stream()
                .filter(r -> r.getIdade() != null)
                .collect(Collectors.groupingBy(idadeGrouping(), Collectors.counting()));

        return new IndicadoresDTO(mediaDuracao, totalRegistros, registrosPorGenero, registrosPorFaixaEtaria);
    }

    // Função auxiliar para agrupar faixas etárias
    private Function<RegistroDeSono, String> idadeGrouping() {
        return registro -> {
            int idade = registro.getIdade();
            if (idade >= 18 && idade <= 25) {
                return "18-25";
            } else if (idade >= 26 && idade <= 35) {
                return "26-35";
            } else if (idade >= 36 && idade <= 45) {
                return "36-45";
            } else {
                return "46+";
            }
        };
    }

    // Método auxiliar para converter a entidade em DTO com todos os campos importantes
    private RegistroDeSonoDTO converterParaDTO(RegistroDeSono registro) {
        return new RegistroDeSonoDTO(
                registro.getId(),
                registro.getGenero(),
                registro.getIdade(),
                registro.getOcupacao(),
                registro.getDuracaoDoSono(),
                registro.getQualidadeDoSono(),
                registro.getNivelAtividadeFisica(),
                registro.getNivelEstresse(),
                registro.getCategoriaIMC(),
                registro.getPressaoArterial(),
                registro.getFrequenciaCardiaca(),
                registro.getEtapasDiarias(),
                registro.getTranstornoDoSono()
        );
    }
}
