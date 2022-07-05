import React from "react";

export default class SetStateClass extends React.Component{

    constructor(){
        super()
        this.state = {
            model: "Opala",
            color: "preto",
            velocity: 210
        }
    }

    render(){

        return(
            <div style={{"padding": '35px'}}>

                <button
                    onClick={
                        () => this.setState({velocity: 280})
                    }
                >
                    Atualizar velocidade Classe

                </button>

                {JSON.stringify(this.state)}
            </div>
        )

    }
}