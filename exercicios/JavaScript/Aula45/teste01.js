const promessa = new Promise(
    (resolve, rejeita) => {
        let a = 2
        let b = 3

        resolve(a * b)
    }
)

promessa.then(
    resultado => {
        console.log("Resultado da promessa: " + resultado)
        return resultado
    }
).then(
    resultado => {
        console.log("Resultado da promessa * 2: ", (resultado*2))
        return resultado * 2
    }
).then(
    resultado => {
        console.log("Resultado da promessa * 3: ", (resultado*3))
        return resultado * 3
    }
). catch(
    erro => {
        console.log("Erro ao executar a promessa. Descrição do erro: \n" + erro)
    }
)