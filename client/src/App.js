// import React from 'react';
// import './App.css';
// // import Mainbox from './container/Mainbox';
// import Header from './components/Header';
// import './style/Footer.css';

// function App() {
//   return (
//     <div className="App">
//       <Header />
//       {/* <div className = "footer"> 
//       <Footer />
//       </div> */}
//       {/* <Mainbox /> */}
//     </div>
//   );
// }

// export default App;

import React from 'react';
import ShoeContainer from './container/ShoeContainer';

function App() {
  return (
    <div className="App">
      <h1>Shoes</h1>
     <ShoeContainer />
    </div>
  );
}

export default App;
