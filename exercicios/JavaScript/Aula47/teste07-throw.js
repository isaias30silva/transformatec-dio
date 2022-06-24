//throw permite lançar um erro personalizado

let idade = 11

try {

    if(idade < 18) {

        throw{
            "name": "Idade Inválida",
            "message": "Para entrar na balada tem que ter mais de 18 anos"
        }

    }else{
        console.log("Entrada liberada na balada")
    }

} catch (erro) {

    console.log(erro.name)
    console.log(erro.message)

}
