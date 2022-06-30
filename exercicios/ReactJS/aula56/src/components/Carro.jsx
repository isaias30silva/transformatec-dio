import React from "react";

class Carro extends React.Component {

    constructor(props) {
        super(props);
        this.modelo = "Marea"

        this.state = {
            ligado: false,
            explodiu: false,
            velocidade: 0
        }
    }

    ligaDesliga() {
        this.setState({ligado: !this.state.ligado})

        if (this.state.ligado == false) {
        }
    }

    acelerar() {
        let velo = this.state.velocidade + 10
        this.setState({velocidade: velo})

        if (this.state.velocidade > 190) {
            this.setState({explodiu: true})
        }
    }

    frear() {
        let velo = this.state.velocidade - 10
        this.setState({velocidade: velo})

    }

    parar() {
        this.setState({velocidade: 0})
        this.setState({explodiu: false})
        this.setState({ligado: false})
    }

    render() {
        return (
            <div>
                <h4>
                Carro bomba: {this.modelo}
                </h4>
                <h4>
                Ligado: {this.state.ligado ? "Sim" : "Não"}
                </h4>
                <h4>
                Explodiu: {this.state.explodiu ? "BOOOMMMMMM!" : "Não"}
                </h4>
                <h4>
                Velocidade: {this.state.velocidade}
                </h4>

                <button onClick={
                    () => this.ligaDesliga()
                }>Liga/Desliga
                </button>

                <button onClick={
                    () => this.acelerar()
                }>Acelerar
                </button>

                <button onClick={
                    () => this.frear()
                }>Frear
                </button>

                <button onClick={
                    () => this.parar()
                }>Parar
                </button>

            </div>
        )
    }

}

export default Carro