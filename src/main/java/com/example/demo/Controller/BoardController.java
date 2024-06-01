package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//전통적인 Controller로 View를 반환하기 위해 사용한다고 한다.
@RequestMapping("/board/")
public class BoardController {
    @GetMapping("/hello")
    public String Hello() {
        return "/boards/hello";
    }
}
