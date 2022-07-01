import React, {useState} from "react";
import AddUserForm from "./AddUserForm";
import EditUserForm from "./EditUserForm";

const Users = () => {

    const usersData = [
        {id: 1, name: 'Cassiano', username: 'CassianoP', email: 'cassiano@gmail.com'},

        {id: 2, name: 'Josefina', username: 'JosefinaS', email: 'josefina@gmail.com'},

        {id: 3, name: 'Carlito', username: 'CarlitoP', email: 'carlito@gmail.com'},
    ]

    const initForm = {id:null, name:'', username:'', email:''}

    const [users, setUsers] = useState(usersData)
    const [currentUser, setCurrentUser] = useState(initForm)
    const [editing, setEditing] = useState(false)

    const addUser = (user) => {
        user.id = users.length + 1
        setUsers([...user,user])
    }

    const deleteUser = (id) => {
        setEditing(false)

        setUsers(
            users.filter(
                (user) => {
                    user.id !== id
                }
            )
        )
    }

    const updateUser = (id, updateUser) => {

        setEditing(false)

        setUsers(users.map(
            (user) => {
                user.id === id ? updateUser : user
            }
        ))

    }

    const editRow = (user) => {

        setEditing(true)
        setCurrentUser({id: user.id, name: user.name, username: user.username, email: user.email})

    }

    return(
        <div>
            <h2>Cadastro de Usuários</h2>
        </div>
    )

}

export default Users