import React, { useState, useEffect } from 'react';
import axios from 'axios'


export default function SpringUseEffect(){
    
    const [ testStr, setTestStr ] = useState('');

    function callback(str) {
        setTestStr(str);
      }

      useEffect(() => {
          axios({
              url: '/home',
              method: 'GET'
          }).then((res) => {
              callback(res.data);
          })
        }, []
    );
  
    return testStr;
     
               
       
    


}