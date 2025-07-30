public class Test {

    public static void main(String[] args) {
        Student studentProxy = (Student)CglibProxyFactory.creatCglibProxyObj(Student.class);
        studentProxy.handOut();
    }

}
