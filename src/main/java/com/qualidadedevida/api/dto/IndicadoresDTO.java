package com.qualidadedevida.api.dto;

import java.util.Map;

public class IndicadoresDTO {
    
    private Double mediaDuracaoSono;
    private Long totalRegistros;
    private Map<String, Long> registrosPorGenero;
    private Map<String, Long> registrosPorFaixaEtaria;

    public IndicadoresDTO() {
    }

    public IndicadoresDTO(Double mediaDuracaoSono, Long totalRegistros, 
                          Map<String, Long> registrosPorGenero, 
                          Map<String, Long> registrosPorFaixaEtaria) {
        this.mediaDuracaoSono = mediaDuracaoSono;
        this.totalRegistros = totalRegistros;
        this.registrosPorGenero = registrosPorGenero;
        this.registrosPorFaixaEtaria = registrosPorFaixaEtaria;
    }

    public Double getMediaDuracaoSono() {
        return mediaDuracaoSono;
    }

    public void setMediaDuracaoSono(Double mediaDuracaoSono) {
        this.mediaDuracaoSono = mediaDuracaoSono;
    }

    public Long getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(Long totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    public Map<String, Long> getRegistrosPorGenero() {
        return registrosPorGenero;
    }

    public void setRegistrosPorGenero(Map<String, Long> registrosPorGenero) {
        this.registrosPorGenero = registrosPorGenero;
    }

    public Map<String, Long> getRegistrosPorFaixaEtaria() {
        return registrosPorFaixaEtaria;
    }

    public void setRegistrosPorFaixaEtaria(Map<String, Long> registrosPorFaixaEtaria) {
        this.registrosPorFaixaEtaria = registrosPorFaixaEtaria;
    }
}
