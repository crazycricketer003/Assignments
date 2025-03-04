package assignments;
import java.util.Scanner;
public class Assignment1_DataTypes {

	public static void main(String[] args) {
		
		        // 1. Temperature of a city in degrees Celsius
		        float temperature = 25.5f;
		        System.out.println("Temperature: " + temperature + " °C");

		        // 2. Whether a customer has placed an order
		        boolean hasPlacedOrder = true;
		        System.out.println("Has placed order: " + hasPlacedOrder);

		        // 3. Person's phone number
		        String phoneNumber = "123-456-7890";
		        System.out.println("Phone number: " + phoneNumber);

		        // 4. Amount of money in a customer's bank account
		        double bankBalance = 1000.50;
		        System.out.println("Bank balance: $" + bankBalance);

		        // 5. Person's email address
		        String emailAddress = "john.doe@example.com";
		        System.out.println("Email address: " + emailAddress);

		        // 6. Coordinates of a location (latitude, longitude)
		        float latitude = 37.7749f;
		        float longitude = -122.4194f;
		        System.out.println("Coordinates: (" + latitude + ", " + longitude + ")");

		        // 7. Person's marital status
		        boolean isMarried = true;
		        System.out.println("Marital status: " + isMarried);

		        // 8. Person's occupation
		        String occupation = "Software Engineer";
		        System.out.println("Occupation: " + occupation);

		        // 9. Person's favorite color
		        String favoriteColor = "Blue";
		        System.out.println("Favorite color: " + favoriteColor);

		        // 10. Current year
		        int currentYear = 2023;
		        System.out.println("Current year: " + currentYear);

		        // 11. Number of followers on a social media platform
		        int followers = 1000000;
		        System.out.println("Followers: " + followers);

		        // 12. Rating of a movie
		        float movieRating = 7.5f;
		        System.out.println("Movie rating: " + movieRating);

		        // 13. Person's blood type
		        char bloodType = 'A';
		        System.out.println("Blood type: " + bloodType);

		        // 14. Title of a book
		        String bookTitle = "To Kill a Mockingbird";
		        System.out.println("Book title: " + bookTitle);

		        // 15. Number of employees in a company
		        int employees = 500;
		        System.out.println("Employees: " + employees);

		        // 16. Time of an event
		        String eventTime = "2:30 PM";
		        System.out.println("Event time: " + eventTime);

		        // 17. Name of a country
		        String country = "United States";
		        System.out.println("Country: " + country);

		        // 18. Person's eye color
		        String eyeColor = "Brown";
		        System.out.println("Eye color: " + eyeColor);

		        // 19. Person's birthplace
		        String birthplace = "New York City";
		        System.out.println("Birthplace: " + birthplace);

		        // 20. Distance between two cities
		        double distance = 200.5;
		        System.out.println("Distance: " + distance + " km");
		        
		        
		        
		        //To get input and print 
		        
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the temperature of the city (Celsius): ");
		        float temperature1 = scanner.nextFloat();
		        System.out.println("Temperature: " + temperature1 + " °C");

		        System.out.print("Has the customer placed an order (true/false)? ");
		        boolean hasPlacedOrder1 = scanner.nextBoolean();
		        System.out.println("Has placed order: " + hasPlacedOrder1);

		        scanner.nextLine(); 
		        System.out.print("Enter the person's phone number: ");
		        String phoneNumber1 = scanner.nextLine();
		        System.out.println("Phone number: " + phoneNumber1);

		        System.out.print("Enter the amount of money in the customer's bank account: ");
		        double bankBalance1 = scanner.nextDouble();
		        System.out.println("Bank balance: $" + bankBalance1);

		        scanner.nextLine(); 
		        System.out.print("Enter the person's email address: ");
		        String emailAddress1 = scanner.nextLine();
		        System.out.println("Email address: " + emailAddress1);

		        System.out.print("Enter the latitude: ");
		        float latitude1 = scanner.nextFloat();
		        System.out.print("Enter the longitude: ");
		        float longitude1 = scanner.nextFloat();
		        System.out.println("Coordinates: (" + latitude1 + ", " + longitude1 + ")");

		        System.out.print("Is the person married (true/false)? ");
		        boolean isMarried1 = scanner.nextBoolean();
		        System.out.println("Marital status: " + isMarried1);

		        scanner.nextLine(); 
		        System.out.print("Enter the person's occupation: ");
		        String occupation1 = scanner.nextLine();
		        System.out.println("Occupation: " + occupation1);

		        System.out.print("Enter the person's favorite color: ");
		        String favoriteColor1 = scanner.nextLine();
		        System.out.println("Favorite color: " + favoriteColor1);

		        System.out.print("Enter the current year: ");
		        int currentYear1 = scanner.nextInt();
		        System.out.println("Current year: " + currentYear1);

		        System.out.print("Enter the number of followers on a social media platform: ");
		        int followers1 = scanner.nextInt();
		        System.out.println("Followers: " + followers1);

		        System.out.print("Enter the rating of a movie: ");
		        float movieRating1 = scanner.nextFloat();
		        System.out.println("Movie rating: " + movieRating1);

		        scanner.nextLine(); 
		        System.out.print("Enter the person's blood type: ");
		        char bloodType1 = scanner.next().charAt(0);
		        System.out.println("Blood type: " + bloodType1);

		        scanner.nextLine(); 
		        System.out.print("Enter the title of a book: ");
		        String bookTitle1 = scanner.nextLine();
		        System.out.println("Book title: " + bookTitle1);
		        
		     
		        System.out.print("Enter the number of employees in a company: ");
		        int employees1 = scanner.nextInt();
		        System.out.println("Employees: " + employees1);

		        scanner.nextLine(); 
		        System.out.print("Enter the time of an event (e.g., 2:30 PM): ");
		        String eventTime1 = scanner.nextLine();
		        System.out.println("Event time: " + eventTime1);

		        System.out.print("Enter the name of a country: ");
		        String country1 = scanner.nextLine();
		        System.out.println("Country: " + country1);

		        System.out.print("Enter the person's eye color: ");
		        String eyeColor1 = scanner.nextLine();
		        System.out.println("Eye color: " + eyeColor1);

		        System.out.print("Enter the person's birthplace: ");
		        String birthplace1 = scanner.nextLine();
		        System.out.println("Birthplace: " + birthplace1);

		        System.out.print("Enter the distance between two cities (km): ");
		        double distance1 = scanner.nextDouble();
		        System.out.println("Distance: " + distance1 + " km");
	}

}
