import { Component } from "react";

export default class UseEffectClass extends Component {

    constructor(props){
        super(props)

        this.state = {
            count: 0
        }
    }

    componentDidMount(){
        alert(this.state.count)
    }
    componentDidUpdate(){
        alert(this.state.count)
    }

    render(){
        return(
            <div>
                <h4>Hook useEffect() em componente de Classe</h4>
                <p>
                    Cliques: {this.state.count}
                </p>
                <button
                    onClick={
                        () => {
                            this.setState({count: this.state.count + 1})
                        }
                    }
                >
                    Clique aqui amigo!
                </button>
            </div>
        )
    }

}