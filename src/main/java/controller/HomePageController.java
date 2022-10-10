package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/homepage", method = RequestMethod.GET)
public class HomePageController {
    public String getHomePage (Model model){
        return "homepage.html";
    }
}
