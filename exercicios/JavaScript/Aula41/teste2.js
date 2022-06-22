var frutas = '["uva", "maçã", "pera"]'

//transforma a string em objeto
var frutasObj = JSON.parse(frutas)

console.log(frutasObj)

//array de objetos
var populacao = [
    //populacao[0]
    {"nome": "João", "idade": "25"},

    //população[1]
    {"nome": "José", "idade": 23}
]

console.log("População:",populacao)

//obtendo uma pessoa da população

console.log("Pessoa:",populacao[0])

//obtendo uma propriedade de uma pessoa da população

console.log("Nome da pessoa:", populacao[1].nome)