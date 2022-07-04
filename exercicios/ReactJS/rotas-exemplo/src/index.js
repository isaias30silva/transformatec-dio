import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {
  BrowserRouter,
  Routes,
  Route
} from 'react-router-dom';

import Expenses from './routes/expenses'
import Invoices from './routes/invoices'
import Invoice from './routes/invoice'

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
  
    <Routes>

      <Route path="/" element={<App/>}>

        <Route path="expenses" component={<Expenses />}/>
        <Route path="invoices" component={<Invoices />}>
          <Route
            index
            element={
              <main style={{ padding: "1rem" }}>
                Selecione uma fatura
              </main>
            }
            />
            <Route path=":invoiceId" element={<Invoice />}/>

          </Route>

      </Route>

      <Route 
        path="*"
        element={
          <main style={{padding: "1rem"}}>
            <h3>Página não encontrada</h3>
          </main>
        }

        >
      
      </Route>
    </Routes>

  </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
