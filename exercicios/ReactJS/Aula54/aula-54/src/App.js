import './App.css';
import HelloWorldDIO from './components/HelloWorldDIO'
import HelloWorldDIOClass from './components/HelloWorldDIOClass';
import HelloWorldDev from './components/HelloWorldDev';
import HelloWorldCalculator from './components/HelloWorldCalculator';
import HelloWorldFunction from './components/HelloWorldFunction';

function App() {
  return (
    <div className="App">
      <HelloWorldDIO />
      <HelloWorldDIOClass />
      <HelloWorldDev name="Isaias" />
      <HelloWorldCalculator n1={3} n2={5}/>
      <HelloWorldFunction />
    </div>
  );
}

export default App;
