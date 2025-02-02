package com.sparta.springprepare;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
//final이 달린 필드를 가지는 생성자를 만들어줌 (필수 요소만 포함한 생성자를 만듦)
public class Memo {
    private String username;
    private String contents;


}