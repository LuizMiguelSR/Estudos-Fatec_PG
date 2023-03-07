// define as variáveis do jogo
let board = ["", "", "", "", "", "", "", "", ""];
let currentPlayer = "X";
let isPlaying = true;

// obtém os elementos da tela
const squares = document.querySelectorAll(".square");

// define a função de clique dos quadrados
function handleClick(squareIndex) {
  // verifica se o quadrado já foi preenchido ou se o jogo acabou
  if (board[squareIndex] !== "" || !isPlaying) {
    return;
  }

  // preenche o quadrado com a marca do jogador atual
  board[squareIndex] = currentPlayer;

  // atualiza a tela
  render();

  // verifica se houve um vencedor
  if (checkWin()) {
    // adiciona a última jogada
    const lastMove = document.querySelector(`[data-id="${squareIndex}"]`);
    lastMove.innerHTML += ` (${currentPlayer})`;

    // exibe o alerta do vencedor
    alert(`Jogador ${currentPlayer} venceu!`);
    isPlaying = false;
    return;
  }

  // verifica se houve empate
  if (board.every(square => square !== "")) {
    // exibe o alerta de empate
    alert("Empate!");
    isPlaying = false;
    return;
  }

  // passa a vez para o próximo jogador
  currentPlayer = currentPlayer === "X" ? "O" : "X";
}

// define a função para verificar o vencedor
function checkWin() {
  // verifica as linhas
  for (let i = 0; i < 9; i += 3) {
    if (board[i] !== "" && board[i] === board[i + 1] && board[i] === board[i + 2]) {
      return true;
    }
  }

  // verifica as colunas
  for (let i = 0; i < 3; i++) {
    if (board[i] !== "" && board[i] === board[i + 3] && board[i] === board[i + 6]) {
      return true;
    }
  }

  // verifica as diagonais
  if (board[0] !== "" && board[0] === board[4] && board[0] === board[8]) {
    return true;
  }

  if (board[2] !== "" && board[2] === board[4] && board[2] === board[6]) {
    return true;
  }

  // não há vencedor
  return false;
}

// define a função para atualizar a tela
function render() {
  for (let i = 0; i < squares.length; i++) {
    squares[i].innerHTML = board[i];

    // adiciona o atributo data-id para identificar o quadrado
    squares[i].setAttribute("data-id", i);
  }
}

// adiciona o evento de clique aos quadrados
for (let i = 0; i < squares.length; i++) {
  squares[i].addEventListener("click", function() {
    handleClick(i);
  });
}
