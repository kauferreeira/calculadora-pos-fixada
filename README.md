# Calculadora Pós-Fixada

## Descrição
Esse projeto é uma calculadora que faz contas usando a notação pós-fixada (também chamada de notação pós-ordem). Ele foi feito em Java, utilizando uma fila dinâmica e uma pilha para processar os cálculos.  

O programa lê uma expressão matemática, coloca ela na fila e depois processa usando a pilha, seguindo as regras da notação pós-fixada.

## Tecnologias usadas
- Java
- Eclipse
- Git e GitHub

## Estrutura do projeto
O projeto está organizado assim:

src/
└── calculadora
├── fila
│ └── Fila.java
├── pilha
│ └── Pilha.java
├── service
│ └── CalculadoraPosFixa.java
└── main
└── Main.java

markdown
Copiar
Editar

## Funcionamento
O usuário insere a expressão na notação pós-fixada (separada por espaço), e o programa realiza o cálculo.  

Funciona assim:
- A expressão entra primeiro na fila.
- Depois os elementos da fila vão sendo processados pela pilha.
- No final, o resultado fica na pilha e as estruturas ficam vazias.

## Operadores que podem ser usados:
- `+` ➝ soma
- `-` ➝ subtração
- `*` ➝ multiplicação
- `/` ➝ divisão
- `%` ➝ módulo (resto da divisão inteira)

## Validações
O programa também verifica alguns erros, como:
- Divisão por zero
- Operador inválido
- Quando falta número ou sobra número (expressão mal feita)
- Erros de sintaxe na expressão

## Exemplos de funcionamento:

| Entrada                 | Resultado |
|-------------------------|-----------|
| `3 4 +`                 | `7.0`     |
| `5 1 2 + 4 * + 3 -`     | `14.0`    |
| `2 3 1 * + 9 -`         | `-4.0`    |
| `10 3 % 4 +`            | `5.0`     |

## Exemplos de erro:
- `10 0 /` ➝ Erro: Divisão por zero
- `3 4 &` ➝ Erro: Operador inválido
- `3 +` ➝ Erro: Faltou número na expressão
- `3 4 5 +` ➝ Erro: Sobrou número na expressão

## Como executar
1. Clone o repositório:
```bash
git clone https://github.com/kauferreeira/calculadora-pos-fixada.git
Abre no Eclipse ou qualquer outra IDE que rode Java.

Executa a classe Main.java que está dentro da pasta calculadora.main.

Insere a expressão usando números e operadores separados por espaço e o programa faz o cálculo.
