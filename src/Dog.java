public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("mutt", "big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "perky", "curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : weight < 35 ? "medium" : "large", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

        if (type == "Wolf") {
            System.out.println("Ow Wooo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
//        System.out.println("Dogs walk, run and wag their tail.");
    }

    private void bark() {
        System.out.print("Woof! ");
    }

    private void run() {
        System.out.print("Dog running.. ");
    }

    private void walk() {
        System.out.print("Dog walking.. ");
    }

    private void wagTail() {
        System.out.print("Dog wagging tail.. ");
    }
}
