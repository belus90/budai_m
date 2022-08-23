import React from "react";
import ShoeSelector from "../components/ShoeSelector";
import ShoeDetail from "../components/ShoeDetail";
import { useState, useEffect } from "react";


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

    // const onMunroClick = function(munro){
    //     setSelectedMunro(munro);
    // }

    const onShoeSelected = function(shoe){
        setSelectedShoe(shoe);
    }

    return (
        <div className="main-container">
            {/* <MunroList munros={munros} onMunroClick={onMunroClick} /> */}
            <ShoeSelector shoes={shoes} onShoeSelected={onShoeSelected} />
            {/* {selectedShoe ? <ShoeDetail selectedShoe={selectedShoe} /> : null} */}
            
        </div>
    )
}

export default ShoeContainer;
