package cn.iomc;

import cn.iomc.service.UserService;
import org.junit.Test;

public class BeanTest {



    @Test
    public void testBeanFactory () throws Exception {

        UserService userService = null;
        String beanName = "userService";

        // 初始化bean工厂
        BeanFactory beanFactory = new BeanFactory();

        // 注册bean 放入容器
        beanFactory.registerBeanDefinition(beanName,
                new BeanDefinition(new UserService("song"))
        );

        // 获取该bean
        Object bean = beanFactory.getBean(beanName);

        userService = (UserService) bean;
        System.out.println(userService.getClass().getCanonicalName());

        userService.sailHello();
    }



}
