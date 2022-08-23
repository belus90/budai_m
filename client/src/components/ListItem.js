import React from 'react';
import './ListItem.css';

const ListItem = ({shoe, onShoeClick}) => {

  const handleClick = function(){
    onShoeClick(shoe);
  }


  return <li onClick={handleClick}>{shoe.name}</li>
}

export default ListItem;