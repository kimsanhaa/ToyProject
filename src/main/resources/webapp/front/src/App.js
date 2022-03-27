import React, { useState, useEffect } from 'react';
import axios from 'axios'
import './App.css';
import SpringCheck from './components/SpringCheck';
import {BrowserRouter as Router,Routes,Route,} from "react-router-dom";
import KakaoMap from './components/KakaoMap';
import Header from './components/Header';
import Login from './components/Login';
import SearchBar from './components/SearchBar';
import GillBoardService from './pages/GillBoardService';


function App() {
  return(

    <div className='App'>
    <Router>
   <Header/>
   <Login />
      <Routes>
        <Route path="/home"  element={<SpringCheck/>} />
        <Route path="/GillBoardService"  element={<GillBoardService/>} />
       
        

     </Routes>
    </Router>
    </div>

  )
  
}


export default App;