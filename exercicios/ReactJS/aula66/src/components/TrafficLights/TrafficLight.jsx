import Light from "./Light";
import React, {useState, useEffect} from 'react';
import './styles.css'

const lightTimes = [3000, 2000, 1000]

export default function TrafficLight({initialValue}){

    const [colorIndex, setColorIndex] = useState(initialValue)

    useEffect(
        () => {
            const timer = setTimeout(
                () =>{
                    return setColorIndex((colorIndex + 1) % 3);
                }, lightTimes[colorIndex]
            )
            return () => {
                clearTimeout(timer)
            }
        }
    )

    return (
        <div className="traffic-light">
            <Light color="#f00" active={colorIndex === 0} />
            <Light color="#ff0" active={colorIndex === 2} />
            <Light color="#0c0" active={colorIndex === 1} />
        </div>
    )

}
