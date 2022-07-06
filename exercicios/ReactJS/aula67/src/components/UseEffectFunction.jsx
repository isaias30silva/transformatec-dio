import {useState, useEffect} from 'react'

export default function UseEffectFunction(){

    const [count, setCount] = useState(0)

    useEffect(
        () => {
            alert(count)
        },[count]
    )

    return(
        <div>
            <h4>Hook useEffect() em componente de Função</h4>
                <p>
                    Cliques: {count}
                </p>
                <button
                    onClick={
                        () => {
                            setCount(count + 1)
                        }
                    }
                >
                    Clique aqui amigo!
                </button>
        </div>
    )

}