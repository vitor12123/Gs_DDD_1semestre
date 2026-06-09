# Gs_DDD_1semestre

# Gs_DDD_1semestre

## 🚀 Simulador de Viabilidade de Missões Espaciais

### 📖 Sobre o Projeto

Este projeto foi desenvolvido em Java com o objetivo de simular a viabilidade de missões espaciais utilizando conceitos básicos de física orbital. O projeto faz referência à metodologia Domain-Driven Design (DDD) como base conceitual para organização do código.

O sistema analisa se um foguete possui capacidade suficiente para realizar uma missão espacial considerando três fatores principais:

- Capacidade de atingir a velocidade necessária para sair da órbita terrestre.
- Quantidade de combustível disponível para alcançar o destino selecionado.
- Distância até o planeta escolhido (tempo de viagem pode ser calculado a partir da velocidade).

O projeto utiliza a **Equação de Tsiolkovsky** para estimar o desempenho do foguete com base em sua massa, combustível disponível e velocidade de exaustão.

---

### 🎯 Objetivos

O sistema foi criado para responder às seguintes perguntas:

1. O foguete possui velocidade suficiente para atingir a órbita desejada?
2. Existe combustível suficiente para completar a missão?
3. Qual a distância até o planeta selecionado?

---

### 🛠 Tecnologias Utilizadas

- Java 21
- Programação Orientada a Objetos (POO)
- Conceitos de Domain-Driven Design (DDD) como referência para organização em camadas

---

### 🏗 Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

| Pacote | Responsabilidade |
|--------|------------------|
| `dataset` | Armazena os dados dos foguetes disponíveis (simula uma base de dados em memória) |
| `orbita` | Contém a lógica de verificação de saída da órbita terrestre |
| `destino` | Contém a lógica de verificação de combustível e distância dos planetas |

#### Dataset

Responsável por armazenar os foguetes disponíveis e seus respectivos atributos.

Informações armazenadas:
- Nome do foguete
- Massa inicial / final
- Massa do combustível
- Velocidade de exaustão
- Velocidade estimada

O combustível utilizado no projeto é baseado no querosene RP-1.

#### Entrando em Órbita (`VerificadorSaida`)

Classe responsável por:
- Coletar informações do foguete selecionado
- Calcular a massa final do foguete
- Aplicar a Equação de Tsiolkovsky
- Verificar se o foguete possui velocidade suficiente para atingir a órbita desejada

#### Verificar Combustível (`VerificarCombustivel`)

Classe responsável por:
- Verificar a quantidade de combustível disponível
- Determinar se a quantidade é suficiente para alcançar o destino escolhido (comparação simplificada entre litros e distância)

#### Tempo até o Destino (`TempoDestino`)

Classe responsável por:
- Selecionar o planeta de destino
- Definir a distância aproximada até o planeta (em km)
- Retornar a distância para cálculos posteriores

---

### 🌎 Entidades do Domínio (intenção de modelagem)

As principais entidades identificadas no domínio são:

#### Foguete

Representa o veículo espacial utilizado na missão.

Atributos principais:
- Massa inicial
- Massa final
- Quantidade de combustível
- Velocidade estimada

#### Combustível

Representa o combustível utilizado pelo foguete durante a missão.

Responsabilidades:
- Armazenar a quantidade disponível
- Participar dos cálculos de massa e desempenho

#### Planeta

Representa o destino da missão espacial.

Responsabilidades:
- Armazenar a distância em relação à Terra
- Fornecer a distância para verificação de combustível

---

### 📐 Conceitos Físicos Utilizados

#### Equação de Tsiolkovsky

A principal fórmula utilizada no projeto é a Equação de Tsiolkovsky:

**Δv = Ve × ln(Mi / Mf)**

Onde:
- Δv = variação de velocidade (Delta-V)
- Ve = velocidade de exaustão
- Mi = massa inicial
- Mf = massa final

Essa equação permite determinar a velocidade que o foguete pode atingir a partir de sua quantidade de combustível.

---

### 📦 Estrutura de Dados (inspiração para Value Objects)

O projeto utiliza tipos primitivos e objetos simples para representar conceitos como:

- Delta Velocidade (Δv) – calculado dentro da lógica de verificação
- Velocidade de Exaustão – armazenada como `double`
- Massa Inicial / Final – armazenadas como `double` e `Long`
- Velocidade Estimada – armazenada como `double`

> **Observação:** Em uma versão futura, esses conceitos podem ser refinados para Value Objects imutáveis com validação própria.

---

### 🔗 Organização dos Dados

#### Dataset-Itens

Classe responsável por agrupar os dados dos foguetes utilizados durante as simulações. Atua como uma estrutura de dados em memória.

---

### 📋 Regras de Domínio

As principais regras implementadas são:

1. Calcular se o foguete possui velocidade suficiente para entrar em órbita (comparação com 11.200 m/s)
2. Aplicar a Equação de Tsiolkovsky para estimar o Delta-V
3. Verificar a disponibilidade de combustível para completar a missão (comparação direta entre litros e distância)
4. Obter a distância até o destino escolhido

---

### 🔔 Registro de Eventos (simplificado)

O projeto registra os resultados das verificações por meio de saída no console. Os principais pontos de interesse são:

- Cálculo do Delta-V para cada foguete
- Resultado da verificação de saída de órbita (aprovado/reprovado)
- Resultado da verificação de combustível

---

### 💾 Persistência de Dados

O projeto utiliza uma **lista interna de foguetes** simulando uma base de dados em memória, implementada diretamente na classe `VerificadorSaida`.

Atualmente **não há implementação de repositórios ou interfaces**, pois os dados são carregados diretamente pela classe responsável pelo dataset.

**Próximos passos (em versões futuras):**
- Implementar o padrão Repository com interface no domínio
- Criar implementação mock para testes
- Separar infraestrutura de domínio

---

### ▶ Como Executar

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>

---
