package pack;

public class user {
    String id;
    String parent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                ", parent='" + parent + '\'' +
                '}';
    }
}
