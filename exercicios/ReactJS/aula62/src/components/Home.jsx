import React from "react";
import {Routes, Route, Link} from 'react-router-dom';
import Users from './Users';
import About from './About';

export default function Home(){

    return(
        <div>
            <header>

                <Link to="/">Home</Link>
                <Link to="/users">Usuários</Link>
                <Link to="/about">About</Link>

            </header>

            <main>
                <Routes>
                    <Route path="/" element={<Home />}/>
                    <Route path="/users" element={<Users />} />
                    <Route path="/about" element={<About />}/>

                </Routes>
            </main>
            <h3>Página de Home</h3>
        </div>
    )
}