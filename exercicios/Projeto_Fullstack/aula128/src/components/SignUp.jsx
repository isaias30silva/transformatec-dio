import { useState } from "react";

export default function SignUP() {

    const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [message, setMessage] = useState("");

    let handleSubmit = async(e) => {

        e.preventDefault();

        try {

            //realizando uma requisição ao servidor da API
            let result = await fetch("http://localhost:8080/api/users", {
                method: "POST", 
                headers: {'Content-Type': 'application/json'},
                body: JSON.stringify({username: username, email: email, password: password
            }),
            });

            let JSONResult = await result.json();

            if (result.status === 200 || result.status === 201) {

                setEmail("");
                setUsername("");
                setPassword("");
                setMessage("Usuário registrado com sucesso");
                console.log(JSONResult);
            } else {
                console.log(result);
                setMessage("Falha ao executar a operação");
            };

        } catch (error) {

            console.log(error);
            setMessage(error.message);
        };
    };

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <input 
                    type="text"
                    value={username}
                    placeholder={"Username"}
                    onChange={(e) => setUsername(e.target.value)}
                />

                <input 
                    type="email"
                    value={email}
                    placeholder={"Email"}
                    onChange={(e) => setEmail(e.target.value)}
                />

                <input 
                    type="password"
                    value={password}
                    placeholder={"Senha"}
                    onChange={(e) => setPassword(e.target.value)}
                />

                <button type="submit">
                    Cadastrar
                </button>

                <div>
                    {message ? <p>{message}</p> : null}
                </div>

            </form>
        </div>
    )

}