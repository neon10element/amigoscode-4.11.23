package neighborhood;

import childhood.Amigo;
public class Homies {
    public static void main(String[] args) {
        Amigo.run(Homies.class, args);
        extracted("Yo Bruh, Wuz Up?");
        extracted("How yah feeling?");
    }

    private static void extracted(String message) {
        System.out.println(message);
    }
}
