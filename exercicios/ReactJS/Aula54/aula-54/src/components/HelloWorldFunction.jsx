import HelloWorldAdd from './HelloWorldAdd';

function HelloWorldFunction() {

    const addNumber = (n1,n2) => {

        return n1 + n2;

    }

    return (
        <HelloWorldAdd addNumber={addNumber}/>
    )

}

export default HelloWorldFunction