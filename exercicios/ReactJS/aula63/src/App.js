import logo from './logo.svg';
import './App.css';
import UseStateClass from './components/UseStateClass';
import UseStateFunction from './components/UseStateFunction';
import UseEffectClass from './components/UseEffectClass';
import UseEffectFunction from './components/UseEffectFunction';
import UseContextFunction from './components/UseContextFunction';
import UseRefFunction from './components/UseRefFunction';

function App() {
  return (
    <div className="App">
      <UseStateClass />
      <UseStateFunction />
      <UseEffectClass/>
      <UseEffectFunction />
      <UseContextFunction />
      <UseRefFunction />
    </div>
  );
}

export default App;
