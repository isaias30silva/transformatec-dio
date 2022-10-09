import logo from './logo.svg';
import './App.css';
import SignUp from './components/SignUp';
import ContactRegister from './components/ContactRegister';
import SignIn from './components/SignIn';
import GroupRegister from './components/GroupRegister';
import PhoneRegister from './components/PhoneRegister';
import ContactList from './components/ContactList';
import PhoneList from './components/PhoneList';
import Home from './components/Home';

function App() {
  return (
    <div>
      {/*<SignUp />
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
      <br />
      <PhoneList />
      <br /> */}
      <Home />
    </div>
  );
}

export default App;
