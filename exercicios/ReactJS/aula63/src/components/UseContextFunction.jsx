import {useState, useContext, createContext} from 'react'

const UserNameContext = createContext()

export default function PrimeiroComponente(){

    const [userName, setUserName] = useState('Cassiano')

    return(
        <div style={{border: '1px solid'}}>

            <UserNameContext.Provider value={userName} >

                <h3>UseContext em Componente de função</h3>
                <h4>Primeiro componente</h4>
                <p>
                    {`Olá ${userName}`}
                </p>

                <SegundoComponente />

            </UserNameContext.Provider>

        </div>
    )

}

function SegundoComponente(){
    return(
        <div style={{border: '1px solid'}}>
            <p>Segundo componente</p>

            <TerceiroComponente/>
        </div>
    )
}

function TerceiroComponente(){
    return(
        <div style={{border: '1px solid'}}>
            <p>Terceiro componente</p>

            <QuartoComponente/>
        </div>
    )
}

function QuartoComponente(){

    const userName = useContext(UserNameContext)

    return(
        <div style={{border: '1px solid'}}>
            <p>Quarto componente</p>
            <p>{`Olá ${userName} no quarto componente`}</p>
            <QuintoComponente/>
        </div>
    )
}

function QuintoComponente(){
    return(
        <div style={{border: '1px solid'}}>
            <p>Segundo componente</p>

            <SextoComponente/>
        </div>
    )
}

function SextoComponente(){

    const userName = useContext(UserNameContext)

    return(
        <div style={{border: '1px solid'}}>
            <h3>Sexto componente</h3>
            <p>{`Olá novamente ${userName}`}</p>
        </div>
    )

}