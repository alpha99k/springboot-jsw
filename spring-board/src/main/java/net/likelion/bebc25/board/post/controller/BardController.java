package net.likelion.bebc25.board.post.controller;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Controller
public class BardController {
    //index.html 요청을 처리하는 컨트롤러
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public String getIndex(){
        String result = """
                <!DOCTYPE html>
                <html lang="ko">
                <head>
                  <meta charset="UTF-8">
                  <title>스프링 부트 게시판 데모 홈</title>
                  <link rel="stylesheet" href="/board/css/common.css">
                  <link rel="stylesheet" href="/board/css/index.css">
                </head>
                <body>
                  <div class="container">
                    <div class="welcome-card">
                      <h1>스프링 부트 게시판 v.02</h1>
                      <p>스프링 부트 게시판에 오신걸 환영합니다.</p>
                      <p> 현재시간은 %s 입니다.</p>
                
                      <div>
                        <a href="board/list.html" class="btn-lg">게시글 목록으로 이동</a>
                      </div>
                    </div>
                  </div>
                </body>
                </html>
                """;
        result = result.formatted(LocalDateTime.now());

        return result;
    }
}
