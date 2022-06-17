let carros = [ 
    {
        modelo: "Celta",
        cor: "Preto",
        ano: "2014"
    },
    {
        modelo: "Uno super-sônico de escada e adesivo de empresa de internet",
        cor: "Branco",
        ano: "1991"
    },
    {
        modelo: "Marea Bomba",
        cor: "Queimado",
        ano: "2001"
    },
    {
        modelo: "Lancer do Braia",
        cor: "verde limão",
        ano: "2002"
    }
];

//vetor        //objeto do vetor
carros.forEach(carro => {

    //propriedade do objeto de vetor
    carro.cor = "branco"
    console.log(carro)

});