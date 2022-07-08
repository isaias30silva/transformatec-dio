import React from 'react';
import styled from 'styled-components';

const Coin = ({name, icon, price, symbol}) => {

    const Card = styled.div`
        text-align: center;
        width: 200px;
        margin: 20px 20px 20px 20px;
        padding: 10px;
        background-color: cadetblue;
        border-radius: 5px;
    `

    return(
        <Card className="card">

            <div>{name}:{symbol}</div>
            <img className="coin-icon" src={icon} alt={name} />
            <div>
                <strong>USD: {price.toFixed(2)} </strong>
            </div>

        </Card>
    )
}

export default Coin