package Model;

public class SomeCurrentApple extends CurrentApple {
    public SomeCurrentApple() {
    }

    public SomeCurrentApple(int id, String name, String description) {
        super(id, name, description);
    }

    @Override
    public String toString() {
        return "Model.SomeCurrentApple{" +
                "id='" + getId()+ '\'' +
                "name='" + getName() + '\'' +
                "description='" + getDescription() + '\'' +
                "}";
    }
}
