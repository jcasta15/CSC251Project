import java.util.Scanner;//for user input

public class Project_jismely_castaneda
{
   public static void main(String[] args)
   {
   //main class
      Scanner keyboard = new Scanner(System.in); 
      
      // variables
      int polNumber;
      int polAge;
      String polName;
      String polFName;
      String polLName;
      String polSmokeStatus;
      double polHeight;
      double polWeight;
      
      //instantiate a Policy object
      Policy pol = new Policy();
            
      //getting the user input of the policy number
      System.out.print("Please enter the Policy Number: ");
      polNumber = keyboard.nextInt();
      pol.setPolicyNumber(polNumber); //using the setter
      keyboard.nextLine();

      
      //getting the user input of the provider's name
      System.out.print("Please enter the Provider Name: ");
      polName = keyboard.nextLine();
      pol.setProviderName(polName); //using the setter
      
      //getting the user input of the policyholder's first name
      System.out.print("Please enter the Policyholder's First Name: ");
      polFName = keyboard.nextLine();
      pol.setFirstName(polFName); //using the setter
      
      
      //getting the user input of the policyholder's last name
      System.out.print("Please enter the Policyholder's Last Name: ");
      polLName = keyboard.nextLine();
      pol.setLastName(polLName); //using the setter
      
      //getting the user input of the policyholder's age
      System.out.print("Please enter the Policyholder's Age: ");
      polAge = keyboard.nextInt();
      pol.setAge(polAge);
      keyboard.nextLine();
      
      //getting the user input of the policyholder's smoking status
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      polSmokeStatus = keyboard.nextLine();
      pol.setSmokingStatus(polSmokeStatus);
      
      //getting the user input of the policyholder's height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      polHeight = keyboard.nextDouble();
      pol.setHeight(polHeight);
      
      //getting the user input of the policyholder's weight
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      polWeight = keyboard.nextDouble();
      pol.setWeight(polWeight);
      
      keyboard.close(); //close the scanner object

      
      //output
      System.out.println("\nPolicy Number: " + polNumber);
      System.out.println("Provider Name: " + polName);
      System.out.println("Policyholder's First Name: " + polFName);
      System.out.println("Policyholder's Last Name: " + polLName);
      System.out.println("Policyholder's Age: " + polAge);
      System.out.println("Policyholder's Smoking Status: " + polSmokeStatus);
      System.out.println("Policyholder's Height: " + polHeight + " inches");
      System.out.println("Policyholders's Weight: " + polWeight + " pounds");
      System.out.printf("Policyholder's BMI %.2f\n", pol.getCalculateBMI()); //using getters to get the BMI
      System.out.printf("Policy Price: $%.2f%n", pol.getCalculatePolicyPrice(polAge, polSmokeStatus, pol.getCalculateBMI())); //using getters to get the policy price

    
   }
}

  
