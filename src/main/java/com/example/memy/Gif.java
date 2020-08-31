package com.example.memy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Gif {
    private String name;
    private boolean favorite;


    public String getFilePath(){
        return "/gifs/"+name+".gif";

    }

    public static List<Gif> GIFS = new ArrayList<>();

    static {
        GIFS.add(new Gif("android-explosion", true));
        GIFS.add(new Gif("ben-and-mike", false));
        GIFS.add(new Gif("book-dominos",true));
        GIFS.add(new Gif("compiler-bot",false));
        GIFS.add(new Gif("cowboy-coder",true));
        GIFS.add(new Gif("infinite-andrew",true));

    }




}
