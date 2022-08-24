import React from "react";
import { useState, useEffect } from "react";
import ShoeSelector from "../components/ShoeSelector";
import "../style/ShoeContainer.css";
import ShoeDetail from "../components/ShoeDetail";



const ShoeContainer = () => {
    const [shoes, setShoes] = useState([]);
    const [selectedShoe, setSelectedShoe] = useState(null);

    useEffect(() => {
        getShoe();
    }, [])

    const getShoe = function(){
        fetch('http://localhost:8080/shoes')
        .then(res => res.json())
        .then(shoes => setShoes(shoes))
    }

    // const onShoeClick = function(shoe){
    //     setSelectedShoe(shoe);
    // }

    const onShoeSelected = function(shoe){
        setSelectedShoe(shoe);
    }

    return (
        <div className="main-container">
            <ShoeSelector shoes={shoes} onShoeSelected={onShoeSelected} />
            {selectedShoe ? <ShoeDetail selectedShoe={selectedShoe} /> : null}
            
        </div>
    )
}

export default ShoeContainer;
