package cn.iomc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Bean工厂
 *
 */
public class BeanFactory {

    /**
     * Bean存放容器
     */
    private Map<String, BeanDefinition> beanDefinitionMap =
            new ConcurrentHashMap<>();


    /**
     * 向Bean容器存入Bean
     *
     * @param name
     * @return 该bean名称的实例
     */
    public Object getBean(String name) throws Exception {
        if (null == name || "".equals(name)) {
            throw new Exception("bean name must not null!");
        }

        // bean实例
        BeanDefinition beanInstance = this.beanDefinitionMap.get(name);

        if (null == beanInstance) {
            throw new Exception(name + "bean is not defined!");
        }

        return beanInstance.getBean();
    }

    /**
     * 向Bean容器存入Bean
     *
     * @param name bean名称
     * @param beanDefinition bean定义信息
     */
    public void registerBeanDefinition(String name,
                                       BeanDefinition beanDefinition)
            throws Exception {

        if (null == name || "".equals(name)) {
            throw new Exception("bean name must not null!");
        }

        if (null == beanDefinition) {
            throw new Exception("bean can't be null!");
        }

        this.beanDefinitionMap.put(name, beanDefinition);
    }
}
