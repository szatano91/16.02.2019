package SDA;

import java.util.Arrays;

public class Sortowanie {

    public void sortowanie(int[] tablica) {
        int pomocznicza = tablica[0];

        for (int key: tablica) {
            if (key <pomocznicza){
                pomocznicza = key;

            }

        }
    }
}