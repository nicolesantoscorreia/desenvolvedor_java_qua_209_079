programa {
  funcao inicio() {
    cadeia nome 
    inteiro idade
    cadeia genero

    escreva("Informe seu nome: ")
    leia(nome)

    escreva("Informe sua idade: ")
    leia(idade)

    escreva("Informe seu gênero: ")
    leia(genero)

    se (idade == 62 e genero == "feminino") {
      escreva(nome, " pode aposentar.")
    }
    senao se (idade == 65 e genero == "masculino") {
      escreva(nome, " pode aposentar.")
    }
    senao {
      escreva(nome, " não pode aposentar.")
    }
  }
}
