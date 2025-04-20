package com.qualidadedevida.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "qualidadedevida")  // Mapeia para a tabela existente
public class RegistroDeSono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    @Column(name = "ID da pessoa") 
    private Long id;

    @Column(name = "genero")
    private String genero;
    
    @Column(name = "idade")
    private Integer idade;
    
    @Column(name = "ocupacao")
    private String ocupacao;

    @Column(name = "duracao_sono") // Ajustado para refletir o nome da coluna no banco
    private Double duracaoDoSono;

    @Column(name = "qualidade_sono") // Ajustado para refletir o nome da coluna no banco
    private String qualidadeDoSono;

    @Column(name = "nivel_atividade_fisica")
    private String nivelAtividadeFisica;

    @Column(name = "nivel_estresse")
    private String nivelEstresse;

    @Column(name = "categoria_imc")
    private String categoriaIMC;

    @Column(name = "pressao_arterial")
    private String pressaoArterial;

    @Column(name = "frequencia_cardiaca")
    private Integer frequenciaCardiaca;

    @Column(name = "etapas_diarias")
    private Integer etapasDiarias;

    @Column(name = "transtorno_sono") // Ajustado para refletir o nome da coluna no banco
    private String transtornoDoSono;

    public RegistroDeSono() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Double getDuracaoDoSono() {
        return duracaoDoSono;
    }

    public void setDuracaoDoSono(Double duracaoDoSono) {
        this.duracaoDoSono = duracaoDoSono;
    }

    public String getQualidadeDoSono() {
        return qualidadeDoSono;
    }

    public void setQualidadeDoSono(String qualidadeDoSono) {
        this.qualidadeDoSono = qualidadeDoSono;
    }

    public String getNivelAtividadeFisica() {
        return nivelAtividadeFisica;
    }

    public void setNivelAtividadeFisica(String nivelAtividadeFisica) {
        this.nivelAtividadeFisica = nivelAtividadeFisica;
    }

    public String getNivelEstresse() {
        return nivelEstresse;
    }

    public void setNivelEstresse(String nivelEstresse) {
        this.nivelEstresse = nivelEstresse;
    }

    public String getCategoriaIMC() {
        return categoriaIMC;
    }

    public void setCategoriaIMC(String categoriaIMC) {
        this.categoriaIMC = categoriaIMC;
    }

    public String getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(String pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public Integer getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(Integer frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public Integer getEtapasDiarias() {
        return etapasDiarias;
    }

    public void setEtapasDiarias(Integer etapasDiarias) {
        this.etapasDiarias = etapasDiarias;
    }

    public String getTranstornoDoSono() {
        return transtornoDoSono;
    }

    public void setTranstornoDoSono(String transtornoDoSono) {
        this.transtornoDoSono = transtornoDoSono;
    }
}
