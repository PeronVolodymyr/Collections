package Model;

public class Orange {
    private int id;
    private String name;

    public Orange() {
    }

    public Orange(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Model.Orange{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
