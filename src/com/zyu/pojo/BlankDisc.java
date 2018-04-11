package com.zyu.pojo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: z.yu
 * DateTime: 2018-04-11 10:53
 * Description:
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    //通过构造器注入字面量
    public BlankDisc(String title, String artist,List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public BlankDisc() {
    }

    @Override
    public void play() {
        System.out.println(artist + "，" + title);
        if (tracks != null) {
            for (String s : tracks ) {
                System.out.println(s);
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
