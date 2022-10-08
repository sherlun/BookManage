package com.sherlun.bookmanage.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author long
 */
@RequestMapping("")
@Controller
public class PageController {

    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }
}
