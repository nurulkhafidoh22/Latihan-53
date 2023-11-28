package pkg22166012.pbo.lat53;

/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program Latihan 53
 */

public class PBOLat53 {
    class Animal {
        private boolean vegetarian;
        private String eats;
        private int noOfLegs;

        public Animal(boolean vegetarian, String food, int legs) {
            this.vegetarian = vegetarian;
            this.eats = food;
            this.noOfLegs = legs;
        }

        public boolean isVegetarian() {
            return vegetarian;
        }

        public String getEats() {
            return eats;
        }

        public int getNoOfLegs() {
            return noOfLegs;
        }
    }

    class Rabbit extends Animal {
        private String color;
        private String name;

        public Rabbit(String name, boolean vegetarian, String food, int legs, String color) {
            super(vegetarian, food, legs);
            this.name = name;
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        // Membuat objek PBOLat53 untuk mengakses non-statis inner class
        PBOLat53 program = new PBOLat53();

        // Membuat objek Rabbit dengan nama "Peter"
        Rabbit peter = program.new Rabbit("Peter", false, "grass", 4, "grey");

        // Menampilkan hasil run sesuai permintaan
        System.out.println("Hello, His name is " + peter.getName());
        System.out.println(peter.getName() + " is vegetarian? " + peter.isVegetarian());
        System.out.println(peter.getName() + " eats " + peter.getEats());
        System.out.println(peter.getName() + " has " + peter.getNoOfLegs() + " legs");
        System.out.println(peter.getName() + " color is " + peter.getColor());
    }
}
