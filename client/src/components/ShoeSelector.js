import React from "react";
import "../style/ShoeSelector.css";
import ShoeDetail from "./ShoeDetail";
import { useState, useEffect } from "react";



const ShoeSelector = ({shoes}) => {

    const [selectedShoe, setSelectedShoe] = useState(null);
    // previously we put another props up there as well called "onShoeSelected"
    // const handleChange = function(event) {
    //     const chosenShoe = shoes[event.target.value];
    //     onShoeSelected(chosenShoe);
    // }
    
    const shoeOptions = shoes.map((shoe, index) => {
        return <button value = {index} key = {index} onClick = {() => onShoeClick(shoe)}>
            <img src = {shoe.img} className = "img" /><br></br>{shoe.name}
            </button>
        // return <option value={index} key={index}>{shoe.name}</option>
    })

    const onShoeClick = function(shoe){
        setSelectedShoe(shoe)
        // console.log(shoe)
        // console.log(`Hello I am the ${shoe.name}` )
    }

    // const onBackButton = function () {
    //     setSelectedShoe(null);
    //   }


    // console.log({onShoeClick})

        if (selectedShoe) {
            return (
            
            <div>
            <ul>
                <ShoeDetail selectedShoe = {selectedShoe}/>
                {/* <button Class = "button_2" onClick={() => onBackButton()}>Choose another Region</button> */}
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