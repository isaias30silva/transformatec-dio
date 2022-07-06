import React from "react";

export default function Bingos(props){

    console.log("Renderização do componente filho!")

    return(
        <div>
            <h4>Lista de números sorteados do bingo</h4>
            <button
                onClick={props.addBingo}
            >
                Sortear número do bingo
            </button>
            {
                props.bingos.map(
                    (bingo, index) => {
                        return (
                            <p key={index}>
                                {bingo}
                            </p>
                        )
                    }
                )
            }
        </div>
    )

}