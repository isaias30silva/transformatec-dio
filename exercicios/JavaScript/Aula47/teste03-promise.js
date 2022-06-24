new Promise(
    (resolve) => {

        let a = 10
        let b = 12

        resolve (a + b)

    }
    //then significa que a promessa foi executada com sucesso. E retorna o resultado armazenado na função res.
).then(
    (res) => {
        console.log("Resultado da promessa: " + res)
        return res
    }

    //após o primeiro resultado da promessa, é possível executar outros resultados derivados. Para isso, repete-se o ).then( com atenção para o retorno da variável que contém o resultado da função no then anterior
).then(
        (res) => {
            console.log("Resultado da promessa * 2: " + res * 2)
            return res
        }
).then(
        (res) => {
            console.log("Resultado da promessa * 3: " + res * 3)
        }

    //catch significa que a promessa não foi executada pois há algum erro na função resolve. A descrição do erro está armazenada na função erro.
).catch(
    (erro) => {
        console.log("Erro na promessa: ",erro)
    }

)