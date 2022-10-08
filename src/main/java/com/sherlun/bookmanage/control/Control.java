package com.sherlun.bookmanage.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class Control {

    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }
}
