let alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
let placa = "ABC1234";

let letras = Array.from(alfabeto)

let letrasplaca = Array.from(placa)

for(l of letras.entries()) {
    console.log(l)
}

//for (letra of letrasPlacaAntiga.entries()){
//    console.log(letra)
//}

letrasplaca[4] = letras[letrasplaca[4]]

console.log(letrasplaca)