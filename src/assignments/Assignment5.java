package assignments;

import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
        // 1. Create a list of the top 5 most populated countries in the world and print 2nd Country
        List<String> populatedCountries = Arrays.asList("India", "China", "United States", "Indonesia", "Pakistan");
        System.out.println("2nd Most Populated Country: " + populatedCountries.get(1));

        // 2. Create a set of the top 10 most visited tourist attractions in the world and print out its size
        Set<String> touristAttractions = new HashSet<>(Arrays.asList(
            "Eiffel Tower", "Great Wall of China", "Louvre Museum", "Statue of Liberty", "Colosseum",
            "Machu Picchu", "Taj Mahal", "Disneyland", "Times Square", "Grand Canyon"
        ));
        System.out.println("Size of Tourist Attractions Set: " + touristAttractions.size());

        // 3. Create a map of the 5 largest cities in the United States and their populations
        Map<String, Integer> largestCities = new HashMap<>();
        largestCities.put("New York City", 2000);
        largestCities.put("Los Angeles", 3794);
        largestCities.put("Chicago", 2638);
        largestCities.put("Houston", 23191);
        largestCities.put("Phoenix", 1662);
        System.out.println("Largest Cities in the United States and their populations: " + largestCities);

        // 4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value
        int[] randomIntegers = new Random().ints(10, 1, 100).toArray();
        System.out.println("Array of Random Integers: " + Arrays.toString(randomIntegers));
        int sum = randomIntegers[2] + randomIntegers[4];
        System.out.println("Sum of 3rd and 5th Value: " + sum);

        // 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list
        List<String> highestGrossingMovies = Arrays.asList("Dragon", "GOAT", "Vikram", "Sanam teri kaasam", "Hasee Toh pasee");
        System.out.println("3rd Highest-Grossing Movie: " + highestGrossingMovies.get(2));
    }
}
