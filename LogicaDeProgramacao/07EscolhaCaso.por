programa {
  funcao inicio() {
    // Declaração de Variáveis
    inteiro opcao
    real x, y, result

    // Entrada de Dados
    escreva("Informe o valor de x: ")
    leia(x)
    escreva("Informe o valor de y: ")
    leia(y)
    escreva("1 - Soma.\n")
    escreva("2 - Subtração.\n")
    escreva("3 - Multiplicação\n")
    escreva("4 - Divisão.\n")
    escreva("Informe a opção desejada: ")
    leia(opcao)

    // Escolha caso
    escolha (opcao) {
      caso 1: 
        result = x + y
        escreva("O resultado é ", result)
        pare
      caso 2: 
        result = x - y
        escreva("O resultado é ", result)
        pare
      caso 3:
        result = x * y
        escreva("O resultado é ", result)
        pare
      caso 4: 
        result = x / y
        escreva("O resultado é ", result)
        pare
      caso contrario:
        escreva("Opção inválida")
    }
  }
}
