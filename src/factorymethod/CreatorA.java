package factorymethod;

public class CreatorA extends Creator {
    @Override
    public Product create() {
        return new ProductA();
    }
}
