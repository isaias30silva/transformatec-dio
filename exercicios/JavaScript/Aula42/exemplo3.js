var pessoa = {
    "nome": "Cassino",
    "idade": 32,
    "cpf": "000000000",
    "competencias": ["javascript", "cloud", "api"],
    "atividades": [
        {
            "descricao":"Reunião da DIO",
            "horario":"9:00am"
    },
    {
        "descricao":"Transforma Tec",
        "horario":"2:00pm"
    }
]
}

//acessando e imprimindo todas as informações do objeto pessoa
console.log("Pessoa",pessoa)

//acessando e imprimindo o nome do objeto pessoa
console.log("Nome da pessoa:", pessoa.nome)

//acessando e imprindo o primeiro índice de competências do objeto pessoa
console.log("Competência da pessoa:" ,pessoa.competencias[0])

//acessando e imprimendo as atividades da pessoa. primeiro, define o indice, depois coloca ponto. e seleciona qual a atividade relacionada
console.log("Nome da atividade da pessoa: ", pessoa.atividades[1].descricao)