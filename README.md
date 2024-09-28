# Power-Triangle
Electrical power calculator (active, reactive, apparent) and power factor for AC circuits.

<p align="center">
  <video src="https://github.com/user-attachments/assets/182bd043-3c9e-4f1a-b8f9-4c180f197a7b">
</p>

---

## What is the Power Triangle ⚡

The **power triangle** is a graphical tool used in electricity, especially in alternating current (AC) systems, to illustrate the relationship between three types of power: **active power (P)**, **reactive power (Q)**, and **apparent power (S)**. Each of these powers is related in a vectorial manner, and the triangle helps to understand how they interact.

## Types of Power:

### 1. **Active Power (P)**:
- Measured in **watts (W)**.
- Represents the real power consumed by equipment and converted into useful work, such as motor movement or heat generation.
- It is the power that effectively performs work in the system.
- It lies on the horizontal axis of the triangle.

### 2. **Reactive Power (Q)**:
- Measured in **volt-amperes reactive (VAR)**.
- It is associated with energy stored and returned by reactive elements such as inductors and capacitors, without performing useful work.
- It is essential for the operation of equipment that depends on electromagnetic fields, such as transformers and motors.
- It lies on the vertical axis of the triangle.
- It can be positive (inductive) or negative (capacitive), depending on the type of reactance present in the circuit.

### 3. **Apparent Power (S)**:
- Measured in **volt-amperes (VA)**.
- It is the vectorial combination of active and reactive power. It represents the total power supplied to the system, but not all of this power is converted into useful work.
- It lies on the hypotenuse of the triangle.

## Mathematical Relationship:
The relationship between these powers follows the formula based on the Pythagorean theorem:

**S² = P² + Q²**

Where:
- **S** is the apparent power,
- **P** is the active power,
- **Q** is the reactive power.

## Power Factor (PF):
The **power factor** is the ratio between active power and apparent power:

**PF = P / S**

The power factor indicates the system's efficiency, where a value of 1 (or 100%) means that all the supplied power is converted into useful power (active power). Lower values indicate the presence of reactive power in the system, which reduces efficiency.

## Power Triangle:
Graphically, the power triangle can be represented as follows:

<p align="center">
    <img src="https://github.com/user-attachments/assets/8d7a7969-5c1d-46ed-9f53-8d45b49022ea" alt="powerTriangleDiagram" width="600">
</p>

- The horizontal leg represents **active power (P)**.
- The vertical leg represents **reactive power (Q)**.
- The hypotenuse represents **apparent power (S)**.

The tangent of the angle \( \theta \), between the active and apparent power, indicates the ratio between reactive and active power:

**tan(θ) = Q / P**

And the cosine of \( \theta \) corresponds to the power factor:

**cos(θ) = PF**

## Application Example:
If an electrical system has an active power of 300 W and a reactive power of 400 VAR, the apparent power can be calculated as follows:

**S = √(300² + 400²) = 500 VA**

The power factor would be:

**PF = 300 / 500 = 0.6**

This indicates that 60% of the supplied power is being used for useful work, while the remainder is associated with reactances in the circuit.

This representation is useful for designing and analyzing electrical systems, especially in industries that consume large amounts of reactive power due to motors and transformers.

---

## The App

**Power-Triangle** is an Android app developed to calculate the three fundamental powers in alternating current (AC) circuits: **active power (P)**, **reactive power (Q)**, and **apparent power (S)**, based on the power triangle.

<p align="center">
    <img src="https://github.com/user-attachments/assets/37b3a1c6-7865-4a14-8506-c4520c986080" alt="PowerTriangle1" width="300"/>
    <img src="https://github.com/user-attachments/assets/d88ff380-fb50-41c8-b810-bb068c7fcf72" alt="PowerTriangle2" width="300"/>
</p>

## Features:

- **Active Power Calculation (P)**: Based on reactive power (Q) and apparent power (S), the app calculates active power, which is the useful power consumed by the circuit.
- **Reactive Power Calculation (Q)**: Using active power (P) and apparent power (S), the app calculates reactive power, responsible for energy stored in the circuit.
- **Apparent Power Calculation (S)**: Based on the values of active power (P) and reactive power (Q), the app determines the apparent power, which represents the total power supplied to the circuit.
- **Power Factor Calculation (PF)**: The power factor is automatically calculated for each scenario, helping to identify the circuit's efficiency.

## User Interface:

- **Spinner for Calculation Selection**: The user can choose which type of power they want to calculate (active, reactive, or apparent).
- **Dynamic Input Fields**: The input fields adapt according to the calculation selection, requesting the necessary values to perform the operation.
- **Action Buttons**: Two buttons, "Calculate" and "Clear", facilitate the execution of calculations and resetting of the fields.
- **Custom Color Gradient**: The interface features buttons and cards styled with a green gradient, providing a visually pleasant experience.

## How It Works:

1. Select the type of calculation you want to perform (active, reactive, or apparent power).
2. Enter the requested values into the input fields.
3. Press the **"Calculate"** button to view the result and the corresponding power factor.
4. To perform new calculations, press the **"Clear"** button and enter new values.

---

## Portuguese version:

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


<p align="center">
    <img src="https://github.com/user-attachments/assets/8d7a7969-5c1d-46ed-9f53-8d45b49022ea" alt="powerTriangleDiagram" width="600">
</p>

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

## O Aplicativo

**Power-Triangle** é um aplicativo Android desenvolvido para calcular as três potências fundamentais em circuitos de corrente alternada (CA): **potência ativa (P)**, **potência reativa (Q)** e **potência aparente (S)**, baseando-se no triângulo das potências elétricas.

<p align="center">
    <img src="https://github.com/user-attachments/assets/37b3a1c6-7865-4a14-8506-c4520c986080" alt="PowerTriangle1" width="300"/>
    <img src="https://github.com/user-attachments/assets/d88ff380-fb50-41c8-b810-bb068c7fcf72" alt="PowerTriangle2" width="300"/>
</p>

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
