package cn.qphone.spring.aop.proxy.factory;

public class TestDemo {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new Star());
//        factory.setBeforeAdvice(new BeforeAdviceImpl());
//        factory.setAfterAdvice(new AfterAdviceImpl());
        Person proxy = (Person) factory.createProxy();
        proxy.speak();
        proxy.sleep();
    }
}

interface Person {
    public void speak();
    public void sleep();
}

class Star implements Person {
    public void speak() {
        System.out.println("i am a girl");
    }

    public void sleep() {
        System.out.println("sleep with xxx");
    }
}

class BeforeAdviceImpl implements BeforeAdvice {

    public void before() {
        System.out.println("before");
    }
}

class AfterAdviceImpl implements AfterAdvice {

    public void after() {
        System.out.println("after");
    }
}
