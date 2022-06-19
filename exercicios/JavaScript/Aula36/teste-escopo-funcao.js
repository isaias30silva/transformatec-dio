//variavel de escopo global
let numero1 = 10

function tabuada(n1) {

    //variavel de escopo de função
    let numero2 = 10;

    //variavel de escopo de bloco
    for(let i = 0; i <= numero2; i++) { 
        console.log(i,"*",numero2,"=",i*numero2)
    }


}

tabuada(numero1)