import React, {useState} from 'react'

export default function SetStateFunction(){

    const [car, setCar] = useState(
        {
            model: "Opala",
            color: "preto",
            velocity: 210
        }
    )

    return(
        <div>
            <div style={{"padding": '35px'}}>

                <button
                    onClick={
                        () => setCar({velocity: 300})
                    }
                >
                    Atualizar velocidade Função

                </button>

                {JSON.stringify(car)}

            </div>
        </div>
    )

}