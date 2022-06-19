//variável de escopo let
let nome = "Cassiano";

console.log(nome)

//não pode ser redeclarada
//let nome = "Peres"

const nomeLocal = function() {

    //variável de escopo de função
    let nome = "Ricardo";

    console.log(nome);

    return nome;
}

//valor (nome) da variável atualizado
nome = nome + nomeLocal()

console.log(nome)

