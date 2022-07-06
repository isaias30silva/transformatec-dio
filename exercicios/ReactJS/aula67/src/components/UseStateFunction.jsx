import {useState} from 'react'

export default function UseStateFunction(){

    const [count, setCount] = useState(0)

    return(
        <div>
            <div>
                <h4>
                    Hook useState() em componente de função
                </h4>
                <p>Cliques: {count}</p>
                <button
                    onClick={
                        () => setCount(count + 1)
                    }
                >
                    Clique aqui amigo!
                </button>
            </div>
        </div>
    )
}