/* global kakao */
import React, { useEffect } from "react";

const { kakao } = window;

const KakaoMap = () => {

    useEffect(() => {
        const container = document.getElementById('myMap'); //div에 myMap 가져오기 
		const options = {
			center: new kakao.maps.LatLng(33.450701, 126.570667), //시작할때 경도/위도
			level: 3 //확대 레벨
		};
        const map = new kakao.maps.Map(container, options);
    }, []);

    return (
        <div id='myMap' style={{
            float:"right",
            width: '920px', 
            height: '620px',
            marginRight:"30px"
        }}></div>
    );


}


export default KakaoMap;