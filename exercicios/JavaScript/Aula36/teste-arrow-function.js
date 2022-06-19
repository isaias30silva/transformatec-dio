//Declaração de função convencional

function multiplicar2(x,y) {

    console.log("Valor de x: ",x," - Valor de y:", y)
    console.log(x*y)
}

multiplicar2(4,5)


//Declaração de arrow function
const multiplicar = (x, y = 1) => {
    console.log("Valor de x: ",x,"- Valor de y:", y)
    console.log(x*y)
}

multiplicar(3,2) //6
multiplicar(3) //3