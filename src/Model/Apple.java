package Model;

public class Apple implements Comparable<Apple> {
    private Integer id;
    private String name;

    public Apple() { }

    public Apple(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Model.Apple{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apple apple = (Apple) o;

        if (id != apple.id) return false;
        return name != null ? name.equals(apple.name) : apple.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Apple o) {
       int compare = this.id.compareTo(o.getId());
       if(compare == 0)
       compare = this.name.compareTo(o.getName());

       return compare;
    }
}
