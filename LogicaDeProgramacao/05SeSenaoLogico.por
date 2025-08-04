programa {
  funcao inicio() {
    // Declaração de Variáveis
    cadeia nome 
    inteiro idade
    real altura

    // Entrada de Dados
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe sua idade: ")
    leia(idade)
    escreva("Informe sua altura em metros: ")
    leia(altura)

    // Verificar a idade e altura
    se (idade >= 12 e altura >= 1.15) {
      escreva(nome, " está autorizado a entrar no trem fantasma.")
    }
    senao {
      escreva(nome, " não está autorizado a entrar no trem fantasma.")
    }
  }
}
