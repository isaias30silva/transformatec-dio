async function criaPromessa() {

    return new Promise(
        (resolve) => {
            let a = 250
            let b = 350

            let c = a + b
            
            resolve(c)
        }
    )
}

async function calculaMedia() {

    const valor = await criaPromessa()

    let media = valor / 2

    console.log("Média calculada retornada da função assíncrona: ", media)
}

calculaMedia()

