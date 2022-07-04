import React from 'react';
import styled from 'styled-components';
import styles from './styles.scss'

const Button = styled.button`
    margin-left: 10px;
    margin-right: 10px;
    font-size: 14px;
`

const EditButton = styled(Button)`

    background-color: lightyellow;
`

const RemoveButton = styled(Button)`

    background-color: lightcoral;
`


const UsersTable = (props) => (

    <table>

        <thead>
            <tr>
                <th>Nome</th>
                <th>UserName</th>
                <th>Email</th>
                <th>Ações</th>
            </tr>
        </thead>

        <tbody>

            {

                props.users.length > 0 ?
                (

                    props.users.map(user => (

                        <tr key={user.id}>
                            <td>{user.name}</td>
                            <td>{user.username}</td>
                            <td>{user.email}</td>

                            <EditButton onClick={
                                () => {
                                    props.editRow(user)
                                }
                            }>
                                Editar
                            </EditButton>

                            <RemoveButton onClick={
                                () => {
                                    props.deleteUser(user.id)
                                }
                            }>
                                Excluir
                            </RemoveButton>

                        </tr>
                    ))

                ):(
                    <tr>
                        <td colSpan={4}>Lista Vazia</td>
                    </tr>
                )
            }

        </tbody>

    </table>

)

export default UsersTable