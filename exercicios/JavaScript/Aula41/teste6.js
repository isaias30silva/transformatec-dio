var pessoa = {
    "nome":"José",
    "idade":54
}

console.log("Tipo ANTES do stringfy", typeof(pessoa))

var pessoa_str = JSON.stringify(pessoa)

console.log("Tipo DEPOIS do stringfy", typeof(pessoa_str))