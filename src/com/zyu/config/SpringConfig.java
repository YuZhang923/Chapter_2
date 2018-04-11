package com.zyu.config;

import com.zyu.pojo.CDPlayer;
import com.zyu.pojo.CompactDisc;
import com.zyu.pojo.MediaPlayer;
import com.zyu.pojo.SgtPeppers;
import org.springframework.context.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: z.yu
 * DateTime: 2018-04-11 8:49
 * Description: 通过java配置的方式装载bean
 * 优先使用配置类
 */
@Configuration // 表明这是一个装配类
public class SpringConfig {
    /**
     * 手动添加CD的bean
     * 相当于 <bean id="sgtPeppers" class="com.zyu.pojo.SgtPeppers">
     * 采取配置类创建bean的优势在于在创建bean之前可以做很多事情
     * 注意：方法名和引用变量保持一致！
     */
    @Bean
    public CompactDisc sgtPeppers() {
        //TODO do something
        return new SgtPeppers();
    }

    /**
     * 配置的方式给CD播放器注入CD（一）
     * 缺点：sgtPeppers() 和 cdPlayer()必须在同一个配置类中
     */
    @Bean
    public MediaPlayer mediaPlayer() {
        /**
         * 构造器的方式注入
         * 注意：cd并不是调用sgtPeppers()得到的，而是因为sgtPeppers()上有@Bean注解，spring会拦截所有对它的调用，并返回唯一的
         *      sgtPeppers()创建的对象
         * 结论：多个CDPlayer构造器中调用sgtPeppers()得到的是同一个cd
         */
        return new CDPlayer(sgtPeppers());
    }
    /**
     * 配置的方式给CD播放器注入CD（二） 推荐
     * 优点：不要求sgtPeppers() 和 cdPlayer()必须在同一个配置类中，甚至没有要求CompactDisc必须要在java配置类中声明，也就是说
     * 它可以从xml中配置，注解自动扫描，然后传入到这个参数中就行了。
     */
    @Bean
    public MediaPlayer mediaPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
