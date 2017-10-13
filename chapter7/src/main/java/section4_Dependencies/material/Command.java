package section4_Dependencies.material;

/**
 * Created by jimboi on 2017/9/26.
 */
public class Command {

    private String state;

    public Object execute() {
        System.out.println("execute");
        return null;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
