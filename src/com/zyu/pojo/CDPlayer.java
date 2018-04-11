package com.zyu.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: z.yu
 * DateTime: 2018-04-11 9:17
 * Description:
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc; //通过构造器注入cd
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
