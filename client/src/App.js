import Header from "./components/Header";
import React from "react";
import Footer from "./components/Footer";
import "./style/Footer.css";
// import ShoeContainer from './container/ShoeContainer';

function App() {
  return (
    <div className="App">
      <Header />
     {/* <ShoeContainer />  */}
      <div className = "footer">
      <Footer />
      </div>

    </div>
  );
}

export default App;
