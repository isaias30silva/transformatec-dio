import React, {useEffect, useState} from 'react'

export default function UseEffectFunction(){

    const [clicks, setClicks] = useState(0)
    const [clicks2, setClicks2] = useState(0)

    useEffect(() => {
        document.title = `Quantidade de clicks (f): ${clicks}`
    },[clicks])

    return(
        <div>
            <h3>UseEffect em Componente de função</h3>
            <p>Quantidade de clicks: {clicks}</p>
            <button onClick={
                () => setClicks(clicks + 1)
            }>
                Clique aqui!
            </button>
        </div>
    )

}