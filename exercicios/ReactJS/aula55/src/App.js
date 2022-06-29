import './App.css';
import HelloWorld from './components/HelloWorld';
import Car from './components/Car';
import PersonRegister from './components/PersonRegister';
import GameScore from './components/GameScore';

function App() {
  return (
    <div className="App">
      <HelloWorld name="Isaias!"/>
      <Car owner="Não dirija correndo!"/>
      <PersonRegister name="Isaias" age={30} lasName="Silva" job="Estudante"/>
      <GameScore/>
    </div>
  );
}

export default App;
