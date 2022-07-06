import UseEffectClass from "./components/UseEffectClass";
import UseEffectFunction from "./components/UseEffectFunction";
import Repositories from "./components/api/Repositories";
import TodoList from "./components/todos/TodoList";
import TodoListCallback from "./components/todos/TodoListCallback";
import UseCallbackMemo from "./components/todos/UseCallbackMemo";

function App() {
  return(
    <div className="App">
      {/* <UseEffectClass /> */}
      {/* <UseEffectFunction /> */}
      {/* <Repositories /> */}
      {/* <TodoList /> */}
      {/* <TodoListCallback /> */}
      <UseCallbackMemo />

    </div>
  );
}

export default App;