import {useState} from 'react';
import Todos from './Todos';

export default function TodoList(){

    const [count, setCount] = useState(0)
    const [todos, setTodos] = useState([])

    const increment = () => {
        setCount(count + 1)
    }

    const addTodo = () => {
        setTodos(
            (todos) => [...todos, "Item número: " + count]
        )
    }

    return(

        <div>
            <Todos todos={todos} addTodo={addTodo}/>
            <div>
                <h4>Contador: {count}</h4>
                <button onClick={increment}>Incrementar</button>
            </div>
        </div>

    )

}