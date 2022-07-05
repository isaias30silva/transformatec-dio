import React, {useState} from "react";

const AddUserForm = (props) => {

    const formStyle = {
        display: 'flex',
        flexDirection: 'column',
    }

    const initUser = {id:null, name:'', email:''}

    const [user, setUser] = useState(initUser)

    const handleInputChange = (event) => {

        const {name, value} = event.target

        setUser({...user, [name]:value})
    }

    return(
        <form style={formStyle}

        onSubmit={
            (event) => {
                    event.preventDefault()

                    props.addUser(user)
                    setUser(initUser)
            }
        }
        >
        <label>Nome</label>
            <input type="text" name="name" value={user.name} onChange={handleInputChange} />
        
        <label>Email</label>
            <input type="text" name="email" value={user.email} onChange={handleInputChange} />
        <button>Registrar</button>

        </form>
    )
}

export default AddUserForm