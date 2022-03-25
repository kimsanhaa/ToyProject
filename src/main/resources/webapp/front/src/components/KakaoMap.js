/* global kakao */
import React, { useEffect, useState } from "react";
import SearchPlace from "./SearchPlace";
import axios from "axios";
import Header from "./Header";
const { kakao } = window;

function LiveLatitude() {
    const [latitude, setlatitude] = useState(0);

    //실시간 접속 위치 출력 
    useEffect(() => {
        navigator.geolocation.getCurrentPosition(function (pos) {
       
            setlatitude(pos.coords.latitude);
            console.log(latitude);


        });
    }, [latitude, setlatitude]);
    return [latitude, setlatitude];
}

function LiveLongitude() {
    const [longitude, setlongitude] = useState(0);
    useEffect(() => {
        navigator.geolocation.getCurrentPosition(function (pos) {
            setlongitude(pos.coords.longitude);
            console.log(longitude)

        }); 
    }, [longitude, setlongitude]);
    return [longitude, setlongitude];
}

function Address (latitude,longitude) {
    const [address_name,setAddress_name] = useState([]);
    //현재 위치를 출력 해주는 로직(좌표 -> 주소반환)
    let lat = latitude;
    let lng = longitude;
    getAddr(lat, lng);
    function getAddr(lat, lng) {
        let geocoder = new kakao.maps.services.Geocoder();

        let coord = new kakao.maps.LatLng(lat, lng);
        let callback = function (result, status) {
            if (status === kakao.maps.services.Status.OK) {
                setAddress_name(result[0].address.address_name);
                console.log(address_name)
              
            }

        }
        
        geocoder.coord2Address(coord.getLng(), coord.getLat(), callback);
    }
    return address_name;
}

// main 컴포넌트
const KakaoMap = () => {
    const [latitude, setlatitude] = LiveLatitude();
    const [longitude, setlongitude] = LiveLongitude();
 
  

    return (
        <div id='myMap' style={{
            float: "right",
            width: '920px',
            height: '620px',
            marginRight: "30px"
        }}>
         <Header value={Address()}/>
        </div>
    );
}

export default KakaoMap;
