let usuario = {
    nome:"Cassiano",
    idade:32,
    email:'cassiano@transformatec.com'
}

console.log(usuario.email)

//lendo as propriedades contidas dentro de um objeto
for (propriedade in usuario) {
    console.log(propriedade + " : " + usuario[propriedade])
}