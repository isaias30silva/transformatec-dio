import React, {useState} from 'react';

export default function TodoForm({addTodo}){

    const [todoValue, setTodoValue] = useState("")

    const handleSubmit = (event) => {

        event.preventDefault()

        if(!todoValue){
            return
        }

        addTodo(todoValue)
        setTodoValue("")

    }

    return (
        <form onSubmit={handleSubmit}>
            
            <input
                type="text"
                className="input"
                value={todoValue}
                onChange={
                    (event) => {
                        return setTodoValue(event.target.value)
                    }
                }
            />

            <button>Enviar</button>

        </form>
    )

}