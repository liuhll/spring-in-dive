package com.liuhll.springbootindive;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {
        // 创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // 注册应用事件监听器

        context.addApplicationListener(evt ->{
            System.out.println("监听到事件:" + evt.getClass().getName() + ",source=>" + evt.getSource());
        });
        // 启动上下文
        context.refresh();

        context.publishEvent("发布一个事件");

        context.publishEvent(new ApplicationEvent("自定义事件") {
            @Override
            public Object getSource() {
                return "source=" + source;
            }
        });
        // 关闭上下文
        context.close();
    }
}
