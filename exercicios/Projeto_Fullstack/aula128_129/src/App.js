import logo from './logo.svg';
import './App.css';
import SignUp from './components/SignUp';
import ContactRegister from './components/ContactRegister';
import SignIn from './components/SignIn';
import GroupRegister from './components/GroupRegister';
import PhoneRegister from './components/PhoneRegister';
import ContactList from './components/ContactList';

function App() {
  return (
    <div className="App">
      <SignUp />
      <br />
      <SignIn />
      <br />
      <ContactRegister />
      <br />
      <GroupRegister />
      <br />
      <PhoneRegister />
      <br />
      <ContactList />
    </div>
  );
}

export default App;
