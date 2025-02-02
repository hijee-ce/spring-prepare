package com.sparta.springprepare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 파일이름 : HelloController
 *
 * @프로젝트 : Sggg
 * @버전관리 : 1.0.0
 * @작성일 : 2/2/25
 * @작성자 : JH
 * @클래스설명 :
 */
@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String hello(){
        return "Hello World!";
    }
}
