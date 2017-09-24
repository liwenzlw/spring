package section4_Dependencies.material;

public class ExampleBean3 {

    private AnotherBean beanOne;
    private YetAnotherBean beanTwo;
    private int i;

    public ExampleBean3() {
    }

    public ExampleBean3(
            AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
    }

    public ExampleBean3 createInstance(
            AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        ExampleBean3 eb = new ExampleBean3(anotherBean, yetAnotherBean, i);
        // some other operations...
        return eb;
    }

}