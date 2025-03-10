package assignments;

public class Assignment2{

	public static void main(String[] args) {
		        // 3D array to represent semesters, subjects, and values (subject names and marks)
		        String[][][] data = {
		            {
		                {"Mathematics I", "78"},
		                {"Physics", "85"},
		                {"Chemistry", "91"},
		                {"Computer Programming", "74"},
		                {"Engineering Drawing", "88"},
		                {"Basic Electrical Eng.", "79"}
		            },
		            {
		                {"Mathematics II", "82"},
		                {"Mechanics", "77"},
		                {"Environmental Sci.", "93"},
		                {"Basic Electronics", "69"},
		                {"Engineering Physics", "84"},
		                {"Engineering Graphics", "90"}
		            },
		            {
		                {"Data Structures", "88"},
		                {"Discrete Mathematics", "81"},
		                {"Digital Electronics", "76"},
		                {"Operating Systems", "92"},
		                {"Signals and Systems", "85"},
		                {"Object-Oriented Prog.", "78"}
		            },
		            {
		                {"Algorithms", "91"},
		                {"Computer Networks", "73"},
		                {"Database Systems", "89"},
		                {"Microprocessors", "80"},
		                {"Communication Eng.", "76"},
		                {"Software Engineering", "87"}
		            },
		            {
		                {"Probability & Stats", "86"},
		                {"Machine Learning", "88"},
		                {"Compiler Design", "84"},
		                {"Theory of Computation", "95"},
		                {"Embedded Systems", "73"},
		                {"Computer Graphics", "90"}
		            }
		        };

		        // Print Semester 3 - Subject 4 and Subject 5 Names
		        System.out.println("Semester 3 - Subject 4: " + data[2][3][0]);
		        System.out.println("Semester 3 - Subject 5: " + data[2][4][0]);

		        // Print Semester 5 - Subject 3 and Subject 6 marks
		        System.out.println("Semester 5 - Subject 3 Marks: " + data[4][2][1]);
		        System.out.println("Semester 5 - Subject 6 Marks: " + data[4][5][1]);


	}

}