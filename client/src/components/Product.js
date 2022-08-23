import React from "react";
import SizeChart from "../components/SizeChart";
import ProductDetail from "../components/ProductDetail";
import "../style/MainBox.css";


function Product() {
    return (
        <div className="mainbox">
            <div className="productDetail">
                <ProductDetail />
            </div>
            <div className="sizeChart">
                <SizeChart />
            </div>
        </div>
    );
}

export default Product;