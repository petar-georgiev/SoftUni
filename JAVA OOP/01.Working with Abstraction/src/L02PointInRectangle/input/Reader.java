package L02PointInRectangle.input;

import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] readIntArray(String delimiter) {
        return Arrays.stream(scanner.nextLine().split(delimiter))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
