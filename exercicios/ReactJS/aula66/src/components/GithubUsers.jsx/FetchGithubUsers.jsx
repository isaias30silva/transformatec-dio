import UseGithubUsers from "./UseGithubUsers";

export default function FetchGithubUsers(){

    const {setQuery, results} = UseGithubUsers()

    return(
        <div>
            <input type="text" onChange={
                event => setQuery(event.target.value)
            } />

            <div style={{border: '1px solid black'}}>
                {
                    results &&
                    results.map(
                        (item, index) => <div key={index}> {item.login}</div>
                    )
                }

            </div>

        </div>

    )

}