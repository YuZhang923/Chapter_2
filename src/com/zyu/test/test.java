package com.zyu.test;

import com.zyu.config.SpringConfig;
import com.zyu.config.SystemConfig;
import com.zyu.pojo.BlankDisc;
import com.zyu.pojo.CompactDisc;
import com.zyu.pojo.MediaPlayer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: z.yu
 * DateTime: 2018-04-11 8:54
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class) //测试开始自动创建Spring上下文
@ContextConfiguration(classes = SystemConfig.class) // 告诉测试类在SpringConfig配置类中加载配置
public class test {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void test1(){
        Assert.assertNotNull(compactDisc);
//        System.out.println(compactDisc);
        mediaPlayer.play();
    }
}
