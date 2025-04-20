package com.qualidadedevida.api.dto;

public class RegistroDeSonoDTO {

    private Long id;
    private String genero;
    private Integer idade;
    private String ocupacao;
    private Double duracaoDoSono;
    private String qualidadeDoSono;
    private String nivelAtividadeFisica;
    private String nivelEstresse;
    private String categoriaIMC;
    private String pressaoArterial;
    private Integer frequenciaCardiaca;
    private Integer etapasDiarias;
    private String transtornoDoSono;

    // Construtor padrão
    public RegistroDeSonoDTO() {
    }

    // Construtor com todos os campos
    public RegistroDeSonoDTO(Long id, String genero, Integer idade, String ocupacao, Double duracaoDoSono,
                              String qualidadeDoSono, String nivelAtividadeFisica, String nivelEstresse,
                              String categoriaIMC, String pressaoArterial, Integer frequenciaCardiaca,
                              Integer etapasDiarias, String transtornoDoSono) {
        this.id = id;
        this.genero = genero;
        this.idade = idade;
        this.ocupacao = ocupacao;
        this.duracaoDoSono = duracaoDoSono;
        this.qualidadeDoSono = qualidadeDoSono;
        this.nivelAtividadeFisica = nivelAtividadeFisica;
        this.nivelEstresse = nivelEstresse;
        this.categoriaIMC = categoriaIMC;
        this.pressaoArterial = pressaoArterial;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.etapasDiarias = etapasDiarias;
        this.transtornoDoSono = transtornoDoSono;
    }

    // Getters e Setters para todos os campos

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
