import React, {useState} from 'react'

export default function UsePrevState(){

    const [saldo, setSaldo] = useState(150)

    const depositar = () => {
        setTimeout(() => {
            
            //setSaldo( saldo + 100);
            setSaldo(
                (prevState) => prevState + 100
            )
        }, 3000);
    }

    return(
        <div>
            <h4>
                Hook useState() com prevState
            </h4>
            <button
                onClick={depositar}
            >
                Depositar 100
            </button>

            <button
                onClick={
                    () => setSaldo(saldo - 200)
                }
            >
                Sacar 200
            </button>

            <p>
                Meu saldo atual é: R$ {saldo},00
            </p>

        </div>
    )

}