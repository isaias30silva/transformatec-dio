import './App.css';
import {Link, Outlet} from 'react-router-dom'

function App() {
  return (
    <div>
      <h1>Lista de Faturas</h1>
      <nav
        style={{
          borderBottom: "solid 1px",
          paddingBottom: "irem",
        }}>

        <Link to={"/invoices"}>Faturas</Link>
        <Link to={"/expenses"}>Despesas</Link>

      </nav>
      <Outlet />
    </div>

  )
}

export default App;
