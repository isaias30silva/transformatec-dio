import React from 'react';

export default class UseStateClass extends React.Component{

    constructor(props){
        super(props);

        //Definir o estado inicial do contador de clicks
        this.state = {
            clicks: 0
        }
    }

    render(){
        return(
            <div>
                <h3>Set State Componente de classe</h3>
                <p>Quantidade de clicks: {this.state.clicks}</p>
                <button
                    onClick={
                        //Atualizando o estado da variável clicks
                        () => this.setState({clicks: this.state.clicks + 1})
                    }>

                    Clique aqui!
                </button>
            </div>
        )
    }
}