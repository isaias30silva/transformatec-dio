import React, {useState} from 'react'

export default function SetStateFunctionPrev(){

    const [car, setCar] = useState({
        model: "Opala",
        color: "preto",
        velocity: 210
    })

    return(
        <div>
            <button
                onClick={

                    () => setCar(
                        (prevState) => {
                            return {...prevState,velocity: 450}
                        }
                    )
                }
            >
                Atualizar Velocidade Função PrevState
            </button>
            {JSON.stringify(car)}
        </div>
    )

}