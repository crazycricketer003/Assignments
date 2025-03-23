package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment7 {
    public static void main(String[] args) {
        List<Integer> transactions = new ArrayList<>();
        transactions.add(50000);
        transactions.add(-2000);
        transactions.add(3000);
        transactions.add(-15000);
        transactions.add(-200);
        transactions.add(-300);
        transactions.add(4000);
        transactions.add(-3000);

        int creditCount = 0, debitCount = 0;
        int totalCredit = 0, totalDebit = 0;
        int suspiciousCount = 0;

        for (int amount : transactions) {
            if (amount > 0) {
                creditCount++;
                totalCredit += amount;
            } else {
                debitCount++;
                totalDebit += Math.abs(amount); 
            }

            if (Math.abs(amount) > 10000) {
                System.out.println("Suspicious transaction detected: Amount = " + amount);
                suspiciousCount++;
            }
        }

        int balance = totalCredit - totalDebit;

        System.out.println("Total number of credit transactions: " + creditCount);
        System.out.println("Total number of debit transactions: " + debitCount);
        System.out.println("Total credited amount: " + totalCredit);
        System.out.println("Total debited amount: " + totalDebit);
        System.out.println("Final balance in the account: " + balance);
        System.out.println("Total number of suspicious transactions: " + suspiciousCount);
    }
}

