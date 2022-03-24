import axios from "axios";
import { useState } from "react";
import SpringUseEffect from "../Hooks/SpringUseEffect"
import { baseUrl } from "../config";
export default function SpringCheck(){

    const data = SpringUseEffect();
    const [tempdata , setTempDate] =useState([]);
    const [sanha , setSanha] =useState([]);
    

    const insertbtn = async() =>{
         alert(tempdata);
        await axios
        .get(baseUrl+ "/temp/insert",{
            params:{
            tempdata:tempdata
        }}

        ).then((response)=>{
            console.log(response.data)

        }).catch((error)=>{
            console.log(error);
        })
        

    };

    

    return( 
    <div>
        <h1>{data}</h1>
        <input type="text" placeholder="값을 넣어주세요" onChange={(e)=>{setTempDate(e.target.value)}}></input>
        <button onClick={insertbtn}>클릭!</button>
      
    </div>
    )
}