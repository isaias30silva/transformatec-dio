import React from 'react';
import './styles.css'

export default function Light({color, active}){

    return(

        <div
            className={"light"}
            style={{
                backgroundColor:color, opacity: active ? 1 : 0.4
            }}
        />
    )

}