import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        final char[] array = {'B', 'A', 'B', 'C', 'A', 'C', 'D', 'B', 'A', 'B', 'C', 'A', 'C', 'D','B', 'A', 'B', 'C', 'A', 'C'};
        int count;

        char candidate = array[0];
        int freq = 0;

        for (int i = 0; i < array.length; i++) {
            count= 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > freq) {
                candidate = array[i];
                freq = count;
            }
        }

        System.out.println("Mode: " + candidate);
        System.out.println("Frequency:" + freq);

    }
}

