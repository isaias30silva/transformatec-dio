import React from "react";

const UsersTable = (props) => (

    <table>
        <thead>
            <tr>
                <th>Nome</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            {
                props.users.length > 0 ? (

                    props.users.map(user => (
                        <tr key={user.id}>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                        </tr>
                    ))

                ):(
                    <tr>
                        <td colSpan={2}>Lista Vazia</td>
                    </tr>
                )
            }
        </tbody>
    </table>

)

export default UsersTable