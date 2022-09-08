package cn.iomc.support;

import cn.iomc.config.BeanDefinition;

/**
 * bean注册接口
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName bean的名称
     * @param beanDefinition bean的定义信息
     */
    void registerBeanDefinition(String beanName,
                                BeanDefinition beanDefinition);

}
