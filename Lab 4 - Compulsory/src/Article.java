import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class Article extends Document implements Serializable{
    public Date year;
    public String author1;
    public String author2;
    public String author3;

    public Article(){

    }

    public Article(String name, String path, int year, String author1, String author2, String author3) throws IOException {
        String an = new String();
        an = Integer.toString(year);
        /**/
        this.name = name;
        /**/
        this.path = parsePath(path);
        /**/
        this.year = parseDate(an);
        /**/
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        /**/
    }

    @Override
    public String toString() {
        return "Article{" +
                "year=" + year +
                ", author1='" + author1 + '\'' +
                ", author2='" + author2 + '\'' +
                ", author3='" + author3 + '\'' +
                ", name='" + name + '\'' +
                ", path=" + path +
                '}';
    }
}
