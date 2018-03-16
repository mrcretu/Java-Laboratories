import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Catalog implements AssetManager{
    int poz = 0;
    private ArrayList<Document> array_doc = new ArrayList<>(3); //instantiate an array of documents , given capacity : 3

    private ArrayList<Document> array_load = new ArrayList<>(3);

    @Override
    public void add(Document doc) {
        array_doc.add(doc);
    }

    @Override
    public void open(String path) throws FileNotFoundException, IOException {
        File file = new File(path);
        try {
            openFile(file);
        } catch (FileNotFoundException e) {
            System.err.println("Fisierul n-a fost gasit");
        } catch (IOException e) {
            System.out.println("Eroare la citire");
        } catch (Exception e){
            System.out.println("Ceva nu e in regula... Oare ce?");
        }

    }

    public static void openFile(File file) throws FileNotFoundException, IOException{
        FileReader f = new FileReader(file);
        int c;
        while ( (c=f.read()) != -1){}
            //System.out.print((char)c);

        if(f!=null) System.out.println("Fisier deschis cu succes!");
        f.close();
    }

    @Override
    public void save(String path) throws FileNotFoundException,IOException {
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream o = new ObjectOutputStream(file);
            for(Document document : array_doc){
                o.writeObject(document);
            }
            o.writeObject(null);

            file.close();
            o.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println("Done saving documents!");
    }

    @Override
    public void load(String path) throws IOException, ClassNotFoundException {
        int i = 1;
        try {
            FileInputStream fi = new FileInputStream(path);
            ObjectInputStream oi = new ObjectInputStream(fi);
            Document doc = new Document();
            doc = (Document) oi.readObject();
            array_load.add(doc);
            while(doc != null) {
                doc = (Document) oi.readObject();
                array_load.add(doc); i++;
            }

            fi.close();
            oi.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;

        }
        System.out.println("Done loading documents!");
    }

    @Override
    public String list() {
        String string = new String();
        string += "Content of the catalog: \n";
        for(int i = 0; i < array_load.size(); i++){
            string += (i+1) + ": ";
            string += array_load.get(i).getClass();
        }
        return string;
    }

   /* @Override
    public String toString() {
        String string = new String();
        string += "Content of the catalog: \n";
        for(int i = 0; i < array_doc.length; i++){
            string += (i+1) + ": ";
            string += array_doc[i].name + " with location:\n\t" + array_doc[i].path + "\n";
        }
        return string;
    }*/

    @Override
    public String toString() {
        return "Catalog{" +
                " array_doc=" + array_doc + "\n" +
                " array_load=" + array_load +
                '}';
    }
}
