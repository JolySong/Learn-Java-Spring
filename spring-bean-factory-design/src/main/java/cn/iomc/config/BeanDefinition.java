package cn.iomc.config;

/**
 * bean定义信息
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    private Class beanClass;


    /**
     * 设置bean定义信息
     *
     * @param beanClass bean的class信息
     */
    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }





    public Class getBeanClass() {
        return this.beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
