import React from 'react';
// import ShoeContainer from '../containers/ShoeContainer';

const ShoeDetail = ({selectedShoe}) => {
  return (
        <div>
            <h3>Name: {selectedShoe.name}</h3>
            <img  src = {selectedShoe.img}/>
            <img  src = {selectedShoe.pictures[0].img}/>
            <img  src = {selectedShoe.pictures[1].img}/>
            <img  src = {selectedShoe.pictures[2].img}/>
            <p>Price: £{selectedShoe.price}</p>
            <p>Description:{selectedShoe.description}</p>
            <p>Quantity on stock: {selectedShoe.quantity} piece</p>
        </div>
  )
}

export default ShoeDetail;