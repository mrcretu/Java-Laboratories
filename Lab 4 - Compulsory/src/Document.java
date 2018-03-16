import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Document{
    public String name;
    public Path path;

    Document(){
        name = "";
    }

    public static Date parseDate(String date) {
        try{
            return new SimpleDateFormat("yyyy").parse(date);
        } catch (Exception e){
            System.out.println("Formatul anului este gresit!");
            return null;
        }

    }

    public static Path parsePath(String path) throws FileNotFoundException, IOException {
        FileReader f = null;
        try {
            f = new FileReader(path); // open the file
            int c;                    // read the file
            while ( (c=f.read()) != -1) {
                System.out.print((char)c);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Fisierul " + path + " nu a fost gasit!");
        } catch (IOException e) {
            System.out.println("Eroare la citire");
            e.printStackTrace();
        } finally {
            if (f != null) {
                try {

                    f.close();


                } catch (IOException e) {
                    System.err.println("Fisierul nu poate fi inchis!");
                }
            }
        }
        Path p1 = Paths.get(path);
        if(p1 != null ) return p1;
        else return null;

    }

}
