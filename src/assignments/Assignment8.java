package assignments;

import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
        int[] experience = {5, 3, 7, 10, 2};
        double[] baseSalaries = {75000, 68000, 82000, 90000, 60000};
        double[] ratings = {4.2, 3.8, 4.5, 2.0, 3.5};

        Map<String, Double> hikePercentageMap = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            double baseSalary = baseSalaries[i];
            double rating = ratings[i];
            int exp = experience[i];
            double variablePay = 0;
            double bonus = 0;
            double reward = 0;

            if (rating >= 4) {
                variablePay = 0.15; // 15% of base salary
                bonus = 1500;
            } else if (rating >= 3 && rating < 4) {
                variablePay = 0.10; // 10% of base salary
                bonus = 1200;
            } else if (rating < 3) {
                variablePay = 0.03; // 3% of base salary
                bonus = 300;
            }

            if (exp >= 5) {
                reward = 5000;
            }
            double hike = (baseSalary * variablePay) + bonus + reward;
            double hikePercentage = (hike / baseSalary) * 100;
            hikePercentageMap.put(names[i], hikePercentage);
        }

        System.out.println("Employee Hike Percentages:");
        for (Map.Entry<String, Double> entry : hikePercentageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.format("%.2f", entry.getValue()) + "%");
        }
    }
}
