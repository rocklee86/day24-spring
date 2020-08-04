package cn.qphone.spring.simulation.factory;

import java.util.Properties;

public class BeanFactory {

    private static Properties properties = new Properties();
    private static final String PROPERTIES_FILE_PATH = "user.properties";

    static {
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE_PATH));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param key
     * @return 根据class参数决定当前的具体的返回值类型
     */
    public static <T> T getBean(String key) {
        T t = null;
        Class<T> clazz = null;
        try {
            clazz = (Class<T>) Class.forName(properties.getProperty(key));
            t = clazz.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
