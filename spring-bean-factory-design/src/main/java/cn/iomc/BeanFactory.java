package cn.iomc;


import cn.iomc.exception.BeansException;

/**
 * bean工厂接口
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
