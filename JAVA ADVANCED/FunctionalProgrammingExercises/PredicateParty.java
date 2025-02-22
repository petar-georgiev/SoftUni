package FunctionalProgrammingExercises;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> names = new ArrayList<>(Arrays.asList(scanner.nextLine()
                .split(" ")));

        BiPredicate<String, String> startWith = String::startsWith;
        BiPredicate<String, String> endWith = String::endsWith;
        BiPredicate<String, String> length = (e, l) -> e.length() == Integer.parseInt(l);

        String input;

        while (!"Party!".equals(input = scanner.nextLine())) {

            String[] com = input.split("\\s+");

            if (com[0].equals("Remove")) {
                switch (com[1]) {
                    case "StartsWith":
                        names = names.stream().filter(e -> !startWith.test(e, com[2])).collect(Collectors.toList());
                        break;
                    case "EndsWith":
                        names = names.stream().filter(e -> !endWith.test(e, com[2])).collect(Collectors.toList());
                        break;
                    case "Length":
                        names = names.stream().filter(e -> !length.test(e, com[2])).collect(Collectors.toList());
                        break;
                }
            } else {
                switch (com[1]) {
                    case "StartsWith":
                        doubleByCriteria(startWith, names, com[2]);
                        break;
                    case "EndsWith":
                        doubleByCriteria(endWith, names, com[2]);
                        break;
                    case "Length":
                        doubleByCriteria(length, names, com[2]);
                        break;
                }
            }
        }

        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(names);
            System.out.println(names.toString().replaceAll("[\\[\\]]", "") + " are going to the party!");
        }

    }

    private static void doubleByCriteria(BiPredicate<String, String> biPredicate, List<String> names, String com) {
        for (int i = 0; i < names.size(); i++) {
            if (biPredicate.test(names.get(i), com)) {
                names.add(i, names.get(i));
                ++i;
            }
        }
    }
}

