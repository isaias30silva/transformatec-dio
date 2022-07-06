import React, {useState} from 'react'

export default function UsePrevStateObject(){

    const [user, setUser] = useState(
        {
            name:'Cassiano',
            age: 32,
            job:'Developer'
        }
    )

    return(
        <div>
            <h4>Hook useState() com prevState em objeto</h4>
            <button
            //    onClick={
            //        () => setUser({job:'SysOps Admin'})
            //    }
            onClick={
                () => {
                    setUser(
                        (prevState) => {
                            return {...prevState, job:'SysOps Admin'}
                        }
                    )
                }
            }
            >
                Alterar profissão
            </button>
            <p>
                {JSON.stringify(user)}
            </p>
        </div>
    )

}