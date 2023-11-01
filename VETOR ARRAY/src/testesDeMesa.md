# Exercicio 77
| **Iteração** | **Vetor** | **Valor de aux** |
|:----------:|:----------------------:|:--------------:|
| Inicial | 5, 1, 4, 2, 7, 8, 3, 6 | 0 |
| 1 |  5, 6, 4, 2, 7, 8, 3, 1 | 6 |
| 2 |  5, 3, 4, 2, 7, 8, 6, 1 | 3 |
| Pós-loop | 5, 3, 4, 2, 7, 8, 6, 1 | - |

# Exercicio 78
| **Passo** | **Entrada (Nome)** | **Estado de `nomes`** | **`nomeBuscado`** | **Saída Esperada** |
|:-----:|:----------------------:|:----------------------:|:----------------------:|:----------------------:|
| 1     | Alice          | ["Alice"]          | Bob            | NÃO ACHEI      |
| 2     | Bob            | ["Alice", "Bob"]   | Carol          | NÃO ACHEI      |
| 3     | Carol          | ["Alice", "Bob", "Carol"] | David   | NÃO ACHEI      |
| 4     | David          | ["Alice", "Bob", "Carol", "David"] | Alice | ACHEI          |
| 5     | Eve            | ["Alice", "Bob", "Carol", "David", "Eve"] | Frank | NÃO ACHEI  |
| 6     | Frank          | ["Alice", "Bob", "Carol", "David", "Eve", "Frank"] | Grace | NÃO ACHEI  |
| 7     | Grace          | ["Alice", "Bob", "Carol", "David", "Eve", "Frank", "Grace"] | Harry | NÃO ACHEI  |
| 8     | Harry          | ["Alice", "Bob", "Carol", "David", "Eve", "Frank", "Grace", "Harry"] | Irene | NÃO ACHEI  |
| 9     | Irene          | ["Alice", "Bob", "Carol", "David", "Eve", "Frank", "Grace", "Harry", "Irene"] | John | NÃO ACHEI  |
| 10    | John           | ["Alice", "Bob", "Carol", "David", "Eve", "Frank", "Grace", "Harry", "Irene", "John"] | David | ACHEI    |
| 11    | Kevin          | ["Alice", "Bob", "Carol", "David", "Eve", "Frank", "Grace", "Harry", "Irene", "John", "Kevin"] | Laura | NÃO ACHEI |

# Exercicio 79
| **Passo** | **Entrada (Nota do Aluno)** | **`notas` (Estado atual)** | **`mediaTurma` (Média calculada)** | **`acimaMedia` (Quantidade de alunos acima da média)** |
|-------|-------------------------|-------------------------|--------------------------------|----------------------------------------------------|
| 1     | 7.5                     | [7.5]                   | 7.5                            | 0                                                  |
| 2     | 6.8                     | [7.5, 6.8]              | 7.15                           | 0                                                  |
| 3     | 8.2                     | [7.5, 6.8, 8.2]         | 7.5                            | 1                                                  |
| 4     | 5.5                     | [7.5, 6.8, 8.2, 5.5]    | 6.75                           | 1                                                  |
| 5     | 7.0                     | [7.5, 6.8, 8.2, 5.5, 7.0] | 6.8                         | 2                                                  |
| 6     | 9.0                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0] | 7.5                     | 3                                                  |
| 7     | 6.2                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2] | 7.14               | 3                                                  |
| 8     | 8.5                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5] | 7.53          | 4                                                  |
| 9     | 5.0                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0] | 7.17     | 4                                                  |
| 10    | 7.8                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8] | 7.29    | 5                                                  |
| 11    | 6.5                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5] | 7.22 | 6                                                  |
| 12    | 8.0                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5, 8.0] | 7.42 | 7                                                  |
| 13    | 6.0                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5, 8.0, 6.0] | 7.32 | 8                                                  |
| 14    | 7.7                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5, 8.0, 6.0, 7.7] | 7.39 | 9                                                  |
| 15    | 5.7                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5, 8.0, 6.0, 7.7, 5.7] | 7.33 | 9                                                  |
| 16    | 8.9                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5, 8.0, 6.0, 7.7, 5.7, 8.9] | 7.47 | 10                                              |
| 17    | 6.4                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5, 8.0, 6.0, 7.7, 5.7, 8.9, 6.4] | 7.42 | 10                                       |
| 18    | 7.3                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5, 8.0, 6.0, 7.7, 5.7, 8.9, 6.4, 7.3] | 7.48 | 11                               |
| 19    | 8.7                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5, 8.0, 6.0, 7.7, 5.7, 8.9, 6.4, 7.3, 8.7] | 7.55 | 12                        |
| 20    | 6.9                     | [7.5, 6.8, 8.2, 5.5, 7.0, 9.0, 6.2, 8.5, 5.0, 7.8, 6.5, 8.0, 6.0, 7.7, 5.7, 8.9, 6.4, 7.3, 8.7, 6.9] | 7.54 | 12                 |

# Exercicio 80
| **Passo** | **Entrada (Vetor Q)** | **Maior Elemento** | **Posição do Maior Elemento** |
|-------|-------------------------------------------------------------------------- |-----|-----|
| 1     | [5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 2     | [5, 8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 8 | 1 |
| 3     | [5, 8, 12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 12 | 2 |
| 4     | [5, 8, 12, 15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 15 | 3 |
| 5     | [5, 8, 12, 15, 20, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 20 | 4 |
| 6     | [5, 8, 12, 15, 20, 25, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 25 | 5 |
| 7     | [5, 8, 12, 15, 20, 25, 18, null, null, null, null, null, null, null, null, null, null, null, null, null] | 25 | 5 |
| 8     | [5, 8, 12, 15, 20, 25, 18, 16, null, null, null, null, null, null, null, null, null, null, null, null] | 25 | 5 |
| 9     | [5, 8, 12, 15, 20, 25, 18, 16, 10, null, null, null, null, null, null, null, null, null, null, null] | 25 | 5 |
| 10    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, null, null, null, null, null, null, null, null, null, null] | 25 | 5 |
| 11    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, null, null, null, null, null, null, null, null, null] | 25 | 5 |
| 12    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, null, null, null, null, null, null, null, null] | 30 | 11 |
| 13    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, null, null, null, null, null, null, null] | 30 | 11 |
| 14    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, null, null, null, null, null, null] | 30 | 11 |
| 15    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, null, null, null, null, null] | 30 | 11 |
| 16    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, null, null, null, null] | 30 | 11 |
| 17    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, null, null, null] | 30 | 11 |
| 18    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, null, null] | 30 | 11 |
| 19    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, 21, null] | 30 | 11 |
| 20    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, 21, 23] | 30 | 11 |

# Exercicio 81
| **Passo** | **Entrada (Vetor Q)** | **Menor Elemento** | **Posição do Menor Elemento** |
|-------|--------------------|----------------|---------------------------|
| 1     | [5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 2     | [5, 8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 3     | [5, 8, 12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 4     | [5, 8, 12, 15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 5     | [5, 8, 12, 15, 20, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 6     | [5, 8, 12, 15, 20, 25, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 7     | [5, 8, 12, 15, 20, 25, 18, null, null, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 8     | [5, 8, 12, 15, 20, 25, 18, 16, null, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 9     | [5, 8, 12, 15, 20, 25, 18, 16, 10, null, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 10    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, null, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 11    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, null, null, null, null, null, null, null, null, null] | 5 | 0 |
| 12    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, null, null, null, null, null, null, null, null] | 5 | 0 |
| 13    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, null, null, null, null, null, null, null] | 5 | 0 |
| 14    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, null, null, null, null, null, null] | 5 | 0 |
| 15    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, null, null, null, null, null] | 5 | 0 |
| 16    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, null, null, null, null] | 5 | 0 |
| 17    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, null, null, null] | 5 | 0 |
| 18    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, null, null] | 5 | 0 |
| 19    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, 21, null] | 5 | 0 |
| 20    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, 21, 23] | 5 | 0 |
| 20    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, 21, 23] | 5 | 1 |

# Exercicio 82

| **Passo** | **Entrada (Vetor A)** | **Valor X** | **Vetor M Resultante** |
|-------|--------------------|---------|--------------------|
| 1     | [null, null, null, null, null, null, null, null, null, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 2     | [5, null, null, null, null, null, null, null, null, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 3     | [5, 8, null, null, null, null, null, null, null, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 4     | [5, 8, 12, null, null, null, null, null, null, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 5     | [5, 8, 12, 15, null, null, null, null, null, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 6     | [5, 8, 12, 15, 20, null, null, null, null, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 7     | [5, 8, 12, 15, 20, 25, null, null, null, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 8     | [5, 8, 12, 15, 20, 25, 18, null, null, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 9     | [5, 8, 12, 15, 20, 25, 18, 16, null, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 10    | [5, 8, 12, 15, 20, 25, 18, 16, 10, null] | - | [null, null, null, null, null, null, null, null, null, null] |
| 11    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22] | - | [null, null, null, null, null, null, null, null, null, null] |
| 12    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22] | 3 | [15, 24, 36, 45, 60, 75, 54, 48, 30, 66] |

# Exercicio 83

| **Passo** | **Entrada (Vetor de Números)** | **Saída (Ordem Inversa)** |
|-------|----------------------------|------------------------|
| 1     | [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | - |
| 2     | [5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | - |
| 3     | [5, 8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | - |
| 4     | [5, 8, 12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | - |
| 5     | [5, 8, 12, 15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | - |
| 6     | [5, 8, 12, 15, 20, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | - |
| 7     | [5, 8, 12, 15, 20, 25, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | - |
| 8     | [5, 8, 12, 15, 20, 25, 18, null, null, null, null, null, null, null, null, null, null, null, null, null] | - |
| 9     | [5, 8, 12, 15, 20, 25, 18, 16, null, null, null, null, null, null, null, null, null, null, null, null] | - |
| 10    | [5, 8, 12, 15, 20, 25, 18, 16, 10, null, null, null, null, null, null, null, null, null, null, null] | - |
| 11    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, null, null, null, null, null, null, null, null, null, null] | - |
| 12    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, null, null, null, null, null, null, null, null, null] | - |
| 13    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, null, null, null, null, null, null, null, null] | - |
| 14    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, null, null, null, null, null, null, null] | - |
| 15    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, null, null, null, null, null, null] | - |
| 16    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, null, null, null, null, null] | - |
| 17    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, null, null, null, null] | - |
| 18    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, null, null, null] | - |
| 19    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, null, null] | - |
| 20    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, 21, null] | - |
| 21    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, 21, 23] | - |
| 22    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, 21, 23] | - |
| 23    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22, 14, 30, 7, 9, 11, 13, 17, 19, 21, 23] | [23, 21, 19, 17, 13, 11, 9, 7, 30, 14, 22, 10, 16, 18, 25, 20, 15, 12, 8, 5] |

# exercicio 84

| **Passo** | **N** | **Vetor A** | **Vetor B** | **Vetor Soma** |
|-------|---|---------|---------|------------|
| 1     | - | -       | -       | -          |
| 2     | 4 | [null, null, null, null] | [null, null, null, null] | [null, null, null, null] |
| 3     | 4 | [5, null, null, null] | [7, null, null, null] | [null, null, null, null] |
| 4     | 4 | [5, 8, null, null] | [7, 9, null, null] | [null, null, null, null] |
| 5     | 4 | [5, 8, 12, null] | [7, 9, 14, null] | [null, null, null, null] |
| 6     | 4 | [5, 8, 12, 15] | [7, 9, 14, 16] | [null, null, null, null] |
| 7     | 4 | [5, 8, 12, 15] | [7, 9, 14, 16] | [12, 17, 26, 31] |

# Exercicio 85

| **Passo** | **Dia** | **Temperaturas** | **Soma das Temperaturas** | **Menor Temperatura** | **Maior Temperatura** | **Média Anual** | **Dias Inferiores à Média** |
|-------|-----|--------------|-----------------------|-------------------|-------------------|-------------|--------------------------|
| 1     | -   | -            | 0.0                   | -                 | -                 | -           | 0                        |
| 2     | 1   | [20.0, ...]  | 20.0                  | 20.0              | 20.0              | -           | 0                        |
| 3     | 2   | [20.0, 25.0, ...] | 45.0            | 20.0              | 25.0              | -           | 0                        |
| 4     | 3   | [20.0, 25.0, 22.0, ...] | 67.0     | 20.0              | 25.0              | -           | 0                        |
| ...   | ... | ...          | ...                   | ...               | ...               | ...         | ...                      |
| 365   | 365 | [20.0, 25.0, 22.0, ..., 19.0] | 7302.0 | 15.0              | 30.0              | 20.0        | 100                      |

# Exercicio 86

| **Passo** | **Vetor (antes)**                     | **Vetor (depois)**                    |
|-------|-----------------------------------|-----------------------------------|
| 1     | [null, null, null, null, null, null, null, null, null, null] | -   |
| 2     | [5, null, null, null, null, null, null, null, null, null]    | -   |
| 3     | [5, 8, null, null, null, null, null, null, null, null]       | -   |
| 4     | [5, 8, 12, null, null, null, null, null, null, null]         | -   |
| 5     | [5, 8, 12, 15, null, null, null, null, null, null]           | -   |
| 6     | [5, 8, 12, 15, 20, null, null, null, null, null]             | -   |
| 7     | [5, 8, 12, 15, 20, 25, null, null, null, null]               | -   |
| 8     | [5, 8, 12, 15, 20, 25, 18, null, null, null]                 | -   |
| 9     | [5, 8, 12, 15, 20, 25, 18, 16, null, null]                   | -   |
| 10    | [5, 8, 12, 15, 20, 25, 18, 16, 10, null]                     | -   |
| 11    | [5, 8, 12, 15, 20, 25, 18, 16, 10, 22]                       | [5, 8, 10, 12, 15, 16, 18, 20, 22, 25] |

# Exercicio 87

| Passo | Vetor (antes)                             | Vetor (depois)                            | Novo Número | Posição de Inserção |
|-------|-------------------------------------------|-------------------------------------------|-------------|---------------------|
| 1     | [null, null, null, null, null, null, null, null, null, null] | -                                       | -           | -                   |
| 2     | [5, null, null, null, null, null, null, null, null, null]    | [5, null, null, null, null, null, null, null, null, null] | -           | -                   |
| 3     | [5, 8, null, null, null, null, null, null, null, null]       | [5, 8, null, null, null, null, null, null, null, null]    | -           | -                   |
| 4     | [5, 8, 12, null, null, null, null, null, null, null]         | [5, 8, 12, null, null, null, null, null, null, null]      | -           | -                   |
| 5     | [5, 8, 12, 15, null, null, null, null, null, null]           | [5, 8, 12, 15, null, null, null, null, null, null]        | -           | -                   |
| 6     | [5, 8, 12, 15, 20, null, null, null, null, null]             | [5, 8, 12, 15, 20, null, null, null, null, null]          | -           | -                   |
| 7     | [5, 8, 12, 15, 20, 25, null, null, null, null]               | [5, 8, 12, 15, 20, 25, null, null, null, null]            | -           | -                   |
| 8     | [5, 8, 12, 15, 20, 25, 18, null, null, null]                 | [5, 8, 12, 15, 18, 20, 25, null, null, null]              | -           | -                   |
| 9     | [5, 8, 12, 15, 18, 20, 25, 16, null, null]                   | [5, 8, 12, 15, 16, 18, 20, 25, null, null]                | -           | -                   |
| 10    | [5, 8, 10, 12, 15, 16, 18, 20, 25, null]                     | [5, 8, 10, 12, 15, 16, 18, 20, 25, null]                  | 22          | 9                   |
| 11    | [5, 8, 10, 12, 15, 16, 18, 20, 22, 25]                     | [5, 8, 10, 12, 15, 16, 18, 20, 22, 25]                  | -           | -                   |

# Exercicio 88

| **Passo** | **Vetor (antes)**                     | **Número a Verificar** | **Encontrado?** | **Vetor (depois)**          |
|-------|-----------------------------------|---------------------|-------------|-------------------------|
| 1     | [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | - | - | - |
| 2     | [5, null, null, null, null, null, null, null, null, null, null, null, null, null, null] | 8 | Não | [5, null, null, null, null, null, null, null, null, null, null, null, null, null, null] |
| 3     | [5, 8, null, null, null, null, null, null, null, null, null, null, null, null, null] | 12 | Não | [5, 8, null, null, null, null, null, null, null, null, null, null, null, null, null] |
| 4     | [5, 8, 12, null, null, null, null, null, null, null, null, null, null, null, null] | 15 | Não | [5, 8, 12, null, null, null, null, null, null, null, null, null, null, null, null] |
| 5     | [5, 8, 12, 15, null, null, null, null, null, null, null, null, null, null, null] | 20 | Não | [5, 8, 12, 15, null, null, null, null, null, null, null, null, null, null, null] |
| 6     | [5, 8, 12, 15, 20, null, null, null, null, null, null, null, null, null, null] | 25 | Não | [5, 8, 12, 15, 20, null, null, null, null, null, null, null, null, null, null] |
| 7     | [5, 8, 12, 15, 20, 25, null, null, null, null, null, null, null, null, null] | 18 | Sim | [5, 8, 12, 15, 20, 25, null, null, null, null, null, null, null, null, null] |
| 8     | [5, 8, 12, 15, 18, 20, 25, null, null, null, null, null, null, null, null] | 16 | Sim | [5, 8, 12, 15, 16, 18, 20, 25, null, null, null, null, null, null, null] |
| 9     | [5, 8, 12, 15, 16, 18, 20, 25, 10, null, null, null, null, null, null] | 22 | Não | [5, 8, 12, 15, 16, 18, 20, 25, 10, null, null, null, null, null, null] |
| 10    | [5, 8, 10, 12, 15, 16, 18, 20, 25, null, null, null, null, null, null] | - | - | - |

# Exercicio 89

| **Passo** | **Vetor V1 (antes)**                                                  | **Vetor V2 (antes)**                                                  | **Iguais nas Mesmas Posições** |
|-------|--------------------------------------------------------------------|--------------------------------------------------------------------|----------------------------|
| 1     | [null, null, null, null, null, null, null, null, null, null, null] | [null, null, null, null, null, null, null, null, null, null, null] | 0                          |
| 2     | [5, null, null, null, null, null, null, null, null, null, null]    | [5, null, null, null, null, null, null, null, null, null, null]    | 1                          |
| 3     | [5, 8, null, null, null, null, null, null, null, null, null]       | [5, 8, null, null, null, null, null, null, null, null, null]       | 2                          |
| 4     | [5, 8, 12, null, null, null, null, null, null, null, null]          | [5, 8, 12, null, null, null, null, null, null, null, null]          | 3                          |
| 5     | [5, 8, 12, 15, null, null, null, null, null, null, null]             | [5, 8, 12, 15, null, null, null, null, null, null, null]             | 4                          |
| 6     | [5, 8, 12, 15, 20, null, null, null, null, null, null]                 | [5, 8, 12, 15, 20, null, null, null, null, null, null]                 | 5                    |
| 7     | [5, 8, 12, 15, 20, 25, null, null, null, null, null]                   | [5, 8, 12, 15, 20, 25, null, null, null, null, null]                   | 6              |
| 8     | [5, 8, 12, 15, 18, 20, 25, null, null, null, null]                     | [5, 8, 12, 15, 16, 18, 20, 25, null, null, null]                     | 6    |
| 9     | [5, 8, 12, 15, 16, 18, 20, 25, 10, null, null]                         | [5, 8, 12, 15, 16, 18, 20, 25, 22, null, null]                         | 6  |
| 10    | [5, 8, 10, 12, 15, 16, 18, 20, 25, null, null]                         | [5, 8, 12, 15, 16, 18, 20, 25, 22, null, null]                         | 6 |

# Exercicio 90

| **Passo** | **Vetor (antes)**                                                      | **Número para Contar** | **Quantidade** |
|-------|-------------------------------------------------------------------|--------------------|------------|
| 1     | [null, null, null, null, null, null, null, null, null, ..., null] | -1                 | 0          |
| 2     | [null, null, null, null, null, null, null, null, null, ..., null] | null               | 0          |
| 3     | [5, null, null, null, null, null, null, null, null, ..., null]    | 5                  | 1          |
| 4     | [5, 8, null, null, null, null, null, null, null, ..., null]       | 8                  | 1          |
| 5     | [5, 8, 12, null, null, null, null, null, null, ..., null]          | 12                 | 1          |
| 6     | [5, 8, 12, 15, null, null, null, null, null, ..., null]             | 15                 | 1          |
| 7     | [5, 8, 12, 15, 20, null, null, null, null, ..., null]               | 20                 | 1          |
| 8     | [5, 8, 12, 15, 20, 25, null, null, null, ..., null]                 | 25                 | 1          |
| 9     | [5, 8, 12, 15, 18, 20, 25, null, null, ..., null]                   | 18                 | 1          |
| 10    | [5, 8, 12, 15, 16, 18, 20, 25, 10, ..., null]                       | 10                 | 1          |
| 11    | [5, 8, 10, 12, 15, 16, 18, 20, 25, ..., null]                       | 7                  | 0          |
| 12    | [5, 8, 10, 12, 15, 16, 18, 20, 25, ..., null]                       | 5                  | 1          |
| 13    | [5, 8, 10, 12, 15, 16, 18, 20, 25, ..., null]                       | 30                 | 0          |

# Exercicio 91

| **Passo** | **Vetor(antes)**                                                                                                                                                                                                                                                     | **Vetor (depois)**                                                                                                                                                                                                                                                     | **Tem Repetidos** | **Repetidos (Posições)**                                                                                                                                                                    |
|-------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1     | [null, null, ..., null]                                                                                                                                                                                                                                            | [null, null, ..., null]                                                                                                                                                                                                                                            | false         | []                                                                                                                                                                                         |
| 2     | [null, null, ..., null]                                                                                                                                                                                                                                            | [null, null, ..., null]                                                                                                                                                                                                                                            | false         | []                                                                                                                                                                                         |
| 3     | [5, null, ..., null]                                                                                                                                                                                                                                               | [5, null, ..., null]                                                                                                                                                                                                                                               | false         | []                                                                                                                                                                                         |
| 4     | [5, 8, ..., null]                                                                                                                                                                                                                                                  | [5, 8, ..., null]                                                                                                                                                                                                                                                  | false         | []                                                                                                                                                                                         |
| 5     | [5, 8, 12, ..., null]                                                                                                                                                                                                                                             | [5, 8, 12, ..., null]                                                                                                                                                                                                                                             | false         | []                                                                                                                                                                                         |
| 6     | [5, 8, 12, 15, ..., null]                                                                                                                                                                                                                                         | [5, 8, 12, 15, ..., null]                                                                                                                                                                                                                                         | false         | []                                                                                                                                                                                         |
| 7     | [5, 8, 12, 15, 20, ..., null]                                                                                                                                                                                                                                     | [5, 8, 12, 15, 20, ..., null]                                                                                                                                                                                                                                     | false         | []                                                                                                                                                                                         |
| 8     | [5, 8, 12, 15, 20, 25, ..., null]                                                                                                                                                                                                                                 | [5, 8, 12, 15, 20, 25, ..., null]                                                                                                                                                                                                                                 | false         | []                                                                                                                                                                                         |
| 9     | [5, 8, 12, 15, 18, 20, 25, ..., null]                                                                                                                                                                                                                             | [5, 8, 12, 15, 18, 20, 25, ..., null]                                                                                                                                                                                                                             | false         | []                                                                                                                                                                                         |
| 10    | [5, 8, 12, 15, 16, 18, 20, 25, 10, ..., null]                                                                                                                                                                                                                     | [5, 8, 12, 15, 16, 18, 20, 25, 10, ..., null]                                                                                                                                                                                                                     | false         | []                                                                                                                                                                                         |
| 11    | [5, 8, 10, 12, 15, 16, 18, 20, 25, ..., null]                                                                                                                                                                                                                     | [5, 8, 10, 12, 15, 16, 18, 20, 25, ..., null]                                                                                                                                                                                                                     | false         | []                                                                                                                                                                                         |
| 12    | [5, 8, 10, 12, 15, 16, 18, 20, 25, ..., null]                                                                                                                                                                                                                     | [5, 8, 10, 12, 15, 16, 18, 20, 25, ..., null]                                                                                                                                                                                                                     | false         | []                                                                                                                                                                                         |
| 13    | [5, 8, 10, 12, 15, 16, 18, 20, 25, ..., null]                                                                                                                                                                                                                     | [5, 8, 10, 12, 15, 16, 18, 20, 25, ..., null]                                                                                                                                                                                                                     | false         | []                                                                                                                                                                                         |
| ...   | [null, null, ..., null]                                                                                                                                                                                                                                            | [null, null, ..., null]                                                                                                                                                                                                                                            | false         | []                                                                                                                                                                                         |
| 51    | [10, 20, 30, ..., null]                                                                                                                                                                                                                                           | [10, 20, 30, ..., null]                                                                                                                                                                                                                                           | false         | []                                                                                                                                                                                         |
| 52    | [10, 20, 30, ..., null]                                                                                                                                                                                                                                           | [10, 20, 30, ..., null]                                                                                                                                                                                                                                           | false         | []                                                                                                                                                                                         |
| 53    | [10, 20, 30, ..., null]                                                                                                                                                                                                                                           | [10, 20, 30, ..., null]                                                                                                                                                                                                                                           | true          | [5, 8, 12, 15, 20, 25, 18, 16, 10, ..., null]                                                                                                                                                                                                              |