package E05Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(String::valueOf).collect(Collectors.toList());
        List<String> urls = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(String::valueOf).collect(Collectors.toList());

            Smartphone sm = new Smartphone(numbers, urls);
            System.out.println(sm.call());
            System.out.println(sm.browse());

    }
}
