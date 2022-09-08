package cn.iomc.config;

/**
 * 单例注册表
 */
public interface SingletonBeanRegistry {


    /**
     * 获取beanName注册表中的对象
     *
     * @param beanName
     */
    Object getSingleton(String beanName);

}
