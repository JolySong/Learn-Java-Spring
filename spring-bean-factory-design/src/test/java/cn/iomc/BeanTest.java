package cn.iomc;

import cn.iomc.config.BeanDefinition;
import cn.iomc.support.DefaultListableBeanFactory;
import org.junit.Test;

public class BeanTest {


    @Test
    public void testBeanFactory () throws Exception {

        String beanName = "userService";

        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition(beanName, beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean(beanName);
        userService.sailHello();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton(beanName);
        userService_singleton.sailHello();

        // true
        System.out.println(userService == userService_singleton);
    }



}
