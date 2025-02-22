package DefiningClassesLab.P03_BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, BankAccount> vault = new HashMap<>();
        String input = scan.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");

            BankAccount bankAccount;
            String output = null;
            switch (tokens[0]) {
                case "Create":
                    bankAccount = new BankAccount();
                    vault.put(bankAccount.getId(), bankAccount);
                    output = "Account ID" + bankAccount.getId() + " created";
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if (vault.containsKey(id)) {
                        vault.get(id).deposit(amount);
                        output = "Deposited " + amount + " to ID" + id;
                    } else {
                        output = "Account does not exist";
                    }
                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(newInterest);
                    output = null;
                    break;
                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (vault.containsKey(id)) {
                        double interest = vault.get(id).getInterest(years);
                        output = String.format("%.2f", interest);
                    } else {
                        output = "Account does not exist";
                    }
                    break;
            }
            if (output != null) {
                System.out.println(output);
            }
            input = scan.nextLine();
        }
    }
}
