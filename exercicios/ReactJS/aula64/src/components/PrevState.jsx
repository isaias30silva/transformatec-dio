import React, {useState} from 'react'

export default function PrevState(){

    const [balance, setBalance] = useState(100)

    const depositCash = () => {
        setTimeout(
            () => {
                //setBalance(balance + 100)
                setBalance(
                    (prevState) => prevState + 100
                )
            }, 3000
        )
    }

    return(
        <div>
            <h4>Meu saldo é {balance}</h4>
            <button
                onClick={depositCash}
            > Depositar 100 </button>
            <button
                onClick={
                    () => setBalance(balance - 200)
                }
            >Sacar 200</button>
        </div>
    )

}