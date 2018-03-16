import java.io.FileNotFoundException;
import java.io.IOException;

public interface AssetManager {

    void add(Document doc);
    void open(String path) throws IOException;
    void save(String path) throws IOException;
    void load(String path) throws IOException, ClassNotFoundException;
    String list();

}
