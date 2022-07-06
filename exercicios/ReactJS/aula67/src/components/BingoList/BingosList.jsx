import {useState, useCallback} from 'react'
import Bingos from './Bingos'

export default function BingosList(){

    const [num, setNum] = useState(0)
    const [bingos,setBingos] = useState([])

    console.log("Renderização do componente pai!")

    const incrementNum = () => {
        setNum((num) => num + 1)
    }

    //const addBingo = () => {
    //    setBingos(
    //        (b) => [...b, 10]
    //    )
    //}

    const addBingo = useCallback(
        () => {
            setBingos((b) => [...b, 10])
        }, [bingos]
    )

    return(
        <div>
            <Bingos bingos={bingos} addBingo={addBingo}/>
            <div>
                <p>Quantidade de números sorteados no bingo: {num}</p>
                <button onClick={incrementNum}>Atualizar quantidade de números sorteados</button>
            </div>
        </div>
    )

}