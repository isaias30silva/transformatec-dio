import React from 'react'

export default class UseStateClass extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            count: 0
        }
    }

    render(){
        return(
            <div>
                <h4>
                    Hook useState() em componente de classe
                </h4>
                <p>Cliques: {this.state.count}</p>
                <button
                    onClick={
                        () => this.setState({count: this.state.count + 1})
                    }
                >
                    Clique aqui amigo!
                </button>
            </div>
        )
    }

}