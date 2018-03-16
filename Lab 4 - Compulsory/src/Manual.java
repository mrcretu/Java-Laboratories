import java.io.IOException;
import java.io.Serializable;

public class Manual extends Document implements Serializable{
    public Manual(){

    }

    Manual(String name, String path) throws IOException{
        this.name = name;
        this.path = parsePath(path);
    }

    @Override
    public String toString() {
        return "Manual{" +
                "name='" + name + '\'' +
                ", path=" + path +
                '}';
    }
}
