programa {
  funcao inicio() {
    // Declaração de Vetor
    cadeia nomes[10]
    inteiro idades[10]

    // Entrada de Dados
    para (inteiro i = 0; i < 10; i++) {
      escreva("Informe o ", i + 1, "° nome do usuário: ")
      leia(nomes[i])
      escreva("Informe a idade do ", i + 1, "° nome do usuário: ")
      leia(idades[i])
    }

    // Saída de Dados
    para (inteiro i = 0; i < 10; i++) {
      escreva("Nome do ", i + 1, "° usuário: ", nomes[i], ".\n")
      escreva("Idade: ", idades[i], "\n\n")
    }
  }
}
