import React, { useState, useEffect } from 'react';
import axios from 'axios'
import './App.css';
import SpringCheck from './components/SpringCheck';
import {BrowserRouter as Router,Routes,Route,} from "react-router-dom";


function App() {
  return(

    <div className='App'>
    <Router>
      <Routes>
        <Route path="/home"  element={<SpringCheck/>} />
     </Routes>
    </Router>
    </div>

  )
  
}


export default App;