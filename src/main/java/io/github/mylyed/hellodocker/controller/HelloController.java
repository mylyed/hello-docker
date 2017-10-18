package io.github.mylyed.hellodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 重庆渝欧跨境电子商务有限公司
 * ========================
 * Author: lilei
 * Date: 2017/10/17
 * Time: 0:04
 * Describe: DESC
 */
@RestController
public class HelloController {
    @GetMapping("/*")
    public Map<String, Object> index() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "hello docker");
        map.put("time", new Date());
        Map<String, String> env = System.getenv();
        map.put("enb", env);
        return map;
    }
}
