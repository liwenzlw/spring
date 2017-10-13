package section4_Dependencies.material;

/**
 * Created by jimboi on 2017/9/24.
 */
public class Wheel {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "description='" + description + '\'' +
                '}';
    }
}
