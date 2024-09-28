# Power-Triangle
Electrical power calculator (active, reactive, apparent) and power factor for AC circuits.

---

## O que é o Triângulo das Potências (Power Triangle) ⚡

O **triângulo das potências** é uma ferramenta gráfica usada em eletricidade, especialmente em sistemas de corrente alternada (CA), para ilustrar a relação entre três tipos de potências: **potência ativa (P)**, **potência reativa (Q)** e **potência aparente (S)**. Cada uma dessas potências está relacionada de maneira vetorial, e o triângulo facilita a compreensão de como elas interagem.

## Tipos de Potências:

### 1. **Potência Ativa (P)**:
- Medida em **watts (W)**.
- Representa a potência real consumida pelos equipamentos e transformada em trabalho útil, como o movimento de motores ou a geração de calor.
- É a potência que efetivamente realiza trabalho no sistema.
- Fica no eixo horizontal do triângulo.

### 2. **Potência Reativa (Q)**:
- Medida em **volt-ampères reativos (VAR)**.
- Está associada à energia armazenada e devolvida por elementos reativos, como indutores e capacitores, sem realizar trabalho útil. 
- É essencial para o funcionamento de equipamentos que dependem de campos eletromagnéticos, como transformadores e motores.
- Fica no eixo vertical do triângulo.
- Pode ser positiva (indutiva) ou negativa (capacitiva), dependendo do tipo de reatância presente no circuito.

### 3. **Potência Aparente (S)**:
- Medida em **volt-ampères (VA)**.
- É a combinação vetorial das potências ativa e reativa. Representa a potência total fornecida ao sistema, mas nem toda essa potência é convertida em trabalho útil.
- Fica na hipotenusa do triângulo.

## Relação Matemática:
A relação entre essas potências segue a fórmula baseada no teorema de Pitágoras:

**S² = P² + Q²**

Onde:
- **S** é a potência aparente,
- **P** é a potência ativa,
- **Q** é a potência reativa.

## Fator de Potência (FP):
O **fator de potência** é a relação entre a potência ativa e a potência aparente:

**FP = P / S**

O fator de potência indica a eficiência do sistema, onde um valor de 1 (ou 100%) significa que toda a potência fornecida é convertida em potência útil (potência ativa). Valores menores indicam a presença de potência reativa no sistema, o que reduz a eficiência.

## Triângulo das Potências:
Graficamente, o triângulo das potências pode ser representado da seguinte forma:

<div style="display: flex; justify-content: center;">
    <img src="https://github.com/user-attachments/assets/8d7a7969-5c1d-46ed-9f53-8d45b49022ea" width="600"/>
</div>

- O cateto horizontal representa a **potência ativa (P)**.
- O cateto vertical representa a **potência reativa (Q)**.
- A hipotenusa representa a **potência aparente (S)**.

A tangente do ângulo \( \theta \), entre a potência ativa e a aparente, indica a razão entre a potência reativa e a ativa:

**tan(θ) = Q / P**

E o cosseno de \( \theta \) corresponde ao fator de potência:

**cos(θ) = FP**

## Exemplo de Aplicação:
Se um sistema elétrico tem uma potência ativa de 300 W e uma potência reativa de 400 VAR, a potência aparente pode ser calculada assim:

**S = √(300² + 400²) = 500 VA**

O fator de potência seria:

**FP = 300 / 500 = 0,6**

Isso indica que 60% da potência fornecida está sendo utilizada para trabalho útil, enquanto o restante está associado a reatâncias no circuito.

Essa representação é útil para o projeto e a análise de sistemas elétricos, especialmente em indústrias que consomem grandes quantidades de energia reativa devido a motores e transformadores.

---

# O Aplicativo

**Power- Triangle** é um aplicativo Android desenvolvido para calcular as três potências fundamentais em circuitos de corrente alternada (CA): **potência ativa (P)**, **potência reativa (Q)** e **potência aparente (S)**, baseando-se no triângulo das potências elétricas.

<div style="display: flex; justify-content: center;">
    <img src="https://github.com/user-attachments/assets/37b3a1c6-7865-4a14-8506-c4520c986080" alt="PowerTriangle1" width="300"/>
    <img src="https://github.com/user-attachments/assets/d88ff380-fb50-41c8-b810-bb068c7fcf72" alt="PowerTriangle2" width="300"/>
</div>

## Funcionalidades:

- **Cálculo da Potência Ativa (P)**: Com base na potência reativa (Q) e na potência aparente (S), o aplicativo calcula a potência ativa, que é a potência útil consumida pelo circuito.
- **Cálculo da Potência Reativa (Q)**: Usando a potência ativa (P) e a potência aparente (S), o aplicativo calcula a potência reativa, responsável pela energia armazenada no circuito.
- **Cálculo da Potência Aparente (S)**: A partir dos valores de potência ativa (P) e reativa (Q), o aplicativo determina a potência aparente, que representa a potência total fornecida ao circuito.
- **Cálculo do Fator de Potência (FP)**: O fator de potência é automaticamente calculado para cada um dos cenários, ajudando a identificar a eficiência do circuito.

## Interface do Usuário:

- **Spinner para Seleção de Cálculo**: O usuário pode escolher qual tipo de potência deseja calcular (ativa, reativa ou aparente).
- **Campos de Entrada Dinâmicos**: Os campos de entrada se adaptam conforme a seleção do cálculo, solicitando os valores necessários para realizar a operação.
- **Botões de Ação**: Dois botões, "Calcular" e "Limpar", facilitam a execução dos cálculos e a reinicialização dos campos.
- **Gradiente de Cores Personalizado**: A interface apresenta botões e cards estilizados com um gradiente em tons de verde, proporcionando uma experiência visual agradável.

## Como Funciona:

1. Selecione o tipo de cálculo que deseja realizar (potência ativa, reativa ou aparente).
2. Insira os valores solicitados nos campos de entrada.
3. Pressione o botão **"Calcular"** para visualizar o resultado e o fator de potência correspondente.
4. Para realizar novos cálculos, pressione o botão **"Limpar"** e insira novos valores.
