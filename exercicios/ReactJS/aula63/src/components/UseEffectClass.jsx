import React from "react";

export default class UseEffectClass extends React.Component {

    constructor(props){
        super(props)

        this.state = {
            clicks: 0
        }
    }

    componentDidMount(){
        document.title = `Quantidade de clicks: ${this.state.clicks}`
    }

    componentDidUpdate(){
        document.title = `Quantidade de clicks: ${this.state.clicks}`
    }


    render() {
        return(
            <div>
                <h3>UseEffect em Componente de classe</h3>
                <p>Quantidade de clicks: {this.state.clicks}</p>
                <button
                    onClick={
                        () => this.setState({clicks: this.state.clicks + 1})
                    }
                >
                    Clique aqui!
                </button>
            </div>
        )
    }

}