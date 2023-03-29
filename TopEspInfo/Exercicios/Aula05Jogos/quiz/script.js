let perguntas = [
    {
        pergunta: "Qual é o planeta mais próximo do Sol?",
        opcoes: ["Marte", "Vênus", "Mercúrio"],
        resposta: 2
    },
    {
        pergunta: "Qual é a capital da Alemanha?",
        opcoes: ["Frankfurt", "Munique", "Berlim"],
        resposta: 2
    },
    {
        pergunta: "Quantos estados tem o Brasil?",
        opcoes: ["27", "26", "25", "24"],
        resposta: 0
    }
];

let quizContainer = document.getElementById('quiz');
let submitButton = document.getElementById('submit');
let score = 0;

function gerarQuiz() {
    let output = [];

    perguntas.forEach((pergunta, indice) => {
        let opcoes = [];

        for (let i = 0; i < pergunta.opcoes.length; i++) {
            opcoes.push(
                '<label>' +
                '<input type="radio" name="pergunta' + indice + '" value="' + i + '">' +
                pergunta.opcoes[i] +
                '</label>'
            );
        }

        output.push(
            '<div class="pergunta">' + pergunta.pergunta + '</div>' +
            '<div class="opcoes">' + opcoes.join('') + '</div>'
        );
    });

    quizContainer.innerHTML = output.join('');
}

gerarQuiz();

function obterRespostas() {
    let respostas = [];

    perguntas.forEach((pergunta, indice) => {
        let resposta = document.querySelector('input[name="pergunta' + indice + '"]:checked');
        if (resposta == null) { 
            alert("Por favor, selecione uma resposta para a pergunta " + (indice + 1) + ".");
            return;
        }

        respostas.push(parseInt(resposta.value));
    });

    return respostas;
}

submitButton.addEventListener('click', () => {
    let respostas = obterRespostas();

    if (respostas.length !== perguntas.length) {
        return;
    }

    for (let i = 0; i < perguntas.length; i++) {
        if (respostas[i] === perguntas[i].resposta) {
            score++;
        }
    }

    alert("Você acertou " + score + " de " + perguntas.length + " perguntas!");
});
