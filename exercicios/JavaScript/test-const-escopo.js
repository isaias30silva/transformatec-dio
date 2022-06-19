let numero1 = 10;
let numero2 = 20;

//variavel const de escopo global
const resultado = 0;

function soma(n1, n2) {

    //varial const de escopo de função
    const resultado = n1 + n2;

    console.log("Resultado dentro da função: ",resultado)
}

soma(numero1, numero2)

console.log("Resultado fora da função: ",resultado)