import React, {useState} from "react";

import AddUserForm from "./AddUserForm";
import UsersTable from "./UsersTable";

export default function Users(){

    const usersData = [
        { id: 1, name: 'Cassiano', email: 'cassiano@dio.com' },
        { id: 2, name: 'Cassio', email: 'cassio@dio.com' },
        { id: 3, name: 'Cassi', email: 'cassi@dio.com'},
    ]

    const [users, setUsers] = useState(usersData)

    const addUser = (user) => {
        user.id = users.length + 1

        setUsers([...users,user])

    }

    return(
        <div>
            <h3>Cadastro de usuários</h3>
            <div>
                <div>
                    <div style={{width: '50%'}}>
                        <h4>Novo</h4>
                        <AddUserForm addUser = {addUser} />
                    </div>
                </div>
                <div>
                    <h4>
                        Lista de usuários
                        <UsersTable users = {users} />
                    </h4>
                </div>
            </div>
        </div>
    )
}