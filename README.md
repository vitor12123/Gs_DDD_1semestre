# Gs_DDD_1semestre

# 🚀 Simulador de Viabilidade de Missões Espaciais

## 📖 Sobre o Projeto

Este projeto foi desenvolvido em Java com o objetivo de simular a viabilidade de missões espaciais utilizando conceitos básicos de física orbital e a metodologia Domain-Driven Design (DDD).

O sistema analisa se um foguete possui capacidade suficiente para realizar uma missão espacial considerando três fatores principais:

* Capacidade de atingir a velocidade necessária para sair da órbita terrestre.
* Quantidade de combustível disponível para alcançar o destino selecionado.
* Tempo estimado de viagem até o planeta escolhido.

O projeto utiliza a Equação de Tsiolkovsky para estimar o desempenho do foguete com base em sua massa, combustível disponível e velocidade de exaustão.

---

# 🎯 Objetivos

O sistema foi criado para responder às seguintes perguntas:

1. O foguete possui velocidade suficiente para atingir a órbita desejada?
2. Existe combustível suficiente para completar a missão?
3. Quanto tempo será necessário para chegar ao planeta selecionado?

---

# 🛠 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Domain-Driven Design (DDD)

---

# 🏗 Estrutura do Projeto

## Dataset

Responsável por armazenar os foguetes disponíveis e seus respectivos atributos.

Informações armazenadas:

* Nome do foguete
* Massa inicial
* Massa do combustível
* Velocidade de exaustão
* Demais características utilizadas nos cálculos

O combustível utilizado no projeto é baseado no querosene RP-1.

---

## Entrando em Órbita

Classe responsável por:

* Coletar informações do foguete selecionado.
* Calcular a massa final do foguete.
* Aplicar a Equação de Tsiolkovsky.
* Verificar se o foguete possui velocidade suficiente para atingir a órbita desejada.

---

## Verificar Combustível

Classe responsável por:

* Verificar a quantidade de combustível restante após a saída da órbita terrestre.
* Determinar se a quantidade disponível é suficiente para alcançar o destino escolhido.

---

## Tempo até o Destino

Classe responsável por:

* Selecionar o planeta de destino.
* Definir a distância aproximada até o planeta.
* Calcular o tempo estimado de viagem com base na velocidade do foguete.

---

# 🌎 Entidades do Domínio

## Foguete

Representa o veículo espacial utilizado na missão.

### Atributos principais

* Massa inicial
* Massa final
* Quantidade de combustível
* Velocidade estimada

---

## Combustível

Representa o combustível utilizado pelo foguete durante a missão.

### Responsabilidades

* Armazenar a quantidade disponível.
* Participar dos cálculos de massa e desempenho.

---

## Planeta

Representa o destino da missão espacial.

### Responsabilidades

* Armazenar a distância em relação à Terra.
* Permitir o cálculo do tempo de viagem.

---

# 📐 Conceitos Físicos Utilizados

## Equação de Tsiolkovsky

A principal fórmula utilizada no projeto é a Equação de Tsiolkovsky:

Δv = Ve × ln(Mi / Mf)

Onde:

* Δv = variação de velocidade (Delta-V)
* Ve = velocidade de exaustão
* Mi = massa inicial
* Mf = massa final

Essa equação permite determinar a velocidade que o foguete pode atingir a partir de sua quantidade de combustível.

---

# 📦 Value Objects

O projeto utiliza os seguintes Value Objects:

* Delta Velocidade (Δv)
* Velocidade de Exaustão
* Massa Inicial
* Massa Final
* Velocidade Estimada

---

# 🔗 Agregados

## Dataset-Itens

Responsável por agrupar os dados dos foguetes utilizados durante as simulações.

---

# 📋 Regras de Domínio

As principais regras implementadas são:

1. Calcular se o foguete possui velocidade suficiente para entrar em órbita.
2. Aplicar a Equação de Tsiolkovsky para estimar o desempenho.
3. Verificar a disponibilidade de combustível para completar a missão.
4. Calcular o tempo necessário para chegar ao destino escolhido.

---

# 📢 Eventos de Domínio

Eventos representados pelos métodos:

* getMassaInicial()
* getMassaFinal()
* getVelocidadeEstimada()
* getMassaCombustivel()
* destino(planeta)

---

# 💾 Repositórios e Interfaces

O projeto utiliza uma lista interna de foguetes para simular uma base de dados.

Atualmente não foram implementados repositórios ou interfaces específicas, pois os dados são carregados diretamente pela classe responsável pelo dataset.

Em futuras versões, a classe Dataset-Itens poderá ser adaptada para utilizar persistência em banco de dados e padrões Repository.

---

# ▶ Como Executar

1. Clone o repositório:

```bash
git clone <url-do-repositorio>
```

2. Abra o projeto em sua IDE Java de preferência.

3. Execute a classe principal.

4. Escolha o foguete e o planeta desejado.

5. Visualize os resultados da simulação.

6. De preferencia use a versão 21 do java.

---

# 👥 Integrantes

* Vitor Pallis — RM 561962
* Miguel Manfré — RM 564233
* João Victor Toledo — RM 563433
* Gabriel Speck — RM 562513
* Brenda Santos — RM 561258

---

# 📄 Licença

Projeto desenvolvido para fins acadêmicos.
