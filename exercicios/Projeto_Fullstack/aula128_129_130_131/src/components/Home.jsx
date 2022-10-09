import React from "react";

import { Routes, Route, Link } from "react-router-dom";

import ContactList from "./ContactList";
import ContactRegister from "./ContactRegister";
import PhoneList from "./PhoneList";
import PhoneRegister from "./PhoneRegister";

import SignIn from "./SignIn";
import SignUp from "./SignUp";

export default function Home() {
    return (
        <div>
            <header className = "headerStyle">

                <Link className = "linkStyle" to="/signup">
                    Cadastro
                </Link>

                <Link className = "linkStyle" to="/signin">
                    Acesso
                </Link>

                <Link className = "linkStyle" to="/contacts/new">
                    Novo contato
                </Link>

                <Link className = "linkStyle" to="/contacts">
                    Lista de contatos
                </Link>

                <Link className = "linkStyle" to="/phones/new">
                    Novo telefone
                </Link>

                <Link className = "linkStyle" to="/phones">
                    Lista de telefones
                </Link>

            </header>

            <main>
                <Routes>
                    <Route path="/signup" element={<SignUp />}/>
                    <Route path="/signin" element={<SignIn />}/>
                    <Route path="/contacts/new" element={<ContactRegister/>}/>
                    <Route path="/contacts" element={<ContactList />}/>
                    <Route path="/phones/new" element={<PhoneRegister />}/>
                    <Route path="/phones" element={<PhoneList />}/>
                </Routes>
            </main>

        </div>
    )
}