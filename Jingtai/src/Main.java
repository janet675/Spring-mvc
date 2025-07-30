public class Main {
    public static void main(String[] args){
        HelloService helloService = new HelloServiceImpl();
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy(helloService);
        helloServiceProxy.hello("Panda");
        helloServiceProxy.hi("Panda");
    }
}