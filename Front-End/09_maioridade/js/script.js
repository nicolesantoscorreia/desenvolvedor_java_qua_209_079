// Variável do formulário
const form = document.querySelector('form');

// Arrow Function
const msg = () => {
    // Variáveis locais
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;
    const result = (idade >= 18) ? 'é maior de idade.' : 'é menor de idade.';

    // Saída de dados
    document.querySelector('#result').innerHTML = `${nome} ${result}`;
}

// Evento
form.addEventListener('submit', function(event) {
    // Desativa o submit
    event.defaultPrevented();

    // Executa a função
    msg();
});