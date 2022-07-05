import React, {useState} from 'react'

function counter(){
    return Math.random();
}

export default function LazySetState(){

    const [randomNumber, setRandomNumber] = useState(counter())

    return(
        <div>
            <h3>Inicialização lenta</h3>
            <p>Valor do state inicial: {randomNumber}</p>
        </div>
    )

}