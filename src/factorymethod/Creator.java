package factorymethod;

public abstract class Creator {

    public abstract Product create();

    public void someOperation() {
        Product product = create();
        product.doSomething();
    }
}
