import './App.css';
import Hello from'./components/hello'
import HelloDio from'./components/helloDio'

function App() {
  return (
    <div className="App">
      <Hello />
      <HelloDio dev_name="Isaias" dev_surname="Silva"/>
    </div>
  );
}

export default App;
