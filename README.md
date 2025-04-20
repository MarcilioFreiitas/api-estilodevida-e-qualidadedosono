# Qualidade de Vida API 🛌✨

A **Qualidade de Vida API** é uma solução RESTful desenvolvida em **Java 17** com o framework **Spring Boot**. Ela foi criada para ajudar tanto **pessoas** quanto **empresas** a analisar e melhorar a qualidade do sono, fornecendo dados detalhados e insights estratégicos para promover a saúde e o bem-estar. 💡

---

## 🔎 Visão Geral

A API oferece endpoints para:
- Consultar **registros de sono** com filtros por gênero e faixa etária.
- Buscar registros específicos por um termo nos campos de "qualidade do sono" e "transtorno do sono".
- Gerar **relatórios e indicadores estatísticos** que agregam dados como:
  - Média da duração do sono
  - Total de registros
  - Distribuição dos registros por gênero
  - Agrupamento dos registros por faixas etárias

Esses recursos auxiliam:
- **Pessoas:** Que desejam compreender melhor seus hábitos de sono e receber recomendações para melhorar o descanso.
- **Empresas:** Que necessitam monitorar e promover programas de bem-estar para os colaboradores, analisando dados agregados e tendências de saúde.

---

## 🌟 Funcionalidades

- **Consulta de Registros:**  
  Filtre os registros de sono pela query string:
  - Exemplo:  
    ```
    GET /api/v1/registrosSono?genero=Macho&idadeMin=25&idadeMax=35
    ```
- **Busca por Termo:**  
  Pesquise registros utilizando termos-chave:
  - Exemplo:  
    ```
    GET /api/v1/registrosSono/search?termo=Insônia
    ```
- **Indicadores Estatísticos:**  
  Gere relatórios com dados agregados (média, total, distribuição por gênero e faixa etária):
  - Exemplo:  
    ```
    GET /api/v1/registrosSono/relatorios/indicadores
    ```
- **Documentação Interativa:**  
  Explore e teste todos os endpoints via Swagger UI:
  - Acesse:  
    ```
    http://localhost:8080/swagger-ui/index.html
    ```

---

## 💻 Tecnologias Utilizadas

- **Linguagem:** Java 17 ☕
- **Frameworks e Bibliotecas:**
  - Spring Boot 🏗️
  - Spring Data JPA (Hibernate) 🔥
  - Springdoc OpenAPI (Swagger) 📝
  - MySQL 🚀
  - Lombok ⚙️ (para reduzir boilerplate)

---

## ⚙️ Configuração e Execução

### Pré-Requisitos
- **Java 17** ou superior.
- **Maven** para gerenciamento de dependências.
- **MySQL** configurado com o banco de dados chamado `qualidadedevida`.

### Passos para Rodar
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/<seu-usuario>/qualidade-de-vida-api.git
   cd qualidade-de-vida-api
