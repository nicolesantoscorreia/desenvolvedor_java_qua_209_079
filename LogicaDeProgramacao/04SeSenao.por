programa {
  funcao inicio() {
    // Declaração de Variáveis
    cadeia nome
    inteiro idade

    // Entrada de Dados
    escreva("Informe seu nome: ")
    leia(nome)

    escreva("Informe sua idade: ")
    leia(idade)

    //Estrutura de Decisão 
    se (idade >= 18) {
      escreva(nome, " é maior de idade.")
    }
    senao {
      escreva(nome, " é menor de idade.")
    }
  }
}
