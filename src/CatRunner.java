public class CatRunner {
    public static void main(String[] args) {

        // creating one instance/object from the Cat class "blueprint"
        Cat cat1 = new Cat("Luna", 6, 8.2);
        cat1.introduce();
        cat1.printCatInfo();

        // creating one instance/object from the Cat class "blueprint"
        Cat cat2 = new Cat("Elio", 7, 9.5);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
