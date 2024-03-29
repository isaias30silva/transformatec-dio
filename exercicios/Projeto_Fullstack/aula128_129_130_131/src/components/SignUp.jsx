import { useState } from "react";
import styles from "../styles/styles.module.css"
import AddButton from "./AddButton";

export default function SignUP() {

    const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [message, setMessage] = useState("");

    const formStyle = {
        display: 'flex',
        flexDirection: 'column'
    }

    let handleSubmit = async(e) => {

        e.preventDefault();

        try {

            //realizando uma requisição ao servidor da API
            let res = await fetch("http://localhost:8080/api/users", {
                method: "POST", 
                headers: {'Content-Type': 'application/json'},
                body: JSON.stringify({username: username, email: email, password: password
            }),
            });

            //manipulando o resultado da request
            let jsonRes = await res.json();

            if (res.status === 200 || res.status === 201) {

                setEmail("");
                setUsername("");
                setPassword("");
                setMessage("Usuário registrado com sucesso");
                console.log(jsonRes);
            } else {
                console.log(res);
                setMessage("Falha ao executar a operação");
            }

        } catch (error) {
            setMessage("Falha ao executar operação");
            console.log(error);

        }
    };

    return (
        <div>
            <h3>Cadastro</h3>
            <form onSubmit={handleSubmit} style={formStyle}>
                <input 
                    type="text"
                    value={username}
                    placeholder={"Nome"}
                    className={styles.input}
                    onChange={(e) => setUsername(e.target.value)}
                />

                <input 
                    type="email"
                    value={email}
                    placeholder={"Email"}
                    className={styles.input}
                    onChange={(e) => setEmail(e.target.value)}
                />

                <input 
                    type="password"
                    value={password}
                    placeholder={"Senha"}
                    className={styles.input}
                    onChange={(e) => setPassword(e.target.value)}
                />

                <AddButton>SignUp</AddButton>

                <div className = "message">{message ? <p>{message}</p> : null}</div>

            </form>
        </div>
    )

}