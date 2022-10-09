import React from "react";

const Phone = ({ddd, ddi, pnumber}) => {

    return (
        <div>
            <p>DDD: {ddd}</p>
            <p>DDI: {ddi}</p>
            <p>Número: {pnumber}</p>
        </div>
    )
}

export default Phone;