import java.lang.reflect.Proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HelloServiceImpl helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) Proxy.newProxyInstance(HelloService.class.getClassLoader(),
                helloService.getClass().getInterfaces(), new MyInvocationHandler(helloService));
        proxy.hello("rico");
        proxy.hi("panda");

    }
}

