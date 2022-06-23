let x = 100

//try tenta execução uma função
try {

    //se a condição é válida, então executa
    if(x < 30) {
        console.log("O número é válido.")

        //se a condição é inválida, lança um erro com mensagem personalizada
    } else {
    
        //throw personaliza a mensagem de erro exibida no try/catch. Ao invés da mensagem padrão, é definido um alerta ou orientação. 
        throw {

            //erro do tipo objeto com atributos "name" e "message" personalizados
            "name":"ErroNumeroInvalido",
            "message":"O número é inválido"
        }
    }

    //captura o erro e trata
} catch (error) {
    console.log(error.name)
    console.log(error.message)
}