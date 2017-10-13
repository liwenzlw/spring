package section4_Dependencies.material;

/**
 * Created by jimboi on 2017/9/24.
 */
public class Car {
    private Engine engin;

    public void init() {
        System.out.println("初始化Car");
    }
    public void destructe() {
        System.out.println("销毁Car");
    }

    public Engine getEngin() {
        return engin;
    }

    public void setEngin(Engine engin) {
        this.engin = engin;
    }
}
