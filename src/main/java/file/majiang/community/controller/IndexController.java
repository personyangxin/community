package file.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//Homepage URL http://community.yx.life
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
