import React from  "react";
import SizeChart from "../components/SizeChart";
import "../style/ShoeDetail.css";
import "../style/SizeChart.css";



const ShoeDetail = ({selectedShoe}) => {

    return (
        <div className = "shoeDetail">
            <br></br> <br></br> <br></br>
            <h3>{selectedShoe.name}</h3>
            <a href = "/products">Go back.....</a>
        
                <div  className = "shoeDetailImg">
                <br></br>
                {/* // Multiple pictures from the db  */}
                    <img  src = {selectedShoe.img}/>
                    <img  src = {selectedShoe.pictures[0].img}/>
                    <img  src = {selectedShoe.pictures[1].img}/>
                    <img  src = {selectedShoe.pictures[2].img}/>
                    <br></br>
                </div>

            <div className="sizeChart">
                <br></br> <br></br> <br></br>
                <h4> Description </h4>
                <p>{selectedShoe.description}</p> 
                <br></br> <br></br> <br></br>
                <SizeChart />
                <br></br>
                <button className = "basketB"> Click to Buy: £{selectedShoe.price}</button>
                
            </div>
        </div>
        
    )
}

export default ShoeDetail;