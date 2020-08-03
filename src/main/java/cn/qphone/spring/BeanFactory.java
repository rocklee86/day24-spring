package cn.qphone.spring;

public class BeanFactory {
    public Chinese createChinese() {
        return new Chinese();
    }

    public static Chinese createChina() {
        return new Chinese();
    }

    public American createAmerican() {
        return new American();
    }
}
