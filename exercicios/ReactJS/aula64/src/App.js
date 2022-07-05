import SetColor from './components/SetColor';
import LazySetState from './components/LazySetState';
import PrevState from './components/PrevState';
import SetStateClass from './components/SetStateClass';
import SetStateFunction from './components/SetStateFunction';
import SetStateFunctionPrev from './components/SetStateFunctionPrev';
import SetStateForm from './components/SetStateForm';

function App() {
  return(
    <div className="App">
      <SetColor />
      <LazySetState /> 
      <PrevState />
      <SetStateClass />
      <SetStateFunction />
      <SetStateFunctionPrev />
      <SetStateForm />

    </div>
  );
}

export default App;