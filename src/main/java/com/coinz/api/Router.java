package com.coinz.api;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class Router {
    @RequestMapping("/")
    public String index(Model model) {
        ConsumeAPI api = new ConsumeAPI();
       // Map<String,String> data = api.getArray();
        List<ObjectTest[]> data = api.getArray();
        model.addAttribute("first", data);

        System.out.println(data.toString());


        return "index";
    }
}
