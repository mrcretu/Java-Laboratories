import java.util.Arrays;

public class Project extends Teacher{

    protected String name;
    protected int capacity;

    /* constructor implicit */
    Project(){
        this.name = "\0";
        this.capacity = 0;
    }

    Project(String name, int capacity){
        setName(name);
        setCapacity(capacity);
    }
    /* setters methods */

    public void setName(String name) {
        this.name = name;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                "}";
    }
}
