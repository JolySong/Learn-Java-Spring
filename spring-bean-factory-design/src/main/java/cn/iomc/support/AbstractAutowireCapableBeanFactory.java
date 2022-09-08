package cn.iomc.support;


import cn.iomc.config.BeanDefinition;
import cn.iomc.exception.BeansException;

/**
 *
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {


    /**
     * 向Bean容器存入Bean
     *
     * @param beanName bean名称
     * @param beanDefinition bean定义信息
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}
