package com.example.memy;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(ModelMap map){

        map.put("gifs",Gif.GIFS);
        return "home";
    }
    @GetMapping("/gif/{name}")
    public String getGif(@PathVariable String name, ModelMap map){

        Gif gif = Gif.GIFS.stream().filter(g->g.getName().equals(name)).findFirst().get();
        map.put("gif",gif);

        return "gif-details";
    }


}
