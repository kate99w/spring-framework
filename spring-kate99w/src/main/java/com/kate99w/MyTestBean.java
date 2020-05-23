package com.kate99w;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyTestBean implements InitializingBean, ApplicationContextAware {

    /**
     * 构造函数
     */
    public MyTestBean(){
        System.out.println("****** MyTestBean - Constructor ********");
    }


    /**
     * InitializingBean 接口实现
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println("********* MyTestBean - afterPropertiesSet *******");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("********* MyTestBean - setApplicationContext ********");
    }
}
