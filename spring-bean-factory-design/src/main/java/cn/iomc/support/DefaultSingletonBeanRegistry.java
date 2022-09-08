package cn.iomc.support;

import cn.iomc.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例注册表的实现
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    /**
     * 单例注册表的容器
     */
    private final Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 获取beanName注册表中的对象
     *
     * @param beanName
     */
    @Override
    public Object getSingleton(String beanName) {
        return this.singletonObjects.get(beanName);
    }

    /**
     * 向单例注册表的容器存放对象
     *
     * @param beanName
     * @param singletonObject
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        this.singletonObjects.put(beanName, singletonObject);
    }

}
