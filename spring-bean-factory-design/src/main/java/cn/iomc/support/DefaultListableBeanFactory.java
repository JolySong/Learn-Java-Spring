package cn.iomc.support;


import cn.iomc.config.BeanDefinition;
import cn.iomc.exception.BeansException;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class DefaultListableBeanFactory
        extends AbstractAutowireCapableBeanFactory
        implements BeanDefinitionRegistry {

    /**
     * bean定义信息容器
     */
    private final Map<String, BeanDefinition> beanDefinitionMap =
            new HashMap<>();


    /**
     * 注册bean
     * 向bean容器存放bean信息
     *
     * @param beanName bean名称
     * @param beanDefinition bean定义class信息
     */
    @Override
    public void registerBeanDefinition(String beanName,
                                       BeanDefinition beanDefinition) {
        this.beanDefinitionMap.put(beanName, beanDefinition);
    }

    /**
     * 获取bean
     * 向bean容器获取名称为beanName的定义信息
     *
     * @param beanName bean名称
     */
    @Override
    public BeanDefinition getBeanDefinition(String beanName)
            throws BeansException {
        BeanDefinition beanDefinition = this.beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

}
