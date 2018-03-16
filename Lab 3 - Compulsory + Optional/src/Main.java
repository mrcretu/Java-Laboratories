public class Main {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Not enough arguments!");
            System.exit(-1);
        }
        int maxValue = Integer.parseInt(args[0]);

        System.out.println("maximum value of the portofolio: " + maxValue + "\navailable items: \n");

        Building h1 = new Building("House 1", 27, 9);
        Building h2 = new Building("House 2", 27, 9);
        Building h3 = new Building("House 3", 64, 16);

        /* S-au instantiat 3 obiecte de tip Building */
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());

        Vehicle c1 = new Vehicle("Car 1", 8, 4);
        Vehicle c2 = new Vehicle("Car 2", 8, 4);

        /* S-au instantiat 2 obiecte de tip Vehicle */
        System.out.println("\n" + c1.toString());
        System.out.println(c2.toString());

        Jewel ring = new Jewel("Gold Diamond Ring",2);

        /* S-a instantiat 1 obiect de tip Jewel */
        System.out.println("\n" + ring.toString());

        AssetManager manager = new AssetManager();

        manager.add(h1, h2, h3);
        manager.add(c1, c2);
        manager.add(ring);

        //System.out.println("Items sorted by name: \n" + manager.getItems());
        System.out.println("Assets sorted by profit: " + manager.getAssets());

        Portofolio solution = manager.createPortofolio(new RandomAlgorithm(), maxValue);
        System.out.println("The best portofolio: " + solution);


    }
}
