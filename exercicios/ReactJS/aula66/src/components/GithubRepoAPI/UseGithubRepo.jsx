import {useState, useEffect} from 'react';

export default function UseGithubRepo(url){

    const [data, setData] = useState(null)

    useEffect(
        () => {
            fetch(url)
            .then((result) => result.json())
            .then((data) => setData(data))
            .catch((error) => console.error(error))
        }, [url]
    )

    return {data}

}