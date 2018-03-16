import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Book extends Document implements Serializable{


    public Date year;
    public String author;

    public Book(){

    }

    Book(String name, String path, int year, String author) throws IOException {
        String an = new String();
        an = Integer.toString(year);
        /**/
        this.name = name;
        /**/
        this.path = parsePath(path);
        /**/
        this.year = parseDate(an);
        /**/
        this.author = author;
        /**/
    }

    public Date getYear(){
        return this.year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", path=" + path +
                '}';
    }
}
