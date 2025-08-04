programa {
  funcao inicio() {
    // Declaração de Variáveis 
    cadeia nome
    real nota

    // Entrada de Dados
    escreva("Informe seu nome: ")
    leia(nome)

    escreva("Informe sua nota: ")
    leia(nota)

    // Verifica se a nota é válida
    se (nota >= 0 e nota <= 10) {
      // TODO 
      se (nota >= 7) escreva(nome, " está aprovado.") 
      senao se (nota >= 5) escreva(nome, " está de recuperação.")
      senao escreva(nome, " está de reprovado.")
    }
    senao {
      escreva("Nota Inválida.")
    }
  }
}
