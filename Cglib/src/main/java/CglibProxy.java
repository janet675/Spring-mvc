import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    /**
     * @param o: 代理对象
     * @param method: 被代理方法
     * @param params: 方法入参
     * @param methodProxy: CGLIB方法
     **/
    @Override
    public Object intercept(Object o, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {
        System.out.println("【增强方法】代理对象正在执行的方法：" + method.getName());
        Object result = methodProxy.invokeSuper(o, params);
        return result;
    }
}
