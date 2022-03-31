package com.toy.project.controller.member;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
@RequestMapping("/oauth")
public class KakaoOauthController {


    //http://localhost:8090/oauth/
    // 일단 만들었어
    @GetMapping("/")
    public String KaKao(){
        return "/login/login";
    }

    //KAKAO Oauth 로그인 구현 컨트롤러
    @GetMapping(value = "/kakao/login")
    public String kakaoLogin() {

        StringBuffer url = new StringBuffer();
        url.append("https://kauth.kakao.com/oauth/authorize?");
        url.append("client_id=" + "124440f1a07419d5a978972fe36a6f1e");
        url.append("&redirect_uri= http://localhost:8090/oauth/kakao/login/callback");
        url.append("&response_type=code");

        return "redirect:" + url.toString();
    }

    @RequestMapping(value="/kakao/login/callback",
            produces="application/json",
            method= {RequestMethod.GET, RequestMethod.POST})
    public String kakaoLogin(@RequestParam("code")String code,
                             RedirectAttributes ra,
                             HttpSession session,
                             HttpServletResponse response ) throws IOException {

        System.out.println("kakao code:"+code);

//        JsonNode access_token=kakao_restapi.getKakaoAccessToken(code);
//        // access_token.get("access_token");
//        //   System.out.println("access_token:" + access_token.get("access_token"));
//
//        JsonNode userInfo = KakaoUserInfo.getKakaoUserInfo(access_token.get("access_token"));
//
//        // Get id
//        String member_id = userInfo.get("id").asText();
//
//        String member_name = null;
//
//        // 유저정보 카카오에서 가져오기 Get properties
//        JsonNode properties = userInfo.path("properties");
//        JsonNode kakao_account = userInfo.path("kakao_account");
//        member_name = properties.path("nickname").asText(); //이름 정보 가져오는 것
//        // email = kakao_account.path("email").asText();
//        if(member_name!=null) {
//            session.setAttribute("isLogOn",true);
//            session.setAttribute("member_id",member_name);        //여기 if문 안에 내용은 다 삭제해도 됩니다. 제 프로젝트에만 필요한 코드임.
//        }
//        System.out.println("id : " + member_id);    //여기에서 값이 잘 나오는 것 확인 가능함.
//        System.out.println("name : " + member_name);
//        // System.out.println("email : " + email);

        return "redirect:/hello";
    }
}

