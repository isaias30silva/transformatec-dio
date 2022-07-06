import React, {useState, useCallback} from 'react';
import Todo from './Todo';
import TodoForm from './TodoForm';

export default function TodoList(){

    const [todos, setTodos] = useState(
        [
            {
                text: 'Aula Transformatec',
                isCompleted: false
            },
            {
                text: 'Produção de Conteúdo',
                isCompleted: true
            },
            {
                text: 'Estudar para certificação',
                isCompleted: false
            }
        ]
    )

    const addTodo = useCallback(
        (text) => {
            const newTodos = [...todos, {text}]
            setTodos(newTodos)
        },[todos]
    )

    const completeTodo = (index) => {
        const newTodos = [...todos]
        newTodos[index].isCompleted = true
        setTodos(newTodos)
    }

    const removeTodo = (index) => {
        const newTodos = [...todos]
        newTodos.splice(index,1)
        setTodos(newTodos)
    }

    return(

        <div className="app">
            <div className="todo-list">
                {
                    todos.map(
                        (todo, index) => (
                            <Todo 
                                key={index}
                                index={index}
                                todo={todo}
                                completeTodo={completeTodo}
                                removeTodo={removeTodo}
                            />
                        )
                    )
                }
                <TodoForm addTodo={addTodo}/>
            </div>
        </div>

    )

}