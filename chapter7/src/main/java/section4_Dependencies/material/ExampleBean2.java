package section4_Dependencies.material;

public class ExampleBean2 {

    private AnotherBean beanOne;
    private YetAnotherBean beanTwo;
    private int i;

    public ExampleBean2(
            AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        this.beanOne = anotherBean;
        this.beanTwo = yetAnotherBean;
        this.i = i;
    }

    public static ExampleBean2 createInstance(
            AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        ExampleBean2 eb = new ExampleBean2(anotherBean, yetAnotherBean, i);
        // some other operations...
        return eb;
    }

}