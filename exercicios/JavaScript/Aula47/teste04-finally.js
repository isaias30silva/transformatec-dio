new Promise(
    (resolve) => {

        let a = 10
        let b = 12

        resolve (a + c)

    }
    //then significa que a promessa foi executada com sucesso. E retorna o resultado armazenado na função res.
).then(
    (res) => {
        console.log("Resultado da promessa: " + res)
    }
).catch(
    (erro) => {
        console.log("Erro na promessa: ",erro)
    }

    //finally significa que vai retornar uma mesma ação ou mensagem, sendo a promessa executada com sucesso ou não.
).finally(
    () => console.log("Fim da execução")
)