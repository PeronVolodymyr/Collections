package Model;

public class CurrentApple extends Apple {
    private String description;

    public CurrentApple() { }

    public CurrentApple(int id, String name, String description) {
        super(id, name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Model.CurrentApple{" +
                "id='" + getId()+ '\'' +
                "name='" + getName() + '\'' +
                "description='" + description + '\'' +
                '}';
    }
}
