package section6_Customizing_the_nature_of_a_bean.material;


public class ExampleBean {
    private String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
        System.out.println("set ExampleBean prop");
    }

    public void init() {
        // do some initialization work
        System.out.println("ExampleBean init");
    }

}