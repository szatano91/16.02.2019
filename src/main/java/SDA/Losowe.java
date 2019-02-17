package SDA;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Losowe {

    protected static final Logger log = Logger.getLogger(Losowe.class.getName());

    Random generator = new Random();
    List<Integer> parzyste = new ArrayList();

    public List getParzyste() {
        return parzyste;
    }

    public List getNieparzyste() {
        return nieparzyste;
    }

    List<Integer> nieparzyste = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    public void metoda() {
        System.out.println("Podaj ile liczb");
        int y = scanner.nextInt();
        while (parzyste.size() < y || nieparzyste.size() < y) {
            int pomocnicza = generator.nextInt(100);
            if (pomocnicza % 2 == 0 && parzyste.size() < y) {
                parzyste.add(pomocnicza);
            }
            if (pomocnicza % 2 != 0 && nieparzyste.size() < y) {
                nieparzyste.add(pomocnicza);
            }

        }
        log.info("Info");
        log.warn("Warning");
    }

    public static Integer[] sortowanie(List<Integer> list) {
        Integer[] values = new Integer[list.size()];
        list.toArray(values);
        for (int i = 0; i <= values.length - 1; i++) {
            int min = values[i];
            int minIndex = i;
            for (int j = i; j <= values.length - 1; j++) {
                if (values[j] <= min) {
                    min = values[j];
                    minIndex = j;
                }
            }
            int temp = values[i];
            values[i] = min;
            values[minIndex] = temp;
        }
        return values;
    }

    }

