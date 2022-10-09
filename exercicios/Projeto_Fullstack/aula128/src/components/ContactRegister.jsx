import { useState } from "react";

export default function ContactRegister() {

    const [name, setName] = useState("");
    const [userId, setUserId] = useState("");
    const [groupId, setGroupId] = useState("");
    const [message, setMessage] = useState("");

    let handleSubmit = async (e) => {
        e.preventDefault();

        try {

            let result = await fetch("", {
                method: "POST",
                headers: { 'Content-Type': 'application/json'},
                body: JSON.stringify ({
                    name: name
                }),
            });

            let JSONResult = await result.json();

            if (result.status === 200 || result.status === 201) {
                setName("");
                setMessage("Contato criado com sucesso");
            } else {
                setMessage("Falha ao executar a operação");
            }

        } catch (error) {
            setMessage(error.message)
        }
    }

    return (
        <div>
            <form onSubmit={handleSubmit}>

                <input 
                    type="text"
                    value={name}
                    placeholder={"Nome do contato"}
                    onChange={(e) => setName(e.target.value)}
                />

                <input 
                    type="number"
                    value={groupId}
                    placeholder={"Id do grupo"}
                    onChange={(e) => setGroupId(e.target.value)}
                />

                <input 
                    type="number"
                    value={userId}
                    placeholder={"Id do usuário"}
                    onChange={(e) => setUserId(e.target.value)}
                />

                <button type="submit">
                    Cadastrar contato
                </button>

                <div>
                    {message ? <p>{message}</p> : null}
                </div>

            </form>
        </div>
    )
}