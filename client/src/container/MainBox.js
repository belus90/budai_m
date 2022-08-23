import React from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import ProductList from "../components/ProductList";
import SizeChart from "../components/SizeChart";
import ProductDetail from "../components/ProductDetail";
import "../style/MainBox.css";


function Mainbox() {
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

export default Mainbox;

//the mainbox and the product.js was the same before doing the fetching 