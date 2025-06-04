# Calculadora Pós-Ordem (Notação Pós-Fixada)

## Objetivo
Desenvolver uma calculadora que lê expressões na notação pós-fixada (pós-ordem) utilizando estruturas de dados, especificamente **fila dinâmica** e **pilha**.

---

## Como executar

### Como executar no Eclipse:
1. Abra o Eclipse.
2. Clique em **File → Open Projects from File System...**.
3. Selecione a pasta do projeto (onde está o código clonado).
4. Vá até a classe `Main.java` no pacote `calculadora.main`.
5. Clique com o botão direito e selecione **Run As → Java Application**.

---

## Como utilizar

1. Ao executar, será solicitado que você digite a expressão em notação pós-fixada (ex.: `5 1 2 + 4 * + 3 -`).
2. Pressione **Enter**.
3. O programa exibirá o resultado calculado.

---

## Exemplos de Entrada e Saída

| Entrada              | Saída  |
|----------------------|--------|
| 3 4 +                | 7.0    |
| 5 1 2 + 4 * + 3 -    | 14.0   |
| 2 3 1 * + 9 -        | -4.0   |
| 10 3 % 4 +           | 5.0    |
| 4 0 /                | Erro: Divisão por zero |

---

## Validações Implementadas
-  Divisão por zero.
-  Operadores inválidos.
-  Falta de operandos ou operadores.
-  Expressão malformada.
-  No final da execução, tanto a **fila quanto a pilha ficam vazias**, mantendo apenas o resultado final.

---

## Organização dos Pacotes
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

---

##  Desenvolvido por
- Kauã Ferreira
- Kayky Uzeda  

---

## Link do repositório:
[https://github.com/kauferreeira/calculadora-pos-fixada](https://github.com/kauferreeira/calculadora-pos-fixada)
