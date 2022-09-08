package cn.iomc;

public class BeanDefinition {

    /**
     * Bean实例
     */
    private Object bean;


    /**
     * 存放bean
     *
     * @return 该bean
     */
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }


    /**
     * 获取存放的bean
     *
     * @return 该bean
     */
    public Object getBean() {
        return bean;
    }
}
