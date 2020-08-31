package com.example.memy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Gif {
    private String name;

    public String getFilePath(){
        return "/gifs/"+name+".gif";

    }

    public static List<Gif> GIFS = new ArrayList<>();

    static {
        GIFS.add(new Gif("android-explosion"));
        GIFS.add(new Gif("ben-and-mike"));
        GIFS.add(new Gif("book-dominos"));
        GIFS.add(new Gif("compiler-bot"));
        GIFS.add(new Gif("cowboy-coder"));
        GIFS.add(new Gif("infinite-andrew"));

    }




}
