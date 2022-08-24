import React from "react";
import "../style/ShoeSelector.css";
import ShoeDetail from "./ShoeDetail";
import { useState, useEffect } from "react";



const ShoeSelector = ({shoes}) => {

    const [selectedShoe, setSelectedShoe] = useState(null);
  
        // Looping through our db and creating a new array from it
    const shoeOptions = shoes.map((shoe, index) => {
        return <button value = {index} key = {index} onClick = {() => onShoeClick(shoe)}>
            <img src = {shoe.img} className = "img" /><br></br>{shoe.name}
            </button>
    })


    const onShoeClick = function(shoe){
        setSelectedShoe(shoe)
    }

    
        if (selectedShoe) {
            return (
            
            <div>
            <ul>
                <ShoeDetail selectedShoe = {selectedShoe}/>
            </ul>
            </div>
            );
        
        } else if (!selectedShoe) {
            return (      
            <div>
            <ul>
                {shoeOptions}
            </ul>
        </div>
            )}
        };
        
export default ShoeSelector;