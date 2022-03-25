import React, { useState } from "react";
import KakaoMap from "./KakaoMap";


export default function SearchPlace(){

    const [inputText, setInputText] = useState("");
    const [place, setPlace] = useState("");

    const onChange = (e) => {
        setInputText(e.target.value);
      };

      const handleSubmit = (e) => {
        e.preventDefault();
        setPlace(inputText);
        setInputText("");
      };

      return (
        <>
      
      <div style={{
        float:"left",
        width:"300px",
        height:"620px",
        border: "10px solid #C4C4C4"}}>

          <form className="inputForm" onSubmit={handleSubmit}>
            <input
              placeholder="Search Place..."
              onChange={onChange}
              value={inputText}
            />
            <button type="submit">검색</button>
          </form>
          <div></div>
          </div> 
          
         
          <KakaoMap searchPlace={place} />
        </> 
      );
    
}