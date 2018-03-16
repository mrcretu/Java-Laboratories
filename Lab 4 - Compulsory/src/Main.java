import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Catalog catalog = new Catalog(); //instantiate a new catalog type object

        catalog.add (new Book("The Art of Computer Programming", "/home/marius/JavaProjects/Lab 4/Books/tacp.ps", 1967, "Donald E. Knuth"));
        //add a first Book class object

        catalog.add (new Article("Mastering the Game of Go without Human Knowledge", "/home/marius/JavaProjects/Lab 4/Aricles/AlphaGo.pdf", 2017, "David Silver", "Julian Schrittwieser", "Karen Simonyan"));
        //add a second Article class object

        catalog.add (new Manual("Cookbook", "/home/marius/JavaProjects/Lab 4/Stuff/cookbook.doc"));
        //add a third Manual class object

        //catalog.open("/home/marius/JavaProjects/Lab 4/Catalog/catalog.bin");
        //try to open the catalog in the location described by the path

        catalog.save("/home/marius/JavaProjects/Lab 4/Catalog/catalog.txt");
        //...
        catalog.load("/home/marius/JavaProjects/Lab 4/Catalog/catalog.txt");
        //System.out.println(catalog.list());
        System.out.println(catalog.toString());

        //verify a valid syntax for the path with regular expressions TODO
        //add a new Manual object type TODO
        //implement save method TODO
        //implement load method TODO
        //implement list methid TODO

    }
}
