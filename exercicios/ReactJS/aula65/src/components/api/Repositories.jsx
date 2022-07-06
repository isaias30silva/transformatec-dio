import useFetchData from "./UseFetchData";

export default function Repositories(){

    const url = 'https://api.github.com/users/cassiano-dio/repos'

    const {data} = useFetchData(url)

    return(
        <div>
            {data && (
                data.map((repository) => (
                    <div className="text-white" key={repository.id}>
                        <p>{repository.id} : {repository.name}</p>

                    </div>
                ))
            )}
        </div>
    )

}