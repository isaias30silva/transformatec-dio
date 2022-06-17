/* var pessoa = function() {
    return {
        nome:"Cassiano",
        sobreNome:"Peres",
        idade:32
    };
}

var p = pessoa();
console.log(p) */

var pessoa2 = () => (
    {
    nome:"Cassiano",
    sobreNome:"Peres",
    idade:32,
    dataNasc: "31/08/1989"
    }
)

var p2 = pessoa2();
console.log(p2)