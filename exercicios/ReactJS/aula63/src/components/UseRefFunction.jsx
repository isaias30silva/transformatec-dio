import { useState, useEffect, useRef } from "react";

export default function useRefFunction(){

    const [inputValue, setInputValue] = useState("")
    const previousInputValue = useRef("")

    useEffect(() => {
        previousInputValue.current = inputValue;
    }, [inputValue]);

    return(
        <div>
            <h3>UseRef em Componente de função</h3>
            <input 
                type="text"
                value={inputValue} 
                onChange={(
                    (event) => setInputValue(event.target.value)
                )}
            />
            <h4>
                Valor Atual: {inputValue}
            </h4>
            <h4>
                Valor Anterior: {previousInputValue.current}
            </h4>
        </div>
    )

}