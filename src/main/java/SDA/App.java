package SDA;


import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {


        Losowe nowa = new Losowe();

        nowa.metoda();
        nowa.getParzyste();
        System.out.println("Nieparzyste " + nowa.nieparzyste);
        System.out.println("Nieparzyste " + Arrays.toString(nowa.sortowanie(nowa.nieparzyste)));

        System.out.println("Parzyste " + nowa.parzyste);
        System.out.println("Parzyste " + Arrays.toString(nowa.sortowanie(nowa.parzyste)));


    }
}
