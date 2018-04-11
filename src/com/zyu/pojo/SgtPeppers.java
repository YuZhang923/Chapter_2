package com.zyu.pojo;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: z.yu
 * DateTime: 2018-04-11 8:39
 * Description: 一个CD的实现类
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "SgtPeppers.标题";
    private String artist = "SgtPeppers.艺术家";

    public void play(){
        System.out.println(artist+"，"+title);
    }
}
