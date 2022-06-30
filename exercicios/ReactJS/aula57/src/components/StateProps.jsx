import {useState} from "react";

function StateProps(props){

    const [cor, setCor] = useState("azul")

    return(
        <div>
            <h2>Componente de função com Props</h2>
            <h3>Minha cor favorita: {cor}</h3>
            <button onClick={
                () => setCor(props.cor)
            }>
                Minha cor favorita
            </button>
        </div>
    )

}

export default StateProps