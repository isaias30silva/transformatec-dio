
new Promise((resolve,rejeijta) => {

    console.log("Promessa pendente")

    let r = 0

    resolve(r+1)
})
.then((res) => {
    console.log("Promessa resolvida:", res)
}).catch((erro) => {
    console.log("Promessa rejeitada:",erro)
}).finally(() => {
    console.log("Executa de qualquer forma")
})