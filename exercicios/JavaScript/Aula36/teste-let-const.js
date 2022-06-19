//variavel de escopo global
let nome = "Cassiano";
let idade = 32

console.log(nome);
console.log(idade);

function escreveNome() {

    //variavel de escopo de função
    let nome = "Peres";
    let idade = 33
    console.log(nome + idade)

    //variavel de escopo de bloco
    for (let idade = 0; idade < 10; idade ++) {
        console.log("Idade de: " , idade)
    }
}
escreveNome();