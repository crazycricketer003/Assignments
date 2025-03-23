package assignments;

public class Assignment6 {
    public static void main(String[] args) {
        String customerName = "John Doe";
        int creditScore = 720;
        double income = 55000.0;
        boolean isEmployed = true;
        double debtToIncomeRatio = 35.0;

        if (creditScore > 750) {
            System.out.println(customerName + " is eligible for the loan: Automatically approved based on credit score.");
        } else if (creditScore >= 650 && creditScore <= 750) {
            if (income >= 50000.0) {
                if (isEmployed) {
                    if (debtToIncomeRatio < 40.0) {
                        System.out.println(customerName + " is eligible for the loan.");
                    } else {
                        System.out.println(customerName + " is not eligible for the loan: Debt-to-Income ratio is too high.");
                    }
                } else {
                    System.out.println(customerName + " is not eligible for the loan: Employment status not met.");
                }
            } else {
                System.out.println(customerName + " is not eligible for the loan: Income is below $50,000.");
            }
        } else {
            System.out.println(customerName + " is not eligible for the loan: Credit score is too low.");
        }
    }
}


