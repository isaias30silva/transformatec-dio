function HelloWorldAdd(props) {

    let a = 30;
    let b = 50;

    return (

        <div>
            <p>
                Add: {props.addNumber(a,b)}
            </p>
        </div>

    )

}

export default HelloWorldAdd