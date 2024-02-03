package factorymethod;

public class CreatorB extends Creator {
    @Override
    public Product create() {
        return new ProductB();
    }
}
