let a = 10
let b = 30

try {

    let c = a * b

    console.log(c)

} catch (error) {

    console.log(error) //Error objeto da classe ERRO

} finally {

    console.log("Fim da execução")
}



