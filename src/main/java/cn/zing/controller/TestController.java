package cn.zing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dcy
 * @create: 2023-07-10 16:02
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {

        return "Success1";
    }


    @GetMapping("/test2")
    public String test2() {

        return "这是第二次构建";
    }
}


