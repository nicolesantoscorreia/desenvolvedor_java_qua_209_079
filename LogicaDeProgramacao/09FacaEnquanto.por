programa {
  funcao inicio() {
    // Declaração de Variáveis
    inteiro opcao
    real x, y, result

    faca {
      // Menu
      escreva("1 - Soma\n")
      escreva("2 - Subtração\n")
      escreva("3 - Multiplicação\n")
      escreva("4 - Divisão\n")
      escreva("5 - Sair do programa\n")
      escreva("Informe a opção desejada ")
      leia(opcao)

      // Verifica se o usuário deseja sair ou não
      se (opcao >= 1 e opcao <= 4) {
        escreva("Informe o valor de x: ")
        leia(x)
        escreva("Informe o valor de y: ")
        leia(y)
      }
    
      // 
      escolha (opcao) {
        caso 1:
          result = x + y
          escreva("Resultado: ", result)
          pare
        caso 2:
          result = x - y
          escreva("Resultado: ", result)
          pare
        caso 3:
          result = x * y
          escreva("Resultado: ", result)
          pare
        caso 4:
          result = x / y
          escreva("Resultado: ", result)
          pare
        caso 5:
          escreva("Programa encerrado.")
          pare
        caso contrario:
          escreva("Opção inválida.")
      }
    } enquanto (opcao != 5)
  }
}
