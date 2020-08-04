package cn.qphone.spring.aop.proxy.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  代理工厂
 */
public class ProxyFactory {
    private BeforeAdvice beforeAdvice; // 前置增强
    private AfterAdvice afterAdvice; // 后置增强
    private Object target; // 被代理对象

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public BeforeAdvice getBeforeAdvice() {
        return beforeAdvice;
    }

    public void setBeforeAdvice(BeforeAdvice beforeAdvice) {
        this.beforeAdvice = beforeAdvice;
    }

    public AfterAdvice getAfterAdvice() {
        return afterAdvice;
    }

    public void setAfterAdvice(AfterAdvice afterAdvice) {
        this.afterAdvice = afterAdvice;
    }

    public Object createProxy() {
        if (target == null) return target;
        Object proxy = Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), target.getClass().getInterfaces(), new MyInvocationHandler());
        return proxy;
    }

    class MyInvocationHandler implements InvocationHandler {
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (beforeAdvice != null) beforeAdvice.before();
            if (method.getName().equals("speak")) method.invoke(target, args);
            if (afterAdvice != null) afterAdvice.after();
            return proxy;
        }
    }
}
