package se.recap2;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Ordraknaren ord = new Ordraknaren();
        ord.run();
    }
}
