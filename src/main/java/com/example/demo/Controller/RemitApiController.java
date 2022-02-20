package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemitApiController {

    @RequestMapping(value="/api/kcd/remit", method = RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public String remitApi(){
        // 1. A사업자 계좌 -> KCD 계좌 출금 API 호출

        // 2. KCD 계좌 -> B사업자 계좌 입금 API 호출

        // 3. 입금 API 호출 결과까지 정상인 경우 최종 정상 응답
        return "{\"result\":\"ok\"}";
    }
}
