package version1;

public interface HelloService {
    void sayHelloWorld();
}

class HelloServiceImpl implements HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }
}