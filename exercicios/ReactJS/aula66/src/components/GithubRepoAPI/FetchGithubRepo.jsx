import UseGithubRepo from "./UseGithubRepo";

export default function FetchGithubRepo(){

    const {data} = UseGithubRepo('https://api.github.com/users/cassiano-dio/repos')

    return (

        <div style={{border: '1px solid'}}>
            {
                data && (
                    data.map(
                        (repository) => (
                            <div key={repository.id} style={{border: '1px solid'}}>
                                <p>{repository.id} : {repository.name}</p>
                            </div>
                            )
                        )
                    )
            }
        </div>

    )


}